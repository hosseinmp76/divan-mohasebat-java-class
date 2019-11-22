package session15;

import java.util.ArrayList;
import java.util.List;

public class Hall {
	String name;
	private static int population = 0;
	List<Discussion> discussions;
	private int hallID;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Discussion> getDiscussions() {
		return discussions;
	}

	public int getHallID() {
		return hallID;
	}

	public Hall(String hallName) {
		this.hallID = population;
		population++;
		this.name = hallName;
		discussions = new ArrayList<Discussion>();
	}

	public Discussion getDiscussion(int discussionID) {
		for (int i = 0; i < this.discussions.size(); i++) {
			if (this.discussions.get(i).getiD() == discussionID)
				return this.discussions.get(i);
		}
		throw new RuntimeException("no such Discussion in hall " + this.getName());
	}

	public void newDiscussion(Discussion d) {
		this.discussions.add(d);
	}
}
