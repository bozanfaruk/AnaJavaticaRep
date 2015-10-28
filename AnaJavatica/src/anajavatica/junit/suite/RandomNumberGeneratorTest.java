package anajavatica.junit.suite;

import static org.junit.Assert.assertTrue;

import org.junit.BeforeClass;
import org.junit.Test;

public class RandomNumberGeneratorTest {

	private static RandomNumberGenerator generator = null;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		generator = new RandomNumberGenerator();
	}

	@Test
	public void testGenerateRandomInt() {
		int result = generator.generateRandomInt(10);
		assertTrue(result < 10);
	}

}
