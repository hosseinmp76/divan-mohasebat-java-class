package session15;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		Forum f = new Forum();

		Scanner input = new Scanner(System.in);

		while (true) {
			int command = input.nextInt();
			switch (command) {
			case 1: {
				String userName = input.next();
				f.newUser(userName);
				break;
			}
			case 2: {
				String hallName = input.next();
				f.newHall(hallName);
				break;
			}
			case 3: {
				String hallName = input.next();
				String userName = input.next();
				String discussionName = input.next();

				Post p = new Post(hallName, userName, discussionName);
				Hall h = f.getHall(p.hallName);
				Discussion d = h.getDiscussion(discussionName);
				d.newPost(p);
				break;
			}
			default:
				break;
			}
		}
	}
}
