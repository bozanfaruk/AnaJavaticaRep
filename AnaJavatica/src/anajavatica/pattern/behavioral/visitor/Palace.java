package anajavatica.pattern.behavioral.visitor;

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
