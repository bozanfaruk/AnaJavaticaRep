package anajavatica.pattern.behavioral.state;

@SuppressWarnings("javadoc")
public interface IState {

	public void updateState(Editor editor);

	public String stateInfo();

}
