package co.edureka.xml;

import java.io.File;
import java.io.FileOutputStream;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Text;

class Employee{

	int eid;
	String name;
	int salary;
	
	Employee(){
		
	}

	public Employee(int eid, String name, int salary) {
		this.eid = eid;
		this.name = name;
		this.salary = salary;
	}
	
	
}

public class DOMXMLWriter {

	public static void main(String[] args) {
		
		try {
			
			// Represent or Save the attributes of Empoyee Object below in XML File :)
			Employee employee = new Employee(101, "John", 30000);
			
			DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
			DocumentBuilder builder = factory.newDocumentBuilder();
			Document document = builder.newDocument();	// Represents XML File Structure :)
			
			/*
			 	<employees>
			 		<employee>
			 			<eid></eid>
			 			<name></name>
			 			<salary></salary>
			 		</employee>
			 	</employees>
			 */
			
			Element rootElement = document.createElement("employees");
			Element employeeElement = document.createElement("employee");
			Element eidElement = document.createElement("eid");
			Element nameElement = document.createElement("name");
			Element salaryElement = document.createElement("salary");
			
			
			/*
		 	<employees>
		 		<employee>
		 			<eid>101</eid>
		 			<name>John</name>
		 			<salary>30000</salary>
		 		</employee>
		 	</employees>
		    */
			Text eidText = document.createTextNode(String.valueOf(employee.eid));
			Text nameText = document.createTextNode(employee.name);
			Text salaryText = document.createTextNode(String.valueOf(employee.salary));
			
			eidElement.appendChild(eidText);
			nameElement.appendChild(nameText);
			salaryElement.appendChild(salaryText);
			
			employeeElement.appendChild(eidElement);
			employeeElement.appendChild(nameElement);
			employeeElement.appendChild(salaryElement);
			
			rootElement.appendChild(employeeElement);
			
			document.appendChild(rootElement);
			
			TransformerFactory tFactory = TransformerFactory.newInstance();
			Transformer transformer = tFactory.newTransformer();
			
			File file = new File("employees.xml");
			FileOutputStream stream = new FileOutputStream(file);
			
			DOMSource source  = new DOMSource(document);
			StreamResult result = new StreamResult(stream);
			
			// Transformer will generate the XML File from document object in our program using FileOutputStream
			transformer.transform(source, result);
			System.out.println(">> XML File "+file.getName()+" Generated !!");
			
		} catch (Exception e) {
			System.out.println(">> Exception: "+e);
		}

	}

}
