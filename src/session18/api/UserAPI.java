package session18.api;

import session18.manager.ForumMgr;
import session18.model.User;

public class UserAPI {

	public User newUser(String userName, String pass, int userType) {
		User u = new User();
		ForumMgr.addUser(u);
		return u;
	}
}
