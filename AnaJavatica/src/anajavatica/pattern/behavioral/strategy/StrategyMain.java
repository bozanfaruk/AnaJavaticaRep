package anajavatica.pattern.behavioral.strategy;

public class StrategyMain {

	public static void main(String[] args) {

		SumOperation sumOperation = new SumOperation(new IterationSumStrategy());
		System.out.println(sumOperation.sum(6));

		sumOperation.setSumStrategy(new FormulaSumStrategy());
		System.out.println(sumOperation.sum(6));

	}

}
