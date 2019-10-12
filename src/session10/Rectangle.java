package session10;

public class Rectangle extends Shape {

	Point lu, rd;

	public Rectangle(Point lu2, Point rd2) {
		this.lu = lu2;
		this.rd = rd2;
	}

	public Rectangle(double lux, double luy, double rdx, double rdy) {
		this.lu = new Point(lux, luy);
		this.rd = new Point(rdx, rdy);
	}

	@Override

	public double Area() {
		return Math.abs((this.rd.x - this.lu.x) * (this.lu.y - this.rd.y));
	}
}
