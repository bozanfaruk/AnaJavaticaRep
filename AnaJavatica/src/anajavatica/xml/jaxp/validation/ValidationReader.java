package anajavatica.xml.jaxp.validation;

import org.xml.sax.ErrorHandler;
import org.xml.sax.SAXException;
import org.xml.sax.SAXParseException;

public class ValidationReader implements ErrorHandler {

	@Override
	public void warning(SAXParseException exception) throws SAXException {
		System.out.println(
				"Warning @ line -> " + exception.getLineNumber() + " , column -> " + exception.getColumnNumber());
	}

	@Override
	public void error(SAXParseException exception) throws SAXException {
		System.out.println(
				"Error @ line -> " + exception.getLineNumber() + " , column -> " + exception.getColumnNumber());
	}

	@Override
	public void fatalError(SAXParseException exception) throws SAXException {
		System.out.println(
				"Fatal error @ line -> " + exception.getLineNumber() + " , column -> " + exception.getColumnNumber());
	}

}
