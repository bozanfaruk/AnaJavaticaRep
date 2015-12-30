package anajavatica.xml.jaxp.sax;

import java.util.ArrayList;
import java.util.List;

import org.xml.sax.Attributes;
import org.xml.sax.ContentHandler;
import org.xml.sax.Locator;
import org.xml.sax.SAXException;

public class SAXReader implements ContentHandler {

	private static final String KEYWORD_EDITOR = "editor";
	private static final String KEYWORD_LANGUAGE = "language";
	private static final String KEYWORD_NAME = "name";
	private static final String KEYWORD_MEMORY = "memory";
	private List<Editor> editorList = new ArrayList<Editor>();
	private Editor localEditor = null;

	public void printInfo() {
		System.out.println("Total editor -> " + editorList.size());
		for (Editor e : editorList) {
			System.out.println("Editor (" + e.getName() + ") has " + e.getLangList().size() + " languages:");
			for (Language lang : e.getLangList())
				System.out.println("\tLanguage (" + lang.getName() + ") has " + lang.getMemory() + " memory");
		}
	}

	@Override
	public void setDocumentLocator(Locator locator) {
	}

	@Override
	public void startDocument() throws SAXException {
	}

	@Override
	public void endDocument() throws SAXException {
	}

	@Override
	public void startPrefixMapping(String prefix, String uri) throws SAXException {
	}

	@Override
	public void endPrefixMapping(String prefix) throws SAXException {
	}

	@Override
	public void startElement(String uri, String localName, String qName, Attributes atts) throws SAXException {
		switch (localName) {
		case KEYWORD_EDITOR:
			String name = atts.getValue(KEYWORD_NAME);
			localEditor = new Editor(name);
			break;
		case KEYWORD_LANGUAGE:
			name = atts.getValue(KEYWORD_NAME);
			String memory = atts.getValue(KEYWORD_MEMORY);
			Language lang = new Language(name, Integer.valueOf(memory));
			localEditor.addLangauge(lang);
			break;
		}
	}

	@Override
	public void endElement(String uri, String localName, String qName) throws SAXException {
		switch (localName) {
		case KEYWORD_EDITOR:
			editorList.add(localEditor);
			break;
		}
	}

	@Override
	public void characters(char[] ch, int start, int length) throws SAXException {
	}

	@Override
	public void ignorableWhitespace(char[] ch, int start, int length) throws SAXException {
	}

	@Override
	public void processingInstruction(String target, String data) throws SAXException {
	}

	@Override
	public void skippedEntity(String name) throws SAXException {
	}

}
