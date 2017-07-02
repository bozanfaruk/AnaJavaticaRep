package anajavatica.pattern.behavioral.command;

@SuppressWarnings("javadoc")
public class Opel extends Car {

	@Override
	public void startCar() {
		// do something before start the car.
		System.out.println("Opel started.");
	}

	@Override
	public void stopCar() {
		// do something before stop the car.
		System.out.println("Opel stopped.");
	}

}
