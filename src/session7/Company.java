package session7;

public class Company {
	String coName;

	Karmand manager;

	Section[] vahedha;

	int dounfingDate;

	public int calculateHoghgh() {
		int res = 0;
		for (int i = 0; i < this.vahedha.length; i++) {
			res += this.vahedha[i].hoghogh();
		}

		res += this.manager.hoghogh();
		return res;
	}
}
