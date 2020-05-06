package co.edureka.two;

import co.edureka.one.One;	// One being public is imported
//import co.edureka.one.Two;	// Two being default cannot be imported

public class App {

	public static void main(String[] args) {
		
		One oRef = new One();
		//oRef.pvtShow();
		//oRef.defShow();
		//oRef.protShow();
		oRef.pubShow();
		
	}

}

// private is only within the class
// default is only within the package/ so is protected for the time being
// public is within the package and outside the package

// diff between default and protected to be explored ?