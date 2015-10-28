package anajavatica.junit.timeout;

import org.junit.BeforeClass;
import org.junit.Test;

public class TimeoutTest {

	private static Timeout timeout = null;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		timeout = new Timeout();
	}

	@Test(timeout = 500)
	public void testDoSomething() {
		timeout.doSomething();
	}

}
