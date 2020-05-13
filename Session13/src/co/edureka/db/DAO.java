package co.edureka.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

import co.edureka.model.User;

/*
 
 	JDBC Procedure
 	~~~~~~~~~~~~~~
 	
 	1. Load the Driver
 		1.1 Download DB Library from the DB Vendor (https://dev.mysql.com/downloads/connector/j/)
 		1.2 Configure the same in your java project
 		1.3 Use API Class.forname to load the .class file in your project
 		
 	2. Create Connection to the DataBase
 	   2.1 username, password, url
 	   2.2. Use Connection and DriverManager API from JDCB i.e. java.sql package to create Connection with Database
 	   MySQL JDBC Documentation: https://dev.mysql.com/doc/connector-j/8.0/en/
 	   
 	3. Write and Execute SQL Statement
 	   3.1 Use the API Statement or PreparedStatement
 	   
 	4. Close the Connection
 	   4.1 execute close method on Connection
 
 */

// DataBase Access Object
public class DAO {
	
	Connection connection;
	Statement statement;

	// 1. Load the Driver
	public DAO() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println(">> 1. Driver Loaded");
		} catch (Exception e) {
			System.out.println(">> Some Exception: "+e);
		}
	}
	
	public void createConnection() {
		try {
			
			String user = "root";
			String password = "";
			String url = "jdbc:mysql://localhost/edureka";
			
			connection = DriverManager.getConnection(url, user, password);
			System.out.println(">> 2. Connection Created");
			
		} catch (Exception e) {
			System.out.println(">> Some Exception: "+e);
		}
	}
	
	public void saveUser(User user) { // user as input to method
		try {
			// Write SQL Statement (Data in SQL Statement is Substituted from User Object)
			String sql = "insert into User values(null, '"+user.name+"', '"+user.email+"', '"+user.password+"')";
			
			statement = connection.createStatement();
			int i = statement.executeUpdate(sql);	// executeUpdate -> insert update and delete sql statements
			
			if(i>0) {
				System.out.println(">> 3. Record Inserted in Table. "+user.name+" Saved !!");
			}else {
				System.out.println(">> 3. Record Not Inserted in Table. "+user.name+" Not Saved !!");
			}
			
		} catch (Exception e) {
			System.out.println(">> Some Exception: "+e);
		}
	}
	
	public void closeConnection() {
		try {
			connection.close();
			System.out.println(">> 4. Connection Closed");
		} catch (Exception e) {
			System.out.println(">> Some Exception: "+e);
		}
	}
	
}
