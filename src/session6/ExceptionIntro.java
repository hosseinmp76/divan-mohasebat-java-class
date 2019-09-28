package session6;

import java.util.Scanner;

public class ExceptionIntro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a, b;
		a = 4;
		b = 0;
//		System.out.println(a / b);

		int[] ar = new int[5];
//		System.out.println("a");
//		System.out.println(ar[0]);
//		System.out.println("b");
////		System.out.println(ar[-1]);
//		System.out.println("c");
////		System.out.println(ar[8]);
//		System.out.println("d");

		Scanner input = new Scanner(System.in);

		try {
			int number = input.nextInt();
			System.out.println(number);
			System.out.println(ar[number]);

		} catch (Exception e) {
//			e.printStackTrace();
			System.out.println("salam");
		}
		System.out.println("end");

		int n = 7;
		for (int i = 0; i < n; i++) {
			int y;
			try {
				input.nextInt();
			} catch (Exception e) {
				// TODO: handle exception
			}
		}

	}

}
