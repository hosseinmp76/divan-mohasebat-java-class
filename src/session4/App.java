package session4;

import java.util.Scanner;

public class App {

	public static int zigma(int limit) {
		int sum = 0;
		for (int i = 1; i <= limit; i++) {
			sum += i;
		}
		return sum;
	}

	public static void main(String[] args) {
		Scanner inputScanner = new Scanner(System.in);
		int n = inputScanner.nextInt();
		int sum = zigma(n);
		System.out.println(sum);

	}

}
