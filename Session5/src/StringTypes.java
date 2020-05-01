
public class StringTypes {

	public static void main(String[] args) {
		
		// Interned Strings
		// s1 and s2 points directly to the String literal
		String s1 = "Hello";
		String s2 = "Hello";
		
		// String Objects i.e. new String(value);
		// s3 and s3 points to the String object which contains the String data 
		String s3 = new String("Hello"); 
		String s4 = new String("HELlo");

		System.out.println(">> s1 is: "+s1);
		System.out.println(">> s2 is: "+s2);
		System.out.println(">> s3 is: "+s3);
		System.out.println(">> s4 is: "+s4);
		
		// == -> will compare references
		// == will not compare data, rather the references 
		if(s1 == s2) {
			System.out.println("s1 == s2");
		}else {
			System.out.println("s1 != s2");
		}
		
		if(s3 == s4) {
			System.out.println("s3 == s4");
		}else {
			System.out.println("s3 != s4");
		}
		
		if(s1 == s3) {
			System.out.println("s1 == s3");
		}else {
			System.out.println("s1 != s3");
		}
		
		System.out.println("~~~~~~~~~~~");
		
		// For String Data Comparison use equals or compareTo method always
		if(s1.equals(s2)) {
			System.out.println("s1 equals s2");
		}else {
			System.out.println("s1 not equals s2");
		}
		
		//if(s3.equals(s4)) {
		if(s3.equalsIgnoreCase(s4)) {
			System.out.println("s3 equals s4");
		}else {
			System.out.println("s3 not equals s4");
		}
		
		if(s1.equals(s3)) {
			System.out.println("s1 equals s3");
		}else {
			System.out.println("s1 not equals s3");
		}
		
		//if(s3.compareTo(s4) == 0) {
		if(s3.compareToIgnoreCase(s4) == 0) {
			System.out.println("s3 copmared to s4");
		}else {
			System.out.println("s3 not copmared to s4");
		}
		
		
	}

}
