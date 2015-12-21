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

		XMLReader okuyucu = XMLReaderFactory.createXMLReader();
		okuyucu.setContentHandler(new SAXReader());
		okuyucu.parse(new InputSource(new FileInputStream(new File("jaxp.xml"))));

	}

}
