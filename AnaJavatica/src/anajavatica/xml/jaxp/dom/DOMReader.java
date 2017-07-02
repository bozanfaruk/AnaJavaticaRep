package anajavatica.xml.jaxp.dom;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.ErrorHandler;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;
import org.xml.sax.SAXParseException;

@SuppressWarnings("javadoc")
public class DOMReader implements ErrorHandler {

	private DocumentBuilderFactory factory = null;
	private DocumentBuilder builder = null;
	private Document document = null;

	public DOMReader() throws ParserConfigurationException, FileNotFoundException, SAXException, IOException {
		factory = DocumentBuilderFactory.newInstance();
		factory.setValidating(true);
		builder = factory.newDocumentBuilder();
		builder.setErrorHandler(this);
		document = builder.parse(new InputSource(new FileInputStream(new File("jaxp.xml"))));
	}

	public Object getElementValue(String fieldName) {
		NodeList nodeList = document.getDocumentElement().getChildNodes();
		for (int i = 0; i < nodeList.getLength(); i++) {
			Node node = (Node) nodeList.item(i);
			if ((node.getNodeType() == Node.ELEMENT_NODE) && ((Element) node).getTagName().equals(fieldName))
				return node.getChildNodes().item(1).getChildNodes().item(1).getAttributes().item(0).getNodeValue();
		}
		return null;
	}

	@Override
	public void warning(SAXParseException exception) throws SAXException {
		exception.printStackTrace();
	}

	@Override
	public void error(SAXParseException exception) throws SAXException {
		exception.printStackTrace();
	}

	@Override
	public void fatalError(SAXParseException exception) throws SAXException {
		exception.printStackTrace();
	}

}
