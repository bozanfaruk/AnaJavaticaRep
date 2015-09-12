package anajavatica.pattern.behavioral.chain;

public class BMWService extends CarService {

	@Override
	public void repairCar(Car car) {
		if (car.getType() == Car.CAR_TYPE_BMW)
			System.out.println("BMW car repaired");
		else {
			if (getNextService() != null)
				getNextService().repairCar(car);
		}
	}

}
