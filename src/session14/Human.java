package session14;

public class Human {
	private static int population;

	public static int getPopulation() {
		return population;
	}

	public static void setPopulation(int population) {
		Human.population = population;
	}

	public Human() {
		population++;
	}
}
