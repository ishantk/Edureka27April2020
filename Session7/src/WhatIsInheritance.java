// Class is Representation how an object looks like
// Parent Object will have 3 attributes, constructor and a method
class Parent{
	
	String fname;
	String lname;
	int wealth;
	
	Parent(){
		System.out.println(">> Parent Object Constructed");
		fname = "John";
		lname = "Watson";
		wealth = 100000;
	}
	
	void showDetails() {
		System.out.println(">> "+fname+" "+lname+" has \u20b9"+wealth);
	}
	
}

//Class is Representation how an object looks like

// 1.
//Child Object will have 0 attributes, constructor and no method

// 2. 
// Child Object will have 3 attributes, constructor
class Child extends Parent{	// extends -> Inheritance | It creates a Relationship
	
	String fname;
	int wealth;
	String vehicle;
	
	// super as a reference variable can be used in this class anywhere to acess Parent's attributes or methods
	
	Child(){
		System.out.println(">> Child Object Constructed");
		fname = "Fionna";
		wealth = 70000;
		vehicle = "KA10AB1234";
	}
	
	void updateWealth(int n) {
		wealth = wealth - n;
		super.wealth = super.wealth - n;
	}
	
	// Method Overriding
	void showDetails() {
		super.showDetails();	// Execute showDetails of Parent
		System.out.println(">> "+fname+" "+lname+" has \u20b9"+wealth+" with Vehicle "+vehicle);
	}
}

public class WhatIsInheritance {

	public static void main(String[] args) {
	
		//Parent pRef = new Parent();
		//pRef.showDetails();

		// We are creating JUST the child Object
		Child cRef = new Child();
		// RULE #1 : In Inheritance, Before the Object of Child, Object of Parent is constructed in memory
		//		     If B extends A, A is Parent and B is Child
		
		// RULE #2 : Whatsoever belongs to Parent, can be accessed by Child in case it does not have it

		// 1. Update wealth attribute in the Parent Object
		// 2. In case wealth is attribute in Child Object, it will update its own and not of Parent
		//cRef.wealth = cRef.wealth - 5000;
		//cRef.super.wealth = cRef.super.wealth - 5000; // super can only be accessed within class boundary
		
		cRef.updateWealth(5000);
		
		// Child Object has no showDetails method, it will access its parent's method
		cRef.showDetails();
	}

	//PS: this is reference variable for the Current Object
	//    super is reference variable for the Parent Object
	
	// RULE #3 private -> Any Attribute or Method marked as private in Parent, will not be accessible by Child
	
}
