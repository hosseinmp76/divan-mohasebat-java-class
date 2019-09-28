package session6;

import java.util.Scanner;

public class FindBiggest {

	public static void main(String[] args) {
		Scanner inputReader = new Scanner(System.in);

		int n;

		n = inputReader.nextInt();

		int[] inputNumbers = new int[n];

		int index = 0;
		while (index < n) {
			inputNumbers[index] = inputReader.nextInt();
			index++;
		}

//		for (int i = 0; i < n; i++) {
//			System.out.println(inputNumbers[i]);
//		}

//		if() {
//			int x;
//			if() {
//				int y;
//				while() {
//					int z;
//				}
//				
//			}
//		}

		int biggetsNumber = inputNumbers[0];
		for (int i = 1; i < n; i++) {
			biggetsNumber = Math.max(inputNumbers[i], biggetsNumber);
//			if (inputNumbers[i] > biggetsNumber)
//				biggetsNumber = inputNumbers[i];
		}

		System.out.println(Math.sqrt(biggetsNumber));
	}

}
