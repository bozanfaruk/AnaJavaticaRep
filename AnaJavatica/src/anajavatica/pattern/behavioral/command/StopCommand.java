package anajavatica.pattern.behavioral.command;

@SuppressWarnings("javadoc")
public class StopCommand implements ICommand {

	private Car car = null;

	public StopCommand(Car car) {
		this.car = car;
	}

	@Override
	public void execute() {
		car.stopCar();
	}

}
