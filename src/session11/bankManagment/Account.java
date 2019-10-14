package session11.bankManagment;

public class Account {
	private int money;

	Tashilat[] tashilat;

	private Customer owner;

	Account(Customer c, int initMoney) {
		this.owner = c;
		this.money = initMoney;
		this.tashilat = new Tashilat[0];

	}

	public int getMoney() {
		return this.money;
	}

	public void setMoney(int v) {
		if (v >= 0)
			this.money = v;
	}

}
