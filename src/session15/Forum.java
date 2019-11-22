package session15;

import java.util.ArrayList;
import java.util.List;

public class Forum {

	private List<User> users;
	private List<Hall> halls;

	public List<User> getUsers() {
		return users;
	}

	public void setUsers(List<User> users) {
		this.users = users;
	}

	public List<Hall> getHalls() {
		return halls;
	}

	public void setHalls(List<Hall> halls) {
		this.halls = halls;
	}

	public Forum() {
		this.users = new ArrayList<User>();
		this.halls = new ArrayList<Hall>();
	}

	public void newHall(String hallName) {
		Hall t = new Hall(hallName);
		this.halls.add(t);
	}

	public void newUser(String hallName, String pass, UserType type) {
		User t = new User(hallName, pass, type, 0);
		this.users.add(t);
	}

	public Hall getHall(String hallName) {
		for (int i = 0; i < this.halls.size(); i++) {
			if (this.halls.get(i).getName().equals(hallName))
				return this.halls.get(i);
		}
//		for (Hall h : this.halls) {
//			if (h.getName().equals(hallName))
//				return h;
//		}
		throw new RuntimeException("No such Hall");
	}

	public User getUserByUserName(String userName) {
		for (int i = 0; i < this.users.size(); i++) {
			if (this.users.get(i).getName().equals(userName))
				return this.users.get(i);
		}
		throw new RuntimeException();
	}

}
