package anajavatica.pattern.structural.proxy.protection;

@SuppressWarnings("javadoc")
public class Bank {

	private IPayable cheque = new Cheque();

	public void processPayment() {
		System.out.println(cheque.pay());
	}

}
