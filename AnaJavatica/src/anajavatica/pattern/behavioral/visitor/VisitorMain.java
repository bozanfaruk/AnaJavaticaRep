package anajavatica.pattern.behavioral.visitor;

public class VisitorMain {

	public static void main(String[] args) {

		Visitor student = new Student();
		Place museum = new Museum();
		Place palace = new Palace();

		museum.accept(student);
		palace.accept(student);

	}

}
