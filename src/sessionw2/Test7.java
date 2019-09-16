package sessionw2;

import java.util.Scanner;

public class Test7 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int limit = scanner.nextInt();
		int step = scanner.nextInt();
		int index = 1;
		while (index < limit) {
			if (index % step == 0) {
				System.out.println("hoop");
			} else {
				System.out.println(index);
			}
			index = index + 1;
		}
	}

}
