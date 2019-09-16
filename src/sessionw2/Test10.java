package sessionw2;

import java.util.Scanner;

public class Test10 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int number = scanner.nextInt();

		int index = 0;
		while (index < number) {
			int hour = scanner.nextInt();
			System.out.println(hour * 10);
			index++;
		}

//		for (int index2 = 0; index2 < number; index2++) {
//
//		}
	}

}
