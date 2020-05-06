package co.edureka.one;

public class App {

	public static void main(String[] args) {
		
		// Create Objects
		One oRef = new One();
		Two tRef = new Two();
		
		// Access Methods
		//oRef.pvtShow();
		oRef.defShow();
		oRef.protShow();
		oRef.pubShow();
		
		System.out.println();
		//tRef.pvtShow();
		tRef.defShow();
		tRef.protShow();
		tRef.pubShow();

	}

}

// PS: only private is not accessible
//     others are all accessible
