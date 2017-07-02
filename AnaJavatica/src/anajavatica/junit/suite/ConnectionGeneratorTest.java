package anajavatica.junit.suite;

import static org.junit.Assert.assertNull;

import org.junit.BeforeClass;
import org.junit.Test;

@SuppressWarnings("javadoc")
public class ConnectionGeneratorTest {

	private static ConnectionGenerator generator = null;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		generator = new ConnectionGenerator();
	}

	@Test
	public void testCreateConnection() {
		Object result = generator.createConnection();
		assertNull(result);
	}

}
