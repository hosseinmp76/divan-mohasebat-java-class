package session6;

import java.util.Scanner;

public class ClassIntro {

	public static int findBiggestIndex(int[] ar) {
		int biggestIndex = 0;
		int biggestNumber = ar[0];

		for (int i = 0; i < ar.length; i++) {
			if (ar[i] > biggestNumber) {
//				System.out.println(i + " " + biggestNumber + " " + ar[i]);
				biggestIndex = i;
				biggestNumber = ar[i];
			}
		}
		return biggestIndex;
	}

	public static void main(String[] args) {

		int n;
		int[] X, Y, R;
		Scanner input = new Scanner(System.in);
		n = input.nextInt();
		X = new int[n];
		Y = new int[n];
		R = new int[n];

		for (int i = 0; i < n; i++) {
			X[i] = input.nextInt();
			Y[i] = input.nextInt();
			R[i] = input.nextInt();
		}

		int biggestIndex = findBiggestIndex(R);

	}
}
