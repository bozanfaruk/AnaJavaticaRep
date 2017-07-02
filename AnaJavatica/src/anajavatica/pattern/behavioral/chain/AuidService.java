package anajavatica.pattern.behavioral.chain;

@SuppressWarnings("javadoc")
public class AuidService extends CarService {

	@Override
	public void repairCar(Car car) {
		if (car.getType() == Car.CAR_TYPE_AUDI)
			System.out.println("Audi car repaired");
		else {
			if (getNextService() != null)
				getNextService().repairCar(car);
		}
	}

}
