package anajavatica.pattern.behavioral.command;

@SuppressWarnings("javadoc")
public class StartCommand implements ICommand {

	private Car car = null;

	public StartCommand(Car car) {
		this.car = car;
	}

	@Override
	public void execute() {
		car.startCar();
	}

}
