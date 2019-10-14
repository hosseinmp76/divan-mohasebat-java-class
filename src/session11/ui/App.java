package session11.ui;

import session11.bankManagment.Account;
import session11.bankManagment.Bank;
import session11.bankManagment.Customer;
import session11.bankManagment.Tashilat;

public class App {

	public static void main(String[] args) {
		Bank b1 = new Bank("tejarat");

		Bank b2 = new Bank("sepah");

		Customer c1 = b1.newCustomer("bejani");

		int numberOfAccounts = 1000;

		int bejaniInitValue = 1000 * 1000;

//		for (int i = 0; i < numberOfAccounts; i++) {
		Account ac1 = b1.newAccount(c1, 0);
//		}

		int value = 1000 * 1000;
		Tashilat t1 = b1.tashilatRequest(ac1, value);

		System.out.println(t1.getValue());

		t1.pay(1000 * 1000);

		System.out.println("not enoght money");
	}

}
