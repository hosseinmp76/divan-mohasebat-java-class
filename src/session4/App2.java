package session4;

import java.util.Scanner;

public class App2 {

	public static int zigma(int limit) {
		int sum = 0;
		for (int i = 1; i <= limit; i++) {
			sum += i;
		}
		return sum;
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("enter the limit");
		int n = input.nextInt();
		int sum = 0;
		for (int i = 1; i <= n; i++) {
			sum = sum + zigma(i);
		}
		System.out.println(sum);
	}

}
