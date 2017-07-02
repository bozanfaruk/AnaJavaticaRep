package anajavatica.pattern.creational.abstractfactory;

@SuppressWarnings("javadoc")
public class ParallelPortWriter implements IPortWriter {

	@Override
	public void sendData(String data) {
		System.out.println("Data sent to parallel port: " + data);
	}

}
