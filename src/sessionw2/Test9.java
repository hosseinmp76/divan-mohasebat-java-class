package sessionw2;

import java.util.Scanner;

public class Test9 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		String name = scanner.next();

		System.out.print("salam ");
		System.out.println(name);

		String p = "salam ";

		String result = "salam" + name;

		System.out.println(result);
	}

}
