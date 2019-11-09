package session15;

import java.util.ArrayList;
import java.util.List;

public class Forum {

	private List<User> users;
	private List<Hall> halls;

	public Forum() {
		this.users = new ArrayList<User>();
		this.halls = new ArrayList<Hall>();
	}

	public void newHall(String hallName) {
		Hall t = new Hall(hallName);
		this.halls.add(t);
	}

	public void newUser(String hallName) {
		User t = new User(hallName);
		this.users.add(t);
	}

	public Hall getHall(String hallName) {
		for (int i = 0; i < this.halls.size(); i++) {
			if (this.halls.get(i).getName().equals(hallName))
				return this.halls.get(i);
		}
		throw new RuntimeException();
	}
}
