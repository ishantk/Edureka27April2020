// final class cannot be inherited i.e. cannot be extended
final class CC{
	
	int i = 10;
	
	final int j; // Blank Final Variable
	
	CC(){
		j = 100;	// This is the Value to the FinalVariable which further cannot be modified
	}
	
	// final functions cannot be re-defined in Children i.e. cannot be Overrided
	final void show() {
		System.out.println(">> This is show of CC");
	}
}

//class CD extends CC{ // error
	
	/*void show() { // err
		System.out.println(">> This is show of CD");
	}*/
	
//}

public class FinalKeyword {

	public static void main(String[] args) {
		
		// final is constant. We cannot modify it further
		final int age = 10;
		// age = 12; error
		
		CC cRef = new CC();
		cRef.show();
		
		cRef.i = 100;
		
		int i;	// blank
		i = 10; // assigning the 1st initial value
		
		final int k; // blank
		k = 10; // assigning the 1st initial value

	}

}
