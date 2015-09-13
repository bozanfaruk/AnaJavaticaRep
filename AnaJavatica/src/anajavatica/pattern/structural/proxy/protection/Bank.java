package anajavatica.pattern.structural.proxy.protection;

public class Bank {

	private IPayable cheque = new Cheque();

	public void processPayment() {
		System.out.println(cheque.pay());
	}

}
