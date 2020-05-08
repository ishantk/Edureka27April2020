package co.edureka.lang;

public class WrapperClasses {

	public static void main(String[] args) {
		
		// Primitive int data type
		int i = 10; // Primitive Type
		
		// Integer Object
		//Integer iRef = new Integer(10); // Reference Type to represent Integer
		
		// Converting Primitive to Integer Object
		// BOXING
		Integer iRef = new Integer(i); // Reference Type to represent Integer
		
		// Extract Primitive from Reference Type Integer Object
		// UNBXOING
		int j = iRef.intValue(); // Get the int value
		
		char ch = 'A';
		Character cRef = new Character(ch);	// Boxing
		char ch1 = cRef.charValue();
		
		double d = 2.2;
		Double dRef = new Double(d);		// Boxing
		double e = dRef.doubleValue();
		
		// AUTO-BOXING
		Integer iRef1 = i; // gets converted by compiler as Integer iRef1 = new Integer(i);
		
		// AUTO-UNBOXING
		int k = iRef1;     // gets converted by compiler as Integer int k = iRef1.intValue();
		
		// RTP on Wrapper Classes :)
		Object o = new Integer(10);
		o = new Double(2.2);
		o = new Character('A');
				

	}

}
