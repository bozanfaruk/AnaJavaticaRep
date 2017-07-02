package anajavatica.pattern.behavioral.visitor;

@SuppressWarnings("javadoc")
public class Student implements Visitor {

	@Override
	public void visit(Place place) {
		System.out.println("What a nice " + place.info());
	}

}
