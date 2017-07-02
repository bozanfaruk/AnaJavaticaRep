package anajavatica.pattern.structural.composite;

import java.util.HashSet;
import java.util.Set;

@SuppressWarnings("javadoc")
public class Manager implements IEmployee {

	private String info = "";

	private Set<IEmployee> employeeList = null;

	public Manager(String info) {
		this.info = info;
		employeeList = new HashSet<IEmployee>();
	}

	@Override
	public boolean addEmployee(IEmployee employee) {
		return employeeList.add(employee);
	}

	@Override
	public boolean removeEmployee(IEmployee employee) {
		return employeeList.remove(employee);
	}

	@Override
	public String getInfo() {
		StringBuffer buffer = new StringBuffer();
		buffer.append(info).append(": ");
		for (IEmployee employee : employeeList) {
			buffer.append(" ").append(employee.getInfo());
		}
		return buffer.toString();
	}

}
