package anajavatica.pattern.creational.singleton;

public class Singleton {

	private static Singleton instance = null;
	private static Object lock = new Object();

	private Singleton() {
	}

	public static Singleton getInstance() {
		synchronized (lock) {
			if (instance == null)
				instance = new Singleton();
		}
		return instance;
	}

}
