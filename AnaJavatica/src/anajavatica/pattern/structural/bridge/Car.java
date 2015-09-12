package anajavatica.pattern.structural.bridge;

public abstract class Car {

	private IEngine engine = null;

	private String carName = "";

	public Car(String carName, IEngine engine) {
		setCarName(carName);
		setEngine(engine);
	}

	public IEngine getEngine() {
		return engine;
	}

	public void setEngine(IEngine engine) {
		this.engine = engine;
	}

	public String getCarName() {
		return carName;
	}

	public void setCarName(String carName) {
		this.carName = carName;
	}

	public abstract void drive();

}
