package co.edureka.io;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.text.SimpleDateFormat;
import java.util.Date;

class Order{ // extends Object{
	
	String customerName;
	String customerEmail;
	int price;
	String items;
	String dateTimeStamp;
	
	public Order() {
	}

	public Order(String customerName, String customerEmail, int price, String items, String dateTimeStamp) {
		this.customerName = customerName;
		this.customerEmail = customerEmail;
		this.price = price;
		this.items = items;
		this.dateTimeStamp = dateTimeStamp;
	}
	
	// We Override toString method from the Parent Class Object
	public String toString() {
		// Comma Separated Value String :)
		return customerName+","+customerEmail+","+price+","+items+","+dateTimeStamp+"\n";
	}
}

public class FileIO {
	
	void writeDataInFile(String data) {
		// We need a try catch as FileIO API's may throw checked exceptions
		try {
			
			File file = new File("/users/ishantkumar/Downloads/myorders-11-05-2020.csv");
			
			// Character Stream
			//FileWriter writer = new FileWriter(file);		// false -> append mode disabled, so every time data will be over-written
			FileWriter writer = new FileWriter(file, true); // true -> append mode enabled
			writer.write(data);	// Data Written as Text
			writer.close(); 	// Close the Stream to free occupied resources in memory
			System.out.println(">> Data Saved in File "+file.getName());
			
		} catch (Exception e) {
			System.out.println(">> Some Exception: "+e);
		}
	}
	
	void writeDataInFileAgain(String data) {
		// We need a try catch as FileIO API's may throw checked exceptions
		try {
			
			File file = new File("/users/ishantkumar/Downloads/yourorders-11-05-2020.csv");
			
			// Binary Stream
			//FileOutputStream stream = new FileOutputStream(file);
			FileOutputStream stream = new FileOutputStream(file, true);
			stream.write(data.getBytes());  // Data is written as bytes
			stream.close(); 				// Close the Stream to free occupied resources in memory
			System.out.println(">> Data Saved in File "+file.getName());
			
		} catch (Exception e) {
			System.out.println(">> Some Exception: "+e);
		}
	}
	
	void readFromFile() {
		try {
			
			File file = new File("/users/ishantkumar/Downloads/myorders-11-05-2020.csv");
			
			// Character Stream
			FileReader reader = new FileReader(file);			// we read data character by character
			BufferedReader buffer = new BufferedReader(reader); // we read data line by line
			
			String line = "";
			//StringBuffer sb = new StringBuffer();				// we will save memory :)
			while((line = buffer.readLine()) != null) {			// null means end of file
				System.out.println(line);
			}
			
			buffer.close();
			reader.close();
			
		} catch (Exception e) {
			System.out.println(">> Some Exception: "+e);
		}
	}
	
	void readFromFileAgain() {
		try {
			
			File file = new File("/users/ishantkumar/Downloads/myorders-11-05-2020.csv");
			//file.renameTo(dest);
			//file.delete();
			
			// Binary Stream
			FileInputStream stream = new FileInputStream(file);
			
			int i = 0;
			char ch = ' ';
			while((i = stream.read()) != -1) {	// -1 means end of file
				ch = (char)i;
				System.out.print(ch);
			}
			
			stream.close();
			
		} catch (Exception e) {
			System.out.println(">> Some Exception: "+e);
		}
	}
	
	public static void main(String[] args) {
		
		System.out.println(">> App Started");
		
		Date date = new Date();
		//String dtStamp = date.String();
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy hh:mm:ss");
		String dtStamp = sdf.format(date);
		
		//System.out.println(dtStamp);
		
		// Persistence - Save the data of an Object as Object is in RAM and is temporary
		// 				 1. Files
		//			     2. DataBases 
		//Order oRef1 = new Order("Fionna", "fionna@example.com", 1700, "screen guard-phone cover-usb", dtStamp);
		//System.out.println(oRef1); // toString will be executed automatically here
		
		FileIO io = new FileIO();
		//String orderData = oRef1.toString();
		//io.writeDataInFile(orderData);
		//io.writeDataInFileAgain(orderData);
		
		//io.readFromFile();
		io.readFromFileAgain();
		
		System.out.println(">> App Finished");

	}

}
