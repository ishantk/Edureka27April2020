package co.edureka.main;

import co.edureka.db.DAO;
import co.edureka.model.User;

public class App {

	public static void main(String[] args) {
		
		User user = new User(0, "Ana", "ana@example.com", "ana@123");
		System.out.println(user);
		
		// User Object is Temporary
		// Data in the Object is in RAM and when Program finishes, data is LOST
		// Persistence : Save the state of Object
		//				 i.e. Save the data o =f Object somewhere
		// 1. Text Files	(No Standardization)
		// 2. XML Files		(Standardization as Tags)
		// 3. DataBase		(May be Local or in Cloud)
		
		// Objective: We will Save the Data of Object in DataBase
		
		// Load the Driver
		DAO dao = new DAO();
		// Create Connection to DataBase
		dao.createConnection();
		// Save User in DataBase -> Execution of SQL from Java
		dao.saveUser(user);
		// Close the Connection
		dao.closeConnection();

	}

}
