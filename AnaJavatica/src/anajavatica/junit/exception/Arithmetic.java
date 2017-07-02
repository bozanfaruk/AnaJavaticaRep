package anajavatica.junit.exception;

@SuppressWarnings("javadoc")
public class Arithmetic {

	public int div(int value1, int value2) throws ArithmeticException {
		if (value2 == 0)
			throw new ArithmeticException("Value2 is zero");
		return value1 / value2;
	}

}
