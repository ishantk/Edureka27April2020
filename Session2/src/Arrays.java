
public class Arrays {

	public static void main(String[] args) {
		
		// Primitve Type:
		int number = 10;
		System.out.println(">> number is: "+number);	// giving us the data within the container : Value
		
		// Reference Type:
		// Array of Integers
		// Array is a Homo Multi Value Container of Fixed Size
		int[] numbers = {10, 20, 30, 40, 50}; 			// size is automatically fixed to 5
		System.out.println(">> numbers is: "+numbers);  // giving us the data within the container	: HashCode
		
		
		
		// Read the data from Array
		System.out.println(">> numbers[0] is: " + numbers[0]);
		System.out.println(">> numbers[4] is: " + numbers[4]);
		//System.out.println(">> numbers[5] is: "+numbers[5]); // Trying to access any element in Array which is out of range will be error at run time
		//numbers[5] = 89; // error at run time
		
		// Update Data In Array
		numbers[1] = 111;
		numbers[3] = 333;
		
		System.out.println(">> numbers[1] is: "+numbers[1]);
		System.out.println(">> numbers[3] is: "+numbers[3]);
		
		// 10 gets converted automatically to 10.0
		double[] numbers1 = {10, 22, 33.33, 44.44, 55.0};
		System.out.println(">> numbers1[0] is: "+numbers1[0]);
		
		// Deletion
		// For Array Happens Automatically. Whenever It is no Longer needed -> Garbage Collector will delete it
		// Or at the end of main automatically everything is deleted :)
		
		// GC is a program which gets executed after an interval of time
		// Any Reference Type container if available in heap and is of no use will be deleted by it
		
		// We can ourselves execute that program with System.gc();
		System.gc(); // Explicit Execution of Garbage Collector to remove un-sued things from Heap Area
		
		
		// PS: Reference Types are stored in Heap | We have a reference variable
		//				 int[] numbers = {10, 20, 30, 40, 50};  -> numbers is a reference variable which stores the HashCode of Array which is in the Heap
		//     Primitives are stored in Stack 
	}

}
