/*
 
 	OOPS
 	~~~~
 	
 	Object : RW: Anything which exist in reality.
 			 CS: Multi Value Container which shall contain data.
 			 
 			 eg: RW: bottle, chair, car, mobile
 			 	 CS: above objects are represented through their information as attributes with values in a container
 			 	 
 	Class:  description of of any object / drawing of an object	
 	
 		 	 
 	Client Project:
 	> We need an app where user registers.
 	> We must be able to display a list of restaurants
 	> Every Restaurant has a Menu, where Menu shall display the dishes
 	> User should be able to order a dish from restaurant by adding it into the cart
 	> Different payment methods along-with COD to be integrated
 	
 	 eg: Zomato/Swiggy/UberEats
 	 
 	OOPS Principle:
 	~~~~~~~~~~~~~~~
 	1. Think of an Object i.e. Identify Object form Project Requirements.
 	   List all those details which are associated to it. all those means as many as you can
 	2. Create the class of Object
 	3. From the Class Create aReal Object in the Memory   
 		 	 
 
 */

// 1. Think of an Object
//    User is an Object as it has lot of details associated to it
// 	  User			: name, phone, email, gender, age, address etc...
//	  Restaurant 	: name, phone, email, category, address, pricePerPerson, ratings, reviews etc....


// 2. Create the Class for the Object
// 	  Class is JUST a REPRESENTATION of an OBJECT

class User{ // Here, this is a representation of User Object in the memory
	
	// Attributes: written in class BUT, property of Object
	// Also known as State, Instance Variables, Data Members etc...
	String name;
	String phone;
	String email;
	char gender;
	int age;
	String address;
	
	// Constructors : written in class BUT, property of Object
	// Same name as that of class name with no return type
	
	// default constructor / No-Arg Constructor
	/*User(){
		name = null;
		phone = null;
		email = null;
		gender = ' ';
		age = 0;
		address = null;
	}*/
	
	// We can put up the default values for Object's attributes in the constructor
	// The moment Object is created, constructor is executed automatically :)
	User(){
		name = "NA";
		phone = "NA";
		email = "NA";
		gender = 'U';
		age = 0;
		address = "NA";
	}
	
	// Arg Constructor i.e. Constructor with Inputs
	User(String name, String phone, String email, char gender, int age, String address) {
		this.name = name;
		this.phone = phone;
		this.email = email;
		this.gender = gender;
		this.age = age;
		this.address = address;
	}
	
	// CONSTRUCTOR OVERLOADING : Same Name with Different Inputs :)
	
	
	// Methods: written in class BUT, property of Object
	void setDetailsForUser(String name, String phone, String email, char gender, int age, String address) {
		// As of now we have a confusion
		// inputs and attributes they are same names
		// this.name in the LHS represents attribute of object
		// name in the RHS represents input to method setDetailsForUser
		// this is a reference variable which represents OBJECT 
		this.name = name;
		this.phone = phone;
		this.email = email;
		this.gender = gender;
		this.age = age;
		this.address = address;
	}
	
	void showUserDetails() {
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		System.out.println(name+" lives in "+address+" Phone: "+phone);
		System.out.println(name+" is "+age+" years old and Gender: "+gender);
		System.out.println("For Email: "+email);
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
	}
}

// OOPS is main class of our Program as it container main method
// Typically we dont code attributes here
public class OOPS {	// This class may be the one which we wish to be used to execute the main :)

	// whatever we wish to execute we should write in the main
	public static void main(String[] args) {

		// Single Value Storage Container 
		int i = 10;
		
		// Homo Multi Value Container
		int[] array = new int[]{10, 20, 30, 40, 50};
		
		// Homo/Hetro Multi Value Container
		// 3. Create a User Object
		// Object Construction Statement
		User user1 = new User();
		User user2 = new User();
		
		// user1 and user2 are reference variables.
		// new User() creates object in the memory dynamically i.e. at Run Time
		// and Object is constructed in the Heap Area with a HashCode
		
		// Reference Copy
		// Not OBJECT CONSTRUCTION
		User user3 = user1;
		
		System.out.println(">> i is: "+i);
		System.out.println(">> array is: "+array);
		System.out.println(">> user1 is: "+user1);
		System.out.println(">> user2 is: "+user2);
		System.out.println(">> user3 is: "+user3);

		// i is a variable containing value
		// array and user1 are Reference Variables containing HashCodes
		
		// Processing Data in Object
		// 1. Write Data in Object
		/*
		user1.name = "John";
		user1.phone = "+91 99999 88888";
		user3.email = "john@example.com";
		user3.gender = 'M';
		user1.age = 24;
		user1.address = "Redwood Shores";
		
		// 1. Update Data in Object
		user1.name = "John Watson";
		user1.email = "john.watson@example.com";
		
		user2.name = "Fionna";
		user2.phone = "+91 99999 11111";
		user2.email = "fionna@example.com";
		user2.gender = 'F';
		user2.age = 26;
		user2.address = "Country Homes";
		
		// 2. Read the Data
		System.out.println(user1.name+" lives in "+user3.address+" and cane be communicated at "+user1.email);
		System.out.println(user2.name+" lives in "+user2.address+" and cane be communicated at "+user2.email);
		*/
		
		user1.setDetailsForUser("John", "+91 99999 88888", "john@example.com", 'M', 24, "Redwood Shores");
		user2.setDetailsForUser("Fionna", "+91 99999 11111", "fionna@example.com", 'F', 26, "Country Homes");
		
		System.out.println("user1 details: ");
		user1.showUserDetails();
		
		System.out.println("user2 details: ");
		user2.showUserDetails();
		
		System.out.println("user3 details: ");
		user3.showUserDetails(); // user1 and user3 share the same object
		
		// Delete Operation : Automatically
		// Garbage Collector will delete unused objects from the memory automatically
		// So we don't worry about memory to be freed up: But in case you wish -> System.gc(); can be executed
		
		// CHALLENEGE:
		// Writing and reading data for n-number of objects may become time consuming for developer if use above approach
		
		// SOLUTION:
		// Methods within object to process data 
		
		User user4 = new User();
		user4.showUserDetails(); // Default Values will be shown
		// PS: Whenever we create an Object, attributes will have some default values
		//     Compiler creates a Constructor in the Class which will set these default values
		
		// Set the data at the time of Object Construction :)
		User user5 = new User("Leo", "+91 98765 90909", "leo@example.com", 'M', 30, "Eastern Shores");
		user5.showUserDetails();
	
	}

}
