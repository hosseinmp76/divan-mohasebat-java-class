package session6;

import java.io.File;

public class ExceptionHandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		while (true) {
			try {
				int a = 7, b = 5;
				int c = a / b;
				new File("g");
				break;
			} catch (ArithmeticException e) {
				System.out.println(e.getCause());
			} catch (RuntimeException e) {
				System.out.println("d");
			}
		}
		System.out.println("d");

		for (int i = 0; i < args.length; i++) {
			if (i == 6)
				break;
		}
	}

}
