package anajavatica.pattern.behavioral.strategy;

@SuppressWarnings("javadoc")
public class FormulaSumStrategy implements ISumStrategy {

	@Override
	public int sum(int upperLimit) {
		int result = ((upperLimit + 1) * upperLimit) / 2;
		return result;
	}

}
