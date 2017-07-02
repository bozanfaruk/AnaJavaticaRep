package anajavatica.pattern.behavioral.state;

@SuppressWarnings("javadoc")
public class StateMain {

	public static void main(String[] args) {

		Editor editor = new Editor();
		IState initialState = new InitialState();
		IState debugState = new DebugState();
		IState runState = new RunState();

		initialState.updateState(editor);
		debugState.updateState(editor);
		runState.updateState(editor);
		System.out.println(editor.getState().stateInfo());

	}

}
