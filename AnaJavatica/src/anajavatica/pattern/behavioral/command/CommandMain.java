package anajavatica.pattern.behavioral.command;

public class CommandMain {

	public static void main(String[] args) {

		Car opel = new Opel();
		Car audi = new Audi();

		ICommand opelStartCommand = new StartCommand(opel);
		ICommand audiStartCommand = new StartCommand(audi);
		ICommand opelStopCommand = new StopCommand(opel);
		ICommand audiStopCommand = new StopCommand(audi);

		opelStartCommand.execute();
		opelStopCommand.execute();
		audiStartCommand.execute();
		audiStopCommand.execute();

	}

}
