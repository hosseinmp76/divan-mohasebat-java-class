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
		discussions = new ArrayList<Discussion>();
	}

	public Discussion getDiscussion(String discussionName) {
		for (int i = 0; i < this.discussions.size(); i++) {
			if (this.discussions.get(i).getName().equals(discussionName))
				return this.discussions.get(i);
		}
		throw new RuntimeException();
	}

}
