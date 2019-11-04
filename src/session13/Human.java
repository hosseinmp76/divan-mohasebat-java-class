package session13;

public class Human extends SortableClass implements Moveable {
	private String name;

	private int weight;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public boolean comapre(Human c) {
		if (this.weight > c.weight)
			return true;
		return false;
	}

	@Override
	public void move() {
		// TODO Auto-generated method stub

	}

	@Override
	public void eat() {
		this.weight += 3;

	}

	@Override
	public void f() {
		// TODO Auto-generated method stub

	}

}
