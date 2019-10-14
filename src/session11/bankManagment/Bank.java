package session11.bankManagment;

public class Bank {

	String name;

	Customer[] customers;

	public Bank(String n) {
		this.name = n;
		this.customers = new Customer[0];
	}

	public int getBuget() {
		return 0;
	}

	public Customer newCustomer(String name) {
		Customer c = new Customer(name, this);
		return c;
	}

	public Account newAccount(Customer c, int initValue) {
		Account a = new Account(c, initValue);
		c.addAccount(a);
		return a;
	}

	public Tashilat tashilatRequest(Account ac1, int value) {
		if (ac1.getMoney() >= value)
			return new Tashilat(ac1, value * 2);

		throw new NotEnoghtMoneyException();

	}

}
