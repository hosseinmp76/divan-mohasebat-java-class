package session14;

public class User {

	String name;
	UserType type;

	public User() {
		this.type = UserType.admin;

	}

	public User(String name) {
		super();
		this.name = name;
		System.currentTimeMillis();
	}

	public User(String name, UserType type) {
		super();
		this.name = name;
		this.type = type;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public UserType getType() {
		return type;
	}

	public void setType(UserType type) {
		this.type = type;
	}

	public void removePost(int postID) {
		if (this.type == UserType.admin) {

		}
		throw new RuntimeException();
	}
}
