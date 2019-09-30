package session7;

public class DivanMohasebatApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Company co = new Company();
		co.coName = "divan";
		int sectionsNumber = 4;
		co.vahedha = new Section[sectionsNumber];
		Section s1 = new Section();
		s1.vahedName = "it";
		s1.numberOfKarmands = 15;
		co.vahedha[0] = s1;

		int r = 4;
		Karmand k1, k2;
		k1 = new Karmand();
		k1.familyName = "a";

		k2 = new Karmand();
		k2.familyName = "a";

		System.out.println(k1 == k2);

		System.out.println(k1);
		System.out.println(k2);
	}

}
