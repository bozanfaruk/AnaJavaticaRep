package anajavatica.pattern.structural.composite;

public class Developer implements IEmployee {

	private String info = "";

	public Developer(String info) {
		this.info = info;
	}

	@Override
	public boolean addEmployee(IEmployee employee) {
		return false;
	}

	@Override
	public boolean removeEmployee(IEmployee employee) {
		return false;
	}

	@Override
	public String getInfo() {
		return info;
	}

}
