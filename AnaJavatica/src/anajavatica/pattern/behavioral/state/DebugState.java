package anajavatica.pattern.behavioral.state;

@SuppressWarnings("javadoc")
public class DebugState implements IState {

	public void updateState(Editor editor) {
		editor.debug();
		editor.setState(new RunState());
	}

	@Override
	public String stateInfo() {
		return "Debug state";
	}

}
