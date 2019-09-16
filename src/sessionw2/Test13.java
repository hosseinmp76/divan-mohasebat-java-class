package sessionw2;

import java.util.Scanner;

public class Test13 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int n = scanner.nextInt();
		int m = scanner.nextInt();

		int result = m;
		boolean flag = false;
		while (result > 0 && flag == false) {
			if (n % result == 0 && m % result == 0) {
				System.out.println(result);
				flag = true;
			}
			result--;
		}
	}

}
