package anajavatica.junit.parameterized;

public class SequenceSum {

	public int sum(int begValue, int endValue) {
		int result = 0;
		for (int i = begValue; i <= endValue; i++)
			result += i;
		return result;
	}

}
