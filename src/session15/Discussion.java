package session15;

import java.util.List;

public class Discussion {

	int iD;
	int hallID;
	String starterUser;
	String name;

	List<Post> posts;

	public Discussion(String discussionName) {
		this.name = discussionName;
	}

	public int getHallID() {
		return hallID;
	}

	public void setHallID(int hallID) {
		this.hallID = hallID;
	}

	public String getStarterUser() {
		return starterUser;
	}

	public void setStarterUser(String starterUser) {
		this.starterUser = starterUser;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Post> getPosts() {
		return posts;
	}

	public void setPosts(List<Post> posts) {
		this.posts = posts;
	}

	public int getiD() {
		return iD;
	}

	public void newPost(Post p) {
		this.posts.add(p);
	}

	public void newReply(Post p) {
		this.posts.add(p);
	}

	public Post getPost(int postID) {
		for (int i = 0; i < this.posts.size(); i++) {
			if (this.posts.get(i).ID == postID)
				return this.posts.get(i);
		}
		throw new RuntimeException();

	}

	public void removePost(int postID) {
		int index = -1;
		for (int i = 0; i < this.posts.size(); i++) {
			if (this.posts.get(i).ID == postID) {
				index = i;
				break;
			}

		}
		if (index == -1)
			throw new RuntimeException("No such post");
		this.posts.remove(index);

	}
}
