package session4;

import java.util.Scanner;

public class ArrayIntro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		int value = input.nextInt();
		int[] hour = new int[n];
		String[] names = new String[n];

		int sum = 0;
		for (int i = 0; i < n; i++) {
			hour[i] = input.nextInt();
			names[i] = input.next();
			sum += hour[i];
		}

		double[] incomes = new double[n];
		for (int i = 0; i < n; i++) {
			incomes[i] = hour[i] * ((double) value / sum);

		}

	}

}
