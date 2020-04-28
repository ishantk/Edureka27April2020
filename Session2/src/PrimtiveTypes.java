/*
 	
 	MODEL
	Data : Before Booking: sourceLocation, destinationLocation, typeOfCab
		   After Booking : driverDetails, cabDetails
	
	CONTROLLER
	Logic: Finding Shortest Distance, Least Traffic, Nearest Driver	(COMPUTATION)
	
	VIEW
	I/O  : The UI on which user will input the data and after logical processing solution will display some results as a solution
	
	In Software Industry we follow Architectures and Design Patterns to create solutions:
		MVC Architecture
		MODEL VIEW CONTROLLER
		
		
	MODEL -> We need to work on Data :)
			 Data may be a single value or some continuous values :)
 			 
 			 For Data we have Single Value Containers i.e. Boxes in which we can store data with single value
 			 eg: username
 			 	
 			 	Primitive Data Types to Store Single Value Data
 			 
 			 We also have Multi Value Containers which shall store lot of data
 			 	Homo Container
 			 	Hetro Container
 			 	
 			 	Reference Data Types to Store Multi Value Data
 */

public class PrimtiveTypes {

	public static void main(String[] args) {
		
		// Primitive Data Types:
		// Shall store data which is Single Value
		
		// 1. Storage Container Creation Statement -> Container or BOX gets created in the memory with a value
		//    value 30, 20, 33, 118276182 is known as literal
		//    johnsAge, jenniesAge, jacksAge, siaSalary are container names or variables
		int johnsAge = 30;			// 4 bytes | 32 bits
		byte jenniesAge = 20;		// 1 byte  | 8 bits
		short jacksAge = 33;		// 2 bytes | 16 bits
		long siaSalary = 118276182; // 8 bytes | 64 bits

		// consider byte data type which is 8 bits
		// its means 2 power 8 i.e. 256
		// divide 256 by 2 -> -128 to 0 to 127 as the range for data to be stored in the byte container
		
		// 2. Storage Container Updation Statement -> We can manipulate the value in Container
		johnsAge = 31;
		jenniesAge = 22;
		
		// 3. Read Container to Display the data within
		System.out.println("johnsAge is: "+johnsAge);
		System.out.println("jenniesAge is: "+jenniesAge);
		System.out.println("jacksAge is: "+jacksAge);
		System.out.println("siaSalary is: "+siaSalary);
		
		
		// 4. Deletion of Storage Containers
		//    This happens automatically when main will finish :)
		
		// Hence, Containers i.e. primitive types are also known as Automatic Variables
		
		float profit1 = 112.55f;		// 32 bits
		double profit2 = 123.55;		// 64 bits
		
		// literals i.e. values they are also stored in the memory and occupies a space
		// In RAM we will have a Constant Pool in which literals are stored
		// 123.55 uses 64 bit of storage space in ConstantPool
		// 112.55f uses 32 bits of storage space in ConstantPool
		
		int number1 = 107635178;
		long number2 = 107635178923l;
		
		// 107635178 uses 32 bits of storage space in ConstantPool
		// 107635178923l uses 64 bits of storage space in ConstantPool
		
		char ch1 = 'A';			// single quotes
		char ch2 = 97;			// ASCII CODE
		char ch3 = '\u20b9';	// Unicode	https://unicode-table.com/en/
		
		System.out.println("ch1 is: "+ch1);
		System.out.println("ch2 is: "+ch2);
		System.out.println("ch3 is: "+ch3);
		
		boolean isInternetOn = true;
		isInternetOn = false;
	}
	

}
