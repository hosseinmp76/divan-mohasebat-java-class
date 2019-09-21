package session4;

import java.util.Scanner;

public class ArraySort {

	public static int[] copyArray(int start, int[] ar) {
		int[] res = new int[ar.length - start];
		int index = 0;
		for (int i = start; i < ar.length; i++) {
			res[index] = ar[i];
			index++;
		}
		return res;
	}

	public static int findBiggestIndex(int[] ar) {
		int biggestIndex = 0;
		int biggestNumber = ar[0];

		for (int i = 0; i < ar.length; i++) {
			if (ar[i] > biggestNumber) {
				System.out.println(i + " " + biggestNumber + " " + ar[i]);
				biggestIndex = i;
				biggestNumber = ar[i];
			}
		}
		return biggestIndex;
	}

	public static int[] swap(int i, int j, int[] ar) {
		int temp = ar[i];
		ar[i] = ar[j];
		ar[j] = temp;
		return ar;
	}

	public static int[] sortArray(int[] ar) {
		for (int i = 0; i < ar.length; i++) {
			int[] remainArray = copyArray(i, ar);
			int index = findBiggestIndex(remainArray);
			ar = swap(i, index, ar);
		}
		return ar;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner inputScanner = new Scanner(System.in);
		int n = inputScanner.nextInt();
		int[] ar = new int[n];

		for (int i = 0; i < n; i++)
			ar[i] = inputScanner.nextInt();

		ar = sortArray(ar);
		ar = copyArray(2, ar);
		System.out.println(findBiggestIndex(ar));
		for (int i = 0; i < ar.length; i++) {
			System.out.print(ar[i] + " ");
		}

	}

}
