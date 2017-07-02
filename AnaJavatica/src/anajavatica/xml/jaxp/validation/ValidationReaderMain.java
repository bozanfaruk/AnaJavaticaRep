package anajavatica.xml.jaxp.validation;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.xml.sax.InputSource;
import org.xml.sax.SAXException;
import org.xml.sax.XMLReader;
import org.xml.sax.helpers.XMLReaderFactory;

@SuppressWarnings("javadoc")
public class ValidationReaderMain {

	public static void main(String[] args) throws SAXException, FileNotFoundException, IOException {

		XMLReader reader = XMLReaderFactory.createXMLReader();
		reader.setErrorHandler(new ValidationReader());
		reader.parse(new InputSource(new FileInputStream(new File("jaxp.xml"))));

	}

}
