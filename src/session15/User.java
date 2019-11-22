package session15;

import java.util.ArrayList;
import java.util.List;

public class User extends Object {

	String name;
	String pass;
	String userID;
	UserType userType;
	int reputaion;
	List<String> adimnInHalls;

	public User(String name, String pass, UserType userType, int reputaion) {
		super();
		this.name = name;
		this.pass = pass;
		this.userType = userType;
		this.reputaion = reputaion;
		this.adimnInHalls = new ArrayList<String>();
	}

	public String getUserID() {
		return userID;
	}

	public void setUserID(String userID) {
		this.userID = userID;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPass() {
		return pass;
	}

	public void setPass(String pass) {
		this.pass = pass;
	}

	public UserType getUserType() {
		return userType;
	}

	public void setUserType(UserType userType) {
		this.userType = userType;
	}

	public int getReputaion() {
		return reputaion;
	}

	public void setReputaion(int reputaion) {
		this.reputaion = reputaion;
	}

	public void changeToAdminInHall(String hallName) {
		this.adimnInHalls.add(hallName);
	}

	public boolean isAdminInHall(String hallName) {
		for (String hall : this.adimnInHalls) {
			if (hall.equals(hallName))
				return true;
		}
		return false;
	}

	@Override
	public String toString() {
		return this.name;
	}
}
