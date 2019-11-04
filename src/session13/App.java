package session13;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyModel h = new MyModel();
		h = new MyModel();

//		SortableClass s = new SortableClass();
		h.setName("Ali");

		int x = h.hoghogh();

		h.addAccount(null);

		Employee e = h;
		e.changeHour();
		e.hoghogh();

		Moveable[] objects = new Moveable[5];

		objects[0] = new Car();
		objects[1] = new Human();

		for (int i = 0; i < 5; i++) {
			objects[i].move();
		}

	}
}
