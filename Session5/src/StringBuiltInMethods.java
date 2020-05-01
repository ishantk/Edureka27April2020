
public class StringBuiltInMethods {

	public static void main(String[] args) {
		
		String quote = "Be Exceptional";
		System.out.println(">> quote is: "+quote);
		
		// Strings are IMMUTABLE. We cannot Change them
		// If we manipulate a String it will generate a new String in the memory
		String newQuote = quote.toUpperCase();			// toLowerCase()

		System.out.println(">> quote now is: "+quote);
		System.out.println(">> newQuote is: "+newQuote);
		
		String names = "John, Jennie, Jim, Jack, Joe";
		
		int length = names.length();
		System.out.println(">> length of names is: "+length);
		
		//char ch = names.charAt(1);
		char ch = names.charAt(length-1);
		System.out.println(">> ch is: "+ch); //e
		
		int idx = names.indexOf('o');	// search o from beginning and give the index
		System.out.println(">> idx of o is: "+idx);
		
		idx = names.lastIndexOf('o');	// search o from the end and give the index
		System.out.println(">> last idx of o is: "+idx);
		
		idx = names.indexOf("Jack"); // from where Jack's J starts
		System.out.println(">> idx of Jack is: "+idx);
		
		// Get Array of Characters from String
		char[] chArr = names.toCharArray();
		int jCount = 0; 
		for(char c : chArr) {
			System.out.print(c+" ");
			if(c == 'J') {
				jCount++;
			}
		}
		System.out.println();
		System.out.println(">> Total J found in "+names+" is: "+jCount);
		
		String replaceNames = names.replace('J', 'K');
		System.out.println(">> names are: "+names);
		System.out.println(">> replacedNames are: "+replaceNames);
		
		String s1 = names.substring(3);	// from 3rd index till the end
		System.out.println(">> s1 is: "+s1);
		
		// String Slicing
		String s2 = names.substring(1, 5);	// from 1st index till less than 5
		System.out.println(">> s2 is: "+s2);
		
		String[] strArr = names.split(",");
		for(String str : strArr) {
			System.out.println(">> str is: "+str.trim());
		}
		
		String email = "john@example.com";
		if(email.contains(".") && email.contains("@")) {
			System.out.println(">> Email "+email+" is a Valid Email");
		}else {
			System.out.println(">> Email "+email+" is a NOT a Valid Email");
		}
		
		String fileName  = "abc.pptx";
		System.out.println(">> "+fileName+" can be opened with PowerPoint ?"+fileName.endsWith(".pptx"));	// startsWith

	}

}
