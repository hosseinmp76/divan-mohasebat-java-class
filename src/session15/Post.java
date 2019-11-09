package session15;

public class Post {

	String hallName, userName, discussionName;

	public Post(String hallName, String userName, String discussionName) {
		super();
		this.hallName = hallName;
		this.userName = userName;
		this.discussionName = discussionName;
	}

	public String getHallName() {
		return hallName;
	}

	public void setHallName(String hallName) {
		this.hallName = hallName;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getDiscussionName() {
		return discussionName;
	}

	public void setDiscussionName(String discussionName) {
		this.discussionName = discussionName;
	}

}
