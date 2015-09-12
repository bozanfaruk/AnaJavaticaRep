package anajavatica.annotation;

@ClassAnnotation(IDE = "Eclipse")
public class CustomAnn {

	@MethodAnnotation(author = "Author1", rate = 50)
	public CustomAnn method1() {
		System.out.println("method1");
		return this;
	}

	@MethodAnnotation(author = "Author2", rate = 75)
	public CustomAnn method2() {
		System.out.println("method2");
		return this;
	}

}
