package session10;

public class App {

	public void sort(Shape[] ar) {
		ar[0].Area();
	}

	public static void main(String[] args) {
		Circle c1 = new Circle(3, 4, 5);
		System.out.println(c1.Area());

		Point p1 = new Point(3, 4);
//		Circle c2 = new Circle(p1, 5);
//		System.out.println(c2.Area());

		Triangle t1 = new Triangle("red");
		try {
			System.out.println(t1.Area());
		} catch (Exception rrrrrrr) {
//			System.out.println(rrrrrrr.getCause());
			System.out.println("we can not evalute triangle Area");
		}

		Rectangle r1 = new Rectangle(1, 2, 3, 4);
		System.out.println(r1.Area());

		Point p2 = new Point(1, 2);
		Point p3 = new Point(3, 4);
		Rectangle r2 = new Rectangle(p2, p3);
		System.out.println(r2.Area());

		System.out.println("end of the game");
	}
}
