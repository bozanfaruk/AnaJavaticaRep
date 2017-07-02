package anajavatica.xml.jaxp.stax;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

import javax.xml.stream.XMLInputFactory;
import javax.xml.stream.XMLStreamConstants;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.XMLStreamReader;

@SuppressWarnings("javadoc")
public class StAXReader {

	private XMLStreamReader reader;
	private int editorCounter = 0;
	private int languageCounter = 0;

	public StAXReader() throws FileNotFoundException, XMLStreamException {
		XMLInputFactory factory = XMLInputFactory.newFactory();
		InputStream is = new FileInputStream(new File("jaxp.xml"));
		reader = factory.createXMLStreamReader(is);
	}

	public void read() throws XMLStreamException {
		while (reader.hasNext()) {
			int event = reader.next();
			switch (event) {
			case XMLStreamConstants.START_DOCUMENT:
				System.out.println("Start document...");
				break;
			case XMLStreamConstants.END_DOCUMENT:
				System.out.println("End document...");
				break;
			case XMLStreamConstants.START_ELEMENT:
				switch (reader.getLocalName()) {
				case "editor":
					editorCounter++;
					break;
				case "language":
					languageCounter++;
					break;
				}
				break;
			}
		}
	}

	public int getEditorCounter() {
		return editorCounter;
	}

	public int getLanguageCounter() {
		return languageCounter;
	}

}
