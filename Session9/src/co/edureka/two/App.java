package co.edureka.two;

import co.edureka.one.One;		// One being public is imported
//import co.edureka.one.Two;	// Two being default cannot be imported

// Across the Package Inheritance
// Child CA in package two, cannot access Parent's private and default data/methods
// But protected can be :)
class CA extends One{
	
	void show() {
		System.out.println("START ~~~~CA's show~~~~");
		//pvtShow();
		//defShow();
		
		protShow();	// this is visible only in this child class boundary
		//pubShow();
		System.out.println("END ~~~~CA's show~~~~");
	}
	
}

public class App {

	public static void main(String[] args) {
		
		One oRef = new One();
		//oRef.pvtShow();
		//oRef.defShow();
		//oRef.protShow();
		oRef.pubShow();
		
		System.out.println();
		
		CA cRef = new CA();
		cRef.show();
		cRef.pubShow();
		//cRef.protShow();	// protected show is not directly accessible
		
	}

}

// private is only within the class
// default is only within the package/ so is protected for the time being
// public is within the package and outside the package

// diff between default and protected to be explored ?