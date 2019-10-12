package session9;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		int numberOfAnimals;

		numberOfAnimals = input.nextInt();

		Animal[] ar = new Animal[numberOfAnimals];

		Zoo[] zs = new Zoo[10];
		for (int i = 0; i < numberOfAnimals; i++) {
			String name = input.next();
			int weight = input.nextInt();

			Animal a = new Animal();
			a.name = name;
			a.weight = weight;

			ar[i] = a;
		}

		zs[0].animals = ar;
		for (int i = 0; i < 10; i++) {
			zs[i] = new Zoo();
			zs[i].name = input.next();
			Worker man = new Worker();
			man.name = input.next();
//			zs[i].setManager(man);
		}

		for (int i = 0; i < numberOfAnimals; i++) {
			String name = input.next();
			int weight = input.nextInt();

			Animal a = new Animal();
			a.name = name;
			a.weight = weight;

			ar[i] = a;
		}

		zs[0].animals = ar;

		for (int i = 0; i < numberOfAnimals; i++) {
			String name = input.next();
			int weight = input.nextInt();

			Animal a = new Animal();
			a.name = name;
			a.weight = weight;

			ar[i] = a;
		}

		zs[1].animals = ar;

		for (int i = 0; i < zs[0].animals.length; i++) {
			System.out.println(zs[0].animals[i].name);
		}

//		z.dieAnimal(animal2);

//		z.addCouch(c1);

	}

}
