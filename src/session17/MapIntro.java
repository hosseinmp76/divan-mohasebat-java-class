package session17;

import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class MapIntro {

	public static void main(String[] args) {
		List<Integer> i1;
		Map<String, Human> people = new HashMap<String, Human>();
		Human h1 = new Human("rahim", 1033333, "bejani");
		people.put("ekhtelasgar", h1);
		people.remove("ekhtelasgar");
//		Human h2 = people.get("hossein");
		Human h3 = people.get("ekhtelasgar");
//		System.out.println(h2.name);
		System.out.println(h3.name);
//		System.out.println(h1 == h2);
		boolean hasKey = people.containsKey("123");
		boolean hasValue = people.containsValue("value 1");

		Set entries = people.entrySet();
		Iterator<Human> iterator = entries.iterator();
		while (iterator.hasNext()) {
			Map.Entry entry = (Map.Entry) iterator.next();
			Object key = entry.getKey();
			Object value = entry.getValue();
		}
	}

}
