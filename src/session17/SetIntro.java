package session17;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetIntro {

	public static void main(String[] args) {
		Set<Human> people = new HashSet<Human>();
		Human h1 = new Human("hossein", 10, "mahdavipour");
		people.add(h1);
		Iterator<Human> iterator = people.iterator();
		while (iterator.hasNext()) {
			Human h2 = iterator.next();
			System.out.println(h2);
			System.out.println(h1 == h2);
		}
		people.remove(h1);
		people.size();
		people.contains(h1);

	}

}
