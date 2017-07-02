package anajavatica.pattern.structural.proxy.protection;

@SuppressWarnings("javadoc")
public class Cheque implements IPayable {

	private IPayable cash = new Cash();

	@Override
	public double pay() {
		if (checkSecurity())
			return cash.pay();
		return 0;
	}

	private boolean checkSecurity() {
		// Some controls
		return true;
	}

}
