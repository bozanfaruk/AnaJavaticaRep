package anajavatica.pattern.structural.bridge;

@SuppressWarnings("javadoc")
public class BridgeMain {

	public static void main(String[] args) {

		Car bmw = new BMW("BMW", new ClassicEngine());
		Car auid = new BMW("Auid", new SportEngine());

		bmw.drive();
		auid.drive();

	}

}
