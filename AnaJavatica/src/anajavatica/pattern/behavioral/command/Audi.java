package anajavatica.pattern.behavioral.command;

public class Audi extends Car {

	@Override
	public void startCar() {
		// do something before start the car.
		System.out.println("Audi started.");
	}

	@Override
	public void stopCar() {
		// do something before stop the car.
		System.out.println("Audi stopped.");
	}

}
