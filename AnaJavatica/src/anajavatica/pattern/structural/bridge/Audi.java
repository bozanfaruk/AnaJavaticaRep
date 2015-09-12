package anajavatica.pattern.structural.bridge;

public class Audi extends Car {

	public Audi(String carName, IEngine engine) {
		super(carName, engine);
	}

	@Override
	public void drive() {
		System.out.println(getCarName().concat(" with: ").concat(getEngine().startEngine()));
	}

}
