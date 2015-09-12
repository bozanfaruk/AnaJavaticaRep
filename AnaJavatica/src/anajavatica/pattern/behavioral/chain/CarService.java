package anajavatica.pattern.behavioral.chain;

public abstract class CarService {

	private CarService nextService = null;

	public CarService getNextService() {
		return nextService;
	}

	public void setNextService(CarService nextService) {
		this.nextService = nextService;
	}

	public abstract void repairCar(Car car);

}
