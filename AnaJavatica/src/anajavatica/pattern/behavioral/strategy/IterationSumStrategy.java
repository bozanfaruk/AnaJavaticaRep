package anajavatica.pattern.behavioral.strategy;

public class IterationSumStrategy implements ISumStrategy {

	@Override
	public int sum(int upperLimit) {
		int result = 0;

		for (int i = 1; i <= upperLimit; i++)
			result += i;

		return result;
	}

}
