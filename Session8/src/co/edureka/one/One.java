package co.edureka.one;

// One is public
public class One {
	
	// Either attributes or methods can be any one out of four: private, default, protected or public
	
	private void pvtShow() {
		System.out.println(">> This is private show of One");
	}
	
	void defShow() {
		System.out.println(">> This is default show of One");
	}
	
	protected void protShow() {
		System.out.println(">> This is protected show of One");
	}
	
	public void pubShow() {
		System.out.println(">> This is public show of One");
	}

}

// Two is default i.e. we havent used any access modifier
class Two{
	
	private void pvtShow() {
		System.out.println(">> This is private show of Two");
	}
	
	void defShow() {
		System.out.println(">> This is default show of Two");
	}
	
	protected void protShow() {
		System.out.println(">> This is protected show of Two");
	}
	
	public void pubShow() {
		System.out.println(">> This is public show of Two");
	}
	
}

/*
private class Three{	// err
	
}

protected class Four{	// err
	
}
*/

// We can have only 1 public class in 1 .java file
// As .java file must be of the same name as that of public class
/*public class Five{
	
}*/

// We can have n-number of default classes as we want
class Six{
	
}

//PS: we get the byte codes for the classes we make in our java file
//	  classes cannot be private or protected as we can see above