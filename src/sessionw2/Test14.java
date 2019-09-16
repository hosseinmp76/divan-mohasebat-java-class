package sessionw2;

import java.util.Scanner;

public class Test14 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int n = scanner.nextInt();
		int m = scanner.nextInt();

		int result = 1;
		int index = 1;
		while (index <= m) {
			if (n % index == 0 && m % index == 0) {
				result = index;
			}
			index++;
		}
		System.out.println(result);
	}
}
