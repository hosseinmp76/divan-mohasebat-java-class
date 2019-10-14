package session7;

public class Section {
	String vahedName;

	Karmand man;

	public int numberOfKarmands;
	Karmand[] karmsnds;

	public int hoghogh() {
		int res = 0;
		for (int i = 0; i < this.karmsnds.length; i++) {
			res += this.karmsnds[i].hoghogh();
		}

		return res;
	}
}
