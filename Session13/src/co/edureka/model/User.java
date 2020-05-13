package co.edureka.model;

// User Object Structure -> MODEL (Data)
public class User {
	
	public int uid;
	public String name;
	public String email;
	public String password;
	
	public User() {
		
	}
	
	public User(int uid, String name, String email, String password) {
		this.uid = uid;
		this.name = name;
		this.email = email;
		this.password = password;
	}

	@Override
	public String toString() { // so that reference variable printing shows the content rather than HashCode
		return "User [uid=" + uid + ", name=" + name + ", email=" + email + ", password=" + password + "]";
	}

}

/*
	SQL : Structured Query Language
	ORM : Object Relational Mapping
	
	// This is exactly what the structure of my Object is !
	 
	Java:
	class User {
	
		int uid;
		String name;
		String email;
		String password; 
		
	}	
	
	User user = new User(1, "John", "john@example.com", "pass123");
	user.setDetails(1, "John Watson", "john.watson@example.com");
	 
	SQL: 
	create table User(
		uid int primary key auto_increment,
		name varchar(256),
		email varchar(256),
		password varchar(256)
	)
	
	insert into User values(null, 'John', 'john@example.com', 'pass123')
	update User set name = 'John Watson', email='john.watson@example.com' where uid = 1
	delete from User where uid = 1
	select * from User
	select name, email from User
	select name, email from User where uid = 1
	
*/