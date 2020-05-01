
public class MutableStrings {

	public static void main(String[] args) {
		
		// Strings are IMMUTABLE.
		// Manipulation operation gives a new String in memory
		String name = new String("John");
		String fullName = name.concat(" Watson");
		//String fullName = name + " Watson";
		
		System.out.println(">> name is: "+name);
		System.out.println(">> fullName is: "+fullName);
		
		// StringBuffer is MUTABLE. 	|	THREAD-SAFE
		// Any Manipulation Operation will be performed in the Same String
		StringBuffer buffer = new StringBuffer("John");
		buffer.append(" Watson");
		System.out.println(">> buffer is: "+buffer);
		
		// StringBuilder is MUTABLE.	| 	NOT THREAD-SAFE
		// Any Manipulation Operation will be performed in the Same String
		StringBuilder builder = new StringBuilder("John");
		builder.append(" Watson");
		System.out.println(">> builder is: "+builder);
		
		//StringBuffer sb = new StringBuffer(name);	// getting Buffer created from String
		//String s = sb.toString();					// gettin String from Buffer

	}

}
