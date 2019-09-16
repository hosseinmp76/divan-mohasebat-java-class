package sessionw2;

import java.util.Scanner;

public class Test15 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int limit = scanner.nextInt();
		for (int i = 1; i < limit; i++) {
			int number = i;

			int result = 0;
			while (number > 0) {
				result = (result * 10) + (number % 10);
				number /= 10;
			}

			if (result == i)
				System.out.println(result);
		}
	}
}
