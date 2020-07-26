package webapp.tier.bean;

import webapp.tier.util.MsgUtils;

public class MsgBean {

	int id;
	String message;
	String fullmsg = "MsgBean init error";

	public MsgBean() {
	}

	public MsgBean(int id, String message) {
		setId(id);
		setMessage(message);
	}

	/**
	* Class constructor specifying number of objects to create.
	*
	* @param id int number of id
	* @param message message
	* @param type message type that the message comes from
	*
	*/
	public MsgBean(int id, String message, String type) {
		this.id = id;
		this.message = message;
		setFullmsg(type);
	}

	/**
	* Class constructor specifying number of objects to create.
	*
	* @param id String number of id
	* @param message message
	* @param type message type that the message comes from
	*
	*/
	public MsgBean(String id, String message, String type) {
		this.id = MsgUtils.stringToInt(id);
		this.message = message;
		setFullmsg(type);
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public void setFullmsg(String type) {
		this.fullmsg = type + " : id: " + getId() + ", message: " + getMessage();
	}

	public String getFullmsg() {
		return fullmsg;
	}
}
