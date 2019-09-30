package session7;

import java.util.Date;
import java.util.Random;

public class ExampleClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Date date = new Date(33);
		Date date2 = new Date(3333);
		System.out.println(date2);
		System.out.println(date2.after(date));

		System.out.println(date.getYear());

		Random random = new Random();
		System.out.println(random.nextInt());
		System.out.println(random.nextDouble());
		System.out.println(random.nextInt(4));

	}

}
