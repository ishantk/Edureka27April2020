
public class Casting {

	public static void main(String[] args) {
		
		// number1 is container in stack	 -> 8 bits
		// 120 is literal in constant pool 	 -> 32bits
		
		// Java Compiler will accommodate integers and shall do down-casting automatically
		// till time the literal is in the range of the size
		byte number1 = 120;

		// Not true for Foating Points
		// Here also, pi is container in stack 			-> 32 bits
		//            3.14 is literal in constant pool  -> 64bit
		//float pi = 3.14; // error
		//float pi = 3.14f;
		float pi = (float)3.14;		// Explicit Casting | Down Casting
		
		// 128 is out of range
		// perform casting to bring the data back into the range of container
		// This may be loss of original value
		byte number2 = (byte)257;	// Explicit Casting | Down Casting
		System.out.println("number2 is: "+number2);
		
		// This is automatically up casting
		// 12345(32 bits) is copied into number3 (64bits)
		long number3 = 12345;
		
		// i wish to process only integral data :)
		int n1 = (int)(number1 * pi);	// example where we may need casting
		
	}

}
