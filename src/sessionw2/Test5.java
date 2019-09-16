package sessionw2;

import java.util.Scanner;

public class Test5 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int input = scanner.nextInt();

		int counter = 0;

		int mod = input % 2;
		while (counter < input) {

			if (mod == 0) {
				System.out.println("salam");
			} else {
				System.out.println("nasalam");
			}
			counter = counter + 1;
		}

	}

}
