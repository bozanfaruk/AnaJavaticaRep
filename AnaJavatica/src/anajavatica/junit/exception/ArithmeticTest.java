package anajavatica.junit.exception;

import static org.junit.Assert.assertTrue;

import org.junit.BeforeClass;
import org.junit.Test;

public class ArithmeticTest {

	private static Arithmetic arithmetic = null;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		arithmetic = new Arithmetic();
	}

	@Test(expected = ArithmeticException.class)
	public void testDiv() {
		int result = arithmetic.div(2, 0);
		assertTrue(result == 0);
	}

}
