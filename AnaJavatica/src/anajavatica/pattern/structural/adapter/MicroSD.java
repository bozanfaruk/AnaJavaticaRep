package anajavatica.pattern.structural.adapter;

@SuppressWarnings("javadoc")
public class MicroSD implements ISd {

	@Override
	public String readData() {
		return "Data from Micro SD";
	}

}
