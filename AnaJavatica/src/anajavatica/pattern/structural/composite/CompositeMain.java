package anajavatica.pattern.structural.composite;

@SuppressWarnings("javadoc")
public class CompositeMain {

	public static void main(String[] args) {

		IEmployee developer1 = new Developer("Developer1");
		IEmployee developer2 = new Developer("Developer2");
		IEmployee developer3 = new Developer("Developer3");
		IEmployee manager1 = new Manager("Manager1");
		IEmployee manager2 = new Manager("Manager2");
		IEmployee ceo = new Ceo("CEO");

		manager1.addEmployee(developer1);
		manager1.addEmployee(developer2);
		manager2.addEmployee(developer3);

		ceo.addEmployee(manager1);
		ceo.addEmployee(manager2);

		System.out.println(ceo.getInfo());

	}

}
