package session18.api;

import session18.model.Hall;

public class HallAPI {

	public Hall newHall(String name) {
		Hall h = new Hall(name);

		return h;
	}
}
