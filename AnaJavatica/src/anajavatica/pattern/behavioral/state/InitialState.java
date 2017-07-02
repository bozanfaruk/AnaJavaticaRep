package anajavatica.pattern.behavioral.state;

@SuppressWarnings("javadoc")
public class InitialState implements IState {

	public void updateState(Editor editor) {
		editor.setState(new DebugState());
	}

	@Override
	public String stateInfo() {
		return "Initial state";
	}

}
