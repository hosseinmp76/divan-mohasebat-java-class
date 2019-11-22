package session15;

import java.util.Date;

public class Post {

	String hallName, message;
	int discussionID;

	private static int population = 0;
	User sender;

	int ID;

	public Post(String hallName, int discussionID, String message, User sender, int replyPostID) {
		super();
		this.hallName = hallName;
		this.discussionID = discussionID;
		this.message = message;
		this.sender = sender;
		this.replyPostID = replyPostID;
		this.ID = population++;
		this.sendDate = new Date(System.currentTimeMillis());
	}

	Date sendDate;
	int replyPostID;

	public int getReplyPostID() {
		return replyPostID;
	}

	public void setReplyPostID(int replyPostID) {
		this.replyPostID = replyPostID;
	}

	public String getHallName() {
		return hallName;
	}

	public void setHallName(String hallName) {
		this.hallName = hallName;
	}

}
