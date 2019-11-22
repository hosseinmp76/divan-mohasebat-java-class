package session18.manager;

import session18.model.Hall;
import session18.model.User;
import session18.uI.console.App;

public class ForumMgr {

	public static void addUser(User u) {
		App.forum.users.add(u);
	}

	public static void addHall(Hall u) {
		App.forum.halls.add(u);
	}
}
