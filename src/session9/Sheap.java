package session9;

public class Sheap extends Animal {

	@Override
	public void eat(int w) {
		this.weight = (int) (this.weight + (0.5 * w));
	}
}
