package session7;

public class DivanMohasebatApp3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Karmand m1 = new Karmand();
		m1.hour = 165;
		m1.monryPerHour = 100;

		Section s1 = new Section();
		s1.vahedName = "IT";
		s1.karmsnds = new Karmand[10];
		for (int i = 0; i < 10; i++) {
			Karmand k = new Karmand();
			k.hour = 165;
			k.monryPerHour = 15;
			s1.karmsnds[i] = k;
		}

		Karmand k2 = new Karmand();
		k2.hour = 165;
		k2.monryPerHour = 10;

		Company co = new Company();
		co.coName = "divan";
		co.vahedha = new Section[1];
		co.vahedha[0] = s1;
		co.manager = m1;

		System.out.println(co.calculateHoghgh());

	}

}
