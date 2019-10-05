package session8;

public class Car extends Human {
	int number;
	String color;
	int year;
	int sokht;
	Human owner;

	public Car(int number) {
		this.number = number;
		this.sokht = 0;
	}

	public Car(int n, String c) {
		this.number = n;
		this.color = c;
		this.sokht = 0;
	}

	public Car(int n, String c, int s) {
		this.number = n;
		this.color = c;
		this.sokht = s;
	}

	public int move(int kilometer) {
		this.sokht = this.sokht - kilometer;
		return this.sokht;
	}
}
