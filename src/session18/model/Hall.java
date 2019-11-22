package session18.model;

import java.util.List;

public class Hall {
	String name;
	List<Discussion> discussions;

	public Hall(String name2) {
		this.name = name2;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Discussion> getDiscussions() {
		return discussions;
	}

	public Discussion getDiscussion(int id) {
		for (Discussion d : this.discussions) {
			if (d.id == id)
				return d;
		}
		throw new RuntimeException();
	}
}
