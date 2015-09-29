package anajavatica.pattern.behavioral.visitor;

public class Museum implements Place {

	@Override
	public void accept(Visitor visitor) {
		visitor.visit(this);
	}

	@Override
	public String info() {
		return "Museum";
	}

}
