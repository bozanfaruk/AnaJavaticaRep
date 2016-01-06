package anajavatica.xml.jaxp.dom;

import java.io.FileNotFoundException;
import java.io.IOException;

import javax.xml.parsers.ParserConfigurationException;

import org.xml.sax.SAXException;

public class DOMReaderMain {

	public static void main(String[] args)
			throws FileNotFoundException, ParserConfigurationException, SAXException, IOException {

		DOMReader reader = new DOMReader();
		System.out.println(reader.getElementValue("editor"));

	}

}
