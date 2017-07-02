package anajavatica.junit;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

@SuppressWarnings("javadoc")
public class MathOperationsTest {

	private static MathOperations mathOperations = null;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		mathOperations = new MathOperations();
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		mathOperations = null;
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testSum() {
		int result = mathOperations.sum(1, 2);
		Assert.assertTrue(result == 3);
	}

	@Test
	public void testDiff() {
		int result = mathOperations.diff(5, 1);
		Assert.assertTrue(result == 4);
	}

	@Test
	public void testMul() {
		int result = mathOperations.mul(5, 3);
		Assert.assertEquals(15, result);
	}

	@Test
	public void testDiv() {
		int result = mathOperations.div(5, 1);
		Assert.assertEquals(4, result);
	}

}
