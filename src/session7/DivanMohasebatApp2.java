package session7;

public class DivanMohasebatApp2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Karmand m1 = new Karmand();
		m1.hour = 165;
		m1.monryPerHour = 100;

		Karmand k1 = new Karmand();
		k1.hour = 165;
		k1.monryPerHour = 15;

		Karmand k2 = new Karmand();
		k2.hour = 165;
		k2.monryPerHour = 10;

		Section s1 = new Section();
		s1.vahedName = "IT";
		s1.karmsnds = new Karmand[2];
		s1.karmsnds[0] = k1;
		s1.karmsnds[1] = k2;

		Company co = new Company();
		co.coName = "divan";
		co.vahedha = new Section[1];
		co.vahedha[0] = s1;
		co.manager = m1;

		System.out.println(co.calculateHoghgh());

	}

}
