package anajavatica.junit.timeout;

@SuppressWarnings("javadoc")
public class Timeout {

	public void doSomething() {
		Thread t = new Thread(new Runnable() {

			@Override
			public void run() {
				// do something
			}
		});
		t.start();
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}
