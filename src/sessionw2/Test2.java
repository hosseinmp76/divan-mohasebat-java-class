package sessionw2;

import java.util.Scanner;

public class Test2 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int input;
		input = scanner.nextInt();
		int result = 0;

		int helper = input % 10;
		result = helper;

		result = result * 10;
		input = input / 10;

		helper = input % 10;
		result = result + helper;

		result = result * 10;
		input = input / 10;

		// input /= 10;
		helper = input % 10;
		result = result + helper;
		// result += helper;
		System.out.println(result);
	}

}
