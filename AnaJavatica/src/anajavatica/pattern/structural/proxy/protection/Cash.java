package anajavatica.pattern.structural.proxy.protection;

@SuppressWarnings("javadoc")
public class Cash implements IPayable {

	@Override
	public double pay() {
		return 2000;
	}

}
