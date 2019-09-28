package session6;

import java.util.Scanner;

public class App {
//	public static double area(Circle c) {
//		return 3.14 * c.r * c.r;
//	}
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
//		Circle[] cirles = new Circle[7];
		int y = input.nextInt();
		Circle c = new Circle();
		Circle c2 = new Circle();
		c.x = 4;
		c.y = 6;

		c.r = 1;
		c2.r = 9;

		c.increaseR(4);
		System.out.println(c.area());
		System.out.println(c.r);
	}
}

class Circle {
	int x, y, r;

	public void increaseR(int newR) {
		this.r += newR;
		this.area();
	}

	public double area() {
		return 3.14 * r * r;
	}

}

class MyScanner {
}