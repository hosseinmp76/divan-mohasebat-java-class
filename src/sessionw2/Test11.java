package sessionw2;

import java.util.Scanner;

public class Test11 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int number = scanner.nextInt();

		int girlPopulation = 0;
		int boyPopulation = 0;

		for (int index = 0; index < number; index++) {
			String s = scanner.next();
			if (s == "boy") {
				boyPopulation++;
			} else if (s == "girl")
				girlPopulation++;
		}

		System.out.println(girlPopulation);
	}

}
