package anajavatica.xml.jaxp.sax;

import java.util.ArrayList;
import java.util.List;

@SuppressWarnings("javadoc")
public class Editor {

	private String name = "";
	private List<Language> langList = new ArrayList<Language>();

	public Editor(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void addLangauge(Language language) {
		if (!getLangList().contains(language))
			getLangList().add(language);
	}

	public List<Language> getLangList() {
		return langList;
	}

}
