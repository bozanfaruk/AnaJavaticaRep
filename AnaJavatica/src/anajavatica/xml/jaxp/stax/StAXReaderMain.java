package anajavatica.xml.jaxp.stax;

import java.io.FileNotFoundException;

import javax.xml.stream.XMLStreamException;

public class StAXReaderMain {

	public static void main(String[] args) throws FileNotFoundException, XMLStreamException {

		StAXReader reader = new StAXReader();
		reader.read();
		System.out.println("Total editor -> " + reader.getEditorCounter());
		System.out.println("Total language -> " + reader.getLanguageCounter());

	}

}
