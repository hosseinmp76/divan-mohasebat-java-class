package session10;

public class Triangle extends Shape {

	Point p1, p2, p3;

	@Override
	public double Area() {
		RuntimeException e = new RuntimeException();
		throw e;
	}

}
