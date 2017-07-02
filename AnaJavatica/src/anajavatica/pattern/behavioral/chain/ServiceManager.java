package anajavatica.pattern.behavioral.chain;

@SuppressWarnings("javadoc")
public class ServiceManager {

	private CarService bmwService = new BMWService();
	private CarService audiService = new AuidService();

	public ServiceManager() {
		bmwService.setNextService(audiService);
	}

	public void repairCar(Car car) {
		bmwService.repairCar(car);
	}

}
