package webapp.tier.service.socket;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.enterprise.context.ApplicationScoped;
import javax.websocket.OnClose;
import javax.websocket.OnError;
import javax.websocket.OnMessage;
import javax.websocket.OnOpen;
import javax.websocket.Session;
import javax.websocket.server.ServerEndpoint;

@ServerEndpoint("/quarkus/rabbitmq/subscribe")
@ApplicationScoped
public class RabbitmqSocket {

	private static final Logger LOG = Logger.getLogger(RabbitmqSocket.class.getSimpleName());
	Map<String, Session> sessions = new ConcurrentHashMap<>();

	public Map<String, Session> getSessions() {
		return this.sessions;
	}

	@OnOpen
	public void onOpen(Session session) {
		sessions.put(session.getId(), session);
		LOG.log(Level.INFO, "open : {0}", session.getId());
	}

	@OnClose
	public void onClose(Session session) {
		sessions.remove(session.getId());
		LOG.log(Level.INFO, "close : {0}", session.getId());
	}

	@OnError
	public void onError(Session session, Throwable throwable) {
		sessions.remove(session.getId());
		LOG.logp(Level.SEVERE, "error : {0}{1}", session.getId(), throwable.getMessage());
	}

	@OnMessage
	public void onMessage(String message) {
		if (sessions.isEmpty()) {
			LOG.log(Level.INFO, "No Subscriber");
		} else {
			sessions.values().forEach(s -> {
				LOG.log(Level.INFO, "Send : {0}", s.getId());
				s.getAsyncRemote().sendObject(message, result -> {
					if (result.getException() != null) {
						LOG.log(Level.SEVERE, "Unable to send message", result.getException());
					}
				});
			});
		}
	}
}