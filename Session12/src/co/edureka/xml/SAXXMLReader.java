package co.edureka.xml;

import java.io.File;
import java.io.FileInputStream;

import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

class MyHandler extends DefaultHandler{
	
	public void startDocument() throws SAXException {
		System.out.println(">> XML Parsing Started");
	}
	
	public void startElement(String uri, String localName, String qName, Attributes attributes) throws SAXException {
		//System.out.println("[START] Parsing the Tag: "+qName);
	}
	
	public void characters(char[] ch, int start, int length) throws SAXException {
		String data = new String(ch, start, length);
		System.out.println(data);
	}

	public void endElement(String uri, String localName, String qName) throws SAXException {
		//System.out.println("[END] Parsing the Tag: "+qName);
		//System.out.println();
	}
	
	public void endDocument() throws SAXException {
		System.out.println(">> XML Parsing Finished");
	}
	
}

public class SAXXMLReader {

	public static void main(String[] args) {
		
		try {
			SAXParserFactory factory = SAXParserFactory.newInstance();
			SAXParser parser = factory.newSAXParser();
			
			File file = new File("employees.xml");
			FileInputStream stream = new FileInputStream(file);
			
			MyHandler handler = new MyHandler();
			
			parser.parse(stream, handler);
			
		}catch (Exception e) {
			System.out.println(">> Some Exception: "+e);
		}
		

	}

}

// PS: Try creating a Program where you create Employee Objects by reading the data 
// In case for documentation : 	https://docs.oracle.com/javase/tutorial/jaxp/sax/parsing.html
// 								https://docs.oracle.com/javase/7/docs/api/javax/xml/parsers/SAXParser.html
