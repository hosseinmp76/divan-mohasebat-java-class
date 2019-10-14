package session11.bankManagment;

public class Customer {

	String name;
	Account[] accounts;

	Bank customerBank;

	Customer(String n, Bank b) {
		this.name = n;
		this.accounts = new Account[0];
		this.customerBank = b;
	}

	public void addAccount(Account a) {
		Account[] temp = new Account[this.accounts.length + 1];
		for (int i = 0; i < this.accounts.length; i++) {
			temp[i] = this.accounts[i];
		}

		temp[this.accounts.length] = a;
		this.accounts = temp;
	}
}
