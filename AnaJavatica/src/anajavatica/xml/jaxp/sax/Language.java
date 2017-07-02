package anajavatica.xml.jaxp.sax;

@SuppressWarnings("javadoc")
public class Language {

	private String name = "";
	private int memory = 0;

	public Language(String name, int memory) {
		super();
		this.name = name;
		this.memory = memory;
	}

	public String getName() {
		return name;
	}

	public int getMemory() {
		return memory;
	}

}
