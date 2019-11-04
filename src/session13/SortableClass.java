package session13;

import java.util.Arrays;

public abstract class SortableClass {

	int x;
	String g;

	public void sort(Comparable[] ar) {
		Arrays.sort(ar);
	}

	public abstract void eat();
}
