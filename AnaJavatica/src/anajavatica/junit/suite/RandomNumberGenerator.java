package anajavatica.junit.suite;

import java.util.Random;

@SuppressWarnings("javadoc")
public class RandomNumberGenerator {

	private Random random = new Random();

	public int generateRandomInt(int limit) {
		return random.nextInt(limit);
	}

}
