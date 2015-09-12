package anajavatica.pattern.behavioral.chain;

public class ChainMain {

	public static void main(String[] args) {

		Car bmw = new Car(Car.CAR_TYPE_BMW);
		Car audi = new Car(Car.CAR_TYPE_AUDI);

		ServiceManager serviceManager = new ServiceManager();

		serviceManager.repairCar(bmw);
		serviceManager.repairCar(audi);

	}
}
