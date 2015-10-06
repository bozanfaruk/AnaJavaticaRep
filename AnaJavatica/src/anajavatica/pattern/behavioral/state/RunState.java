package anajavatica.pattern.behavioral.state;

public class RunState implements IState {

	public void updateState(Editor editor) {
		editor.run();
		editor.setState(new DebugState());
	}

	@Override
	public String stateInfo() {
		return "Run state";
	}

}
