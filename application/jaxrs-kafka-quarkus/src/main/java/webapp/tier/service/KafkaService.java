package webapp.tier.service;

import java.security.NoSuchAlgorithmException;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.enterprise.context.ApplicationScoped;

import org.eclipse.microprofile.config.inject.ConfigProperty;
import org.eclipse.microprofile.reactive.messaging.Incoming;
import org.eclipse.microprofile.reactive.messaging.Outgoing;

import io.smallrye.reactive.messaging.annotations.Broadcast;
import io.smallrye.reactive.messaging.annotations.Merge;
import webapp.tier.bean.LatestMessage;
import webapp.tier.util.CreateId;
import webapp.tier.util.MsgBeanUtils;

@ApplicationScoped
public class KafkaService {

	private static final Logger LOG = Logger.getLogger(KafkaService.class.getSimpleName());

	@ConfigProperty(name = "common.message")
	String message;
	@ConfigProperty(name = "kafka.splitkey")
	String splitkey;

	@Incoming("message")
	@Outgoing("in-memory-message")
	@Merge(Merge.Mode.MERGE)
	@Broadcast
	public String messegeToMemory(String msg) {
		LOG.log(Level.INFO, "Received: {0}", msg);
		LatestMessage.setLatestMsg(msg);
		return msg;
	}

	public String publishMsg() throws NoSuchAlgorithmException {
		MsgBeanUtils msgbean = new MsgBeanUtils(CreateId.createid(), message);
		msgbean.createBody(msgbean, splitkey);
		msgbean.setFullmsgWithType(msgbean, "Publish");
		LOG.info(msgbean.getFullmsg());
		return msgbean.getFullmsg();
	}
}
