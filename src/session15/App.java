package session15;

import java.util.List;
import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		Forum f = new Forum();

//		int pid = 2;
//		f.getHalls().stream().filter(h -> h.getDiscussions().stream()
//				.filter(d -> d.getPosts().stream().filter(p -> p.ID == pid).count() > 0).count() > 0).toArray();
		Scanner input = new Scanner(System.in);

		while (true) {
			int command = input.nextInt();
			switch (command) {
			case 1: {
				String userName = input.next();
				String pass = input.next();
				int t = input.nextInt();
				f.newUser(userName, pass, (t == 0) ? UserType.admin : UserType.user);
				break;
			}
			case 2: {
				String hallName = input.next();
				f.newHall(hallName);
				break;
			}
			// new Post
			case 3: {
				String userName = input.next();
				String hallName = input.next();
				int discussionID = input.nextInt();
				String message = input.next();

				User sender = f.getUserByUserName(userName);
				Post p = new Post(hallName, discussionID, message, sender, -1);

				Hall h = f.getHall(p.hallName);
				Discussion d = h.getDiscussion(discussionID);

				d.newPost(p);
				break;
			}

			case 4: {
				String hallName = input.next();
				String discussionName = input.next();
				Hall h = f.getHall(hallName);
				Discussion d = new Discussion(discussionName);
				h.newDiscussion(d);
				break;
			}
			case 5: {
				String userName = input.next();
				String hallName = input.next();
				int disID = input.nextInt();
				int replyID = input.nextInt();

				String message = input.next();

				User sender = f.getUserByUserName(userName);
				Post p = new Post(hallName, disID, message, sender, replyID);
				Hall h = f.getHall(p.hallName);
				Discussion d = h.getDiscussion(disID);
				d.newPost(p);
				break;
			}
			// make admin in hall
			case 6: {
				String hallName = input.next();
				String userName = input.next();

				User u = f.getUserByUserName(userName);
				u.changeToAdminInHall(hallName);
				break;
			}

			case 7: {
				String hallName = input.next();
				int discussionID = input.nextInt();
				int postID = input.nextInt();

				String userName = input.next();

				Hall h = f.getHall(hallName);
				User u = f.getUserByUserName(userName);
				boolean b = u.isAdminInHall(hallName);

				if (b == false)
					throw new RuntimeException();

				Discussion d = h.getDiscussion(discussionID);

				d.removePost(postID);
				break;
			}
			case 8: {
				String hallName = input.next();
				int discussionID = input.nextInt();
				int postID = input.nextInt();

				System.out.println(f.getHall(hallName).getDiscussion(discussionID).getPost(postID).message);
				break;
			}
			case 9: {
				String hallName = input.next();
				int discussionID = input.nextInt();
				int postID = input.nextInt();

				List<Post> posts = f.getHall(hallName).getDiscussion(discussionID).getPosts();
				for (Post post : posts) {
					System.out.println(post.message);
				}
				break;
			}
			case 10: {
				String hallName = input.next();

				List<Discussion> discussions = f.getHall(hallName).getDiscussions();
				for (Discussion dis : discussions) {
					System.out.println(dis.name);
				}
			}
			case 11: {
				String hallName = input.next();
				int discussionID = input.nextInt();
				int postID = input.nextInt();

				System.out.println(f.getHall(hallName).getDiscussion(discussionID).getPost(postID).sender);
				break;
			}
			default:
				break;
			}
		}
	}
}
