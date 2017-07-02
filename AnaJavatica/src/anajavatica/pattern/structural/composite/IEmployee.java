package anajavatica.pattern.structural.composite;

@SuppressWarnings("javadoc")
public interface IEmployee {

	public boolean addEmployee(IEmployee employee);

	public boolean removeEmployee(IEmployee employee);

	public String getInfo();

}
