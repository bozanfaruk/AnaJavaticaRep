package anajavatica.pattern.structural.flyweight.proxy.protection;

public class Cash implements IPayable {

	@Override
	public double pay() {
		return 2000;
	}

}
