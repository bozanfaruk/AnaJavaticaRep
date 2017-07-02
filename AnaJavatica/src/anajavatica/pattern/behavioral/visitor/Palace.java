package anajavatica.pattern.behavioral.visitor;

@SuppressWarnings("javadoc")
public class Palace implements Place {

	@Override
	public void accept(Visitor visitor) {
		visitor.visit(this);
	}

	@Override
	public String info() {
		return "Palace";
	}
}
