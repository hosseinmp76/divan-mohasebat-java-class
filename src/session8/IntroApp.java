package session8;

public class IntroApp {
	public static void main(String[] args) {
		int a = 333;
		Car c1 = new Car(a);
		Car c2 = new Car(1121, "red", 3);
//		Car c3 = new Car();
		Human h1 = new Human();
		c1.color = "dd";
		c1.move(44);
	}
}
