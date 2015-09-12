package anajavatica.pattern.creational.abstractfactory;

public class ParallelPortWriter implements IPortWriter {

	@Override
	public void sendData(String data) {
		System.out.println("Data sent to parallel port: " + data);
	}

}
