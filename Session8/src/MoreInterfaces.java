interface Inf1{
	void show();
	void hello();
}

interface Inf2{
	void hello();	// public abstract void hello();
	void bye();
}

// Multiple Inheritance on Interfaces
interface Inf3 extends Inf1, Inf2{
	int i=10;	// public static final int i = 10;
	
	// static method: means methods of interfaces and not of objects
	static void hi() {
		System.out.println(">> this is hi from interface");
	}
}

// We can have Multiple Implementation and this is not Multiple Extension i.e. Inheritance
class CA implements Inf3{//Inf1, Inf2{
	
	public void show() {
		System.out.println(">> This is show in CA");
	}
	
	public void hello() {
		System.out.println(">> This is hello in CA");
	}
	
	public void bye() {
		System.out.println(">> This is bye in CA");
	}
}

public class MoreInterfaces {

	public static void main(String[] args) {
		
		// Interface Ref Var can point to the Object of class which implements it
		Inf1 iRef1 = new CA();
		iRef1.show();
		iRef1.hello();
		
		//iRef1.bye(); // error
		
		System.out.println();
		
		Inf2 iRef2 = new CA();
		iRef2.hello();
		iRef2.bye();
		
		//iRef2.show(); // error
		
		System.out.println();
		
		Inf3 iRef3 = new CA();
		iRef3.show();
		iRef3.hello();
		iRef3.bye();
		
		System.out.println(">> i is: "+Inf3.i);
		
		Inf3.hi();
		
		
	}

}
