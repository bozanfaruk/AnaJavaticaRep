package anajavatica.xml.jaxp.sax;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.xml.sax.InputSource;
import org.xml.sax.SAXException;
import org.xml.sax.XMLReader;
import org.xml.sax.helpers.XMLReaderFactory;

public class SAXReaderMain {

	public static void main(String[] args) throws SAXException, FileNotFoundException, IOException {

		XMLReader xmlReader = XMLReaderFactory.createXMLReader();
		SAXReader saxReader = new SAXReader();
		xmlReader.setContentHandler(saxReader);
		xmlReader.parse(new InputSource(new FileInputStream(new File("jaxp.xml"))));
		saxReader.printInfo();

	}

}
