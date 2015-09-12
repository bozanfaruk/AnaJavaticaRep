package anajavatica.pattern.creational.abstractfactory;

public class AbstractFactory {

	private static AbstractFactory instance = null;
	private static Object lock = new Object();

	private AbstractFactory() {
	}

	public static AbstractFactory getInstance() {
		synchronized (lock) {
			if (instance == null)
				instance = new AbstractFactory();
		}
		return instance;
	}

	public IAbstractWriter getAbstractWriter(AbstractWriterEnum type) {
		switch (type) {
		case FileWriter:
			return new FileWriterFactory();
		case PortWriter:
			return new PortWriterFactory();
		}
		return null;
	}

}
