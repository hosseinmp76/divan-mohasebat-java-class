package session9;

import java.util.Scanner;

public class App2 {

	public static void main(String[] args) {

		Zoo[] zs = new Zoo[5];

		zs[0] = new Zoo();

		Zoo z = new Zoo();
		zs[1] = z;
		zs[1].name = "rr";
		z.name = "f";
		System.out.println(zs[1].name);

		Scanner input = new Scanner(System.in);
		Zoo[] zs2 = new Zoo[input.nextInt()];
		for (int i = 0; i < zs2.length; i++) {
			zs2[i] = new Zoo();
			zs2[i].name = input.next();
			zs2[i].manager = new Worker();
			zs2[i].manager.name = input.next();
		}

		Lion l = new Lion();
		l.eat(4);
		Sheap s = new Sheap();
		s.eat(6);
	}

}
