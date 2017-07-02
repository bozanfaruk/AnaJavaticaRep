package anajavatica.pattern.creational.factory;

@SuppressWarnings("javadoc")
public class CarFactory {

	private static CarFactory instance = null;
	private static Object lock = new Object();

	private CarFactory() {
	}

	public static CarFactory getInstance() {
		synchronized (lock) {
			if (instance == null) {
				instance = new CarFactory();
			}
		}
		return instance;
	}

	public ICar getCar(CarType carType) {
		switch (carType) {
		case CarA:
			return new CarA();
		case CarB:
			return new CarB();
		case CarC:
			return new CarC();
		}
		return null;
	}
}
