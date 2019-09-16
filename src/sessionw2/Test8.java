package sessionw2;

import java.util.Scanner;

public class Test8 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int base = scanner.nextInt();
		int power = scanner.nextInt();

		int index = 0;

		int result = 1;
		while (index < power) {
			result = result * base;
			index = index + 1;
		}

		System.out.println(result);
	}

}
