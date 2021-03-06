package anajavatica.pattern.creational.abstractfactory;

@SuppressWarnings("javadoc")
public class SerialPortWriter implements IPortWriter {

	@Override
	public void sendData(String data) {
		System.out.println("Data sent to serial port: " + data);
	}

}
