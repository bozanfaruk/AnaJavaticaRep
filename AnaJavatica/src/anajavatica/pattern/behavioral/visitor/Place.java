package anajavatica.pattern.behavioral.visitor;

@SuppressWarnings("javadoc")
public interface Place {

	public void accept(Visitor visitor);

	public String info();

}
