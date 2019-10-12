package session10;

public class Circle extends Shape {

	// Fields
	double r;
	Point center;

	// constructors
	public Circle(String color, Point c, double r2) {
		super(color);
		this.center = c;
		this.r = r2;
	}

	public Circle(double x, double y, double r2) {
		this("abi", new Point(x, y), r2);
	}

	// methods

	@Override
	public double Area() {
		return this.r * this.r * Math.PI;
	}
}
