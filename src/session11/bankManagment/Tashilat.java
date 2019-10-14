package session11.bankManagment;

public class Tashilat {

	Account account;

	private int value;

	public Tashilat(Account ac, int v) {
		this.account = ac;
		this.value = v;
	}

	public int getValue() {
		return this.value;
	}

	public void pay(int v) {
		if (this.value >= v)
			this.value -= v;
		throw new BankGeneralException("too much payment");
	}

	public void payFromAccount(int v) {
		if (this.account.getMoney() >= v) {

			this.account.setMoney(this.account.getMoney() - v);
			this.value -= v;
		}
		throw new BankGeneralException("too much payment");
	}
}
