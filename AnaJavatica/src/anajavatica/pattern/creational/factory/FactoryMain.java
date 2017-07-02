package anajavatica.pattern.creational.factory;

@SuppressWarnings("javadoc")
public class FactoryMain {

	public static void main(String[] args) {

		ICar carA = CarFactory.getInstance().getCar(CarType.CarA);
		ICar carB = CarFactory.getInstance().getCar(CarType.CarB);
		ICar carC = CarFactory.getInstance().getCar(CarType.CarC);

		System.out.println(carA.getCarInfo());
		System.out.println(carB.getCarInfo());
		System.out.println(carC.getCarInfo());

	}

}
