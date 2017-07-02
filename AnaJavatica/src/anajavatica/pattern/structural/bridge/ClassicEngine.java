package anajavatica.pattern.structural.bridge;

@SuppressWarnings("javadoc")
public class ClassicEngine implements IEngine {

	@Override
	public String startEngine() {
		return "Classic engine";
	}
}
