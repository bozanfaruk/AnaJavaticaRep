package anajavatica.pattern.behavioral.visitor;

public interface Place {

	public void accept(Visitor visitor);

	public String info();

}
