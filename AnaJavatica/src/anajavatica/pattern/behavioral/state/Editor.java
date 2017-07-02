package anajavatica.pattern.behavioral.state;

@SuppressWarnings("javadoc")
public class Editor {

	private IState state = null;

	public IState getState() {
		return state;
	}

	public void setState(IState state) {
		this.state = state;
	}

	public void debug() {
		// do some progress...
		System.out.println("Editor in ".concat(getState().stateInfo()));
	}

	public void run() {
		// do some progress...
		System.out.println("Editor in ".concat(getState().stateInfo()));
	}

}