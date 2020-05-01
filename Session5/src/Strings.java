
public class Strings {

	public static void main(String[] args) {
		
		char ch = 'A'; 			// can store only 1 single character
		
		// String is a Reference Type
		String word = "Hello";	// can store more than 1 character
		String sentence = "Work Hard, Get Luckier";
		
		System.out.println(">> ch is: "+ch);
		
		// If String is Reference Type, it must show HashCodes
		// We don't See HashCodes, rather we see the data directly :)
		System.out.println(">> word is: "+word);
		System.out.println(">> senetence is: "+sentence);
		
		// toString is automatically executed whenever we print reference variable of Strings 
		System.out.println(">> word.toString() is: "+word.toString());
		System.out.println(">> senetence.toString() is: "+sentence.toString());
		
		// Implementation of toString gives the value i.e. data rather than HashCode when we print Strings

	}

}
