package session11.bankManagment;

public class BankGeneralException extends RuntimeException {

	String cause;

	public BankGeneralException(String cause) {
		super();
		this.cause = cause;
	}

}
