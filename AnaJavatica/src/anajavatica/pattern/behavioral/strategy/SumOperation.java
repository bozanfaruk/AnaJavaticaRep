package anajavatica.pattern.behavioral.strategy;

@SuppressWarnings("javadoc")
public class SumOperation {

	private ISumStrategy sumStrategy = null;

	public SumOperation(ISumStrategy sumStrategy) {
		super();
		this.sumStrategy = sumStrategy;
	}

	public ISumStrategy getSumStrategy() {
		return sumStrategy;
	}

	public void setSumStrategy(ISumStrategy sumStrategy) {
		this.sumStrategy = sumStrategy;
	}

	public int sum(int upperLimit) {
		return getSumStrategy().sum(upperLimit);
	}

}
