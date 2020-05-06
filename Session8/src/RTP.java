import java.util.Scanner;

/*class Cab{
	
	int baseFare;
	
	Cab(){
		baseFare = 100;
		System.out.println(">> Cab Obejct Constructed");
	}
	
	void bookCab(String source, String destinition) {
		System.out.println(">> Cab Booked from "+source+" to "+destinition);
		System.out.println(">> Please Pay \u20b9"+baseFare);
	}
	
}*/

// For abstract class, we cannot create Objects
// i.e. We cannot write Cab cab = new Cab(); -> PS: cab is ref var and new Cab(); creates the Object
// BUT, for the purpose of Inheritance, Before the Object of Child, Object of Parent is constructed in the memory
//      RTE i.e. JVM will create the Object of Cab for Inheritance Purpose
abstract class Cab{
	
	int baseFare;
	
	Cab(){
		baseFare = 100;
		System.out.println(">> Cab Obejct Constructed");
	}
	
	// abstract method is created only in abstract class
	// abstract method is a RULE
	// RULE must be defined by Children
	// If we have n-number of abstract methods, all of them must be defined by Children
	abstract void bookCab(String source, String destinition);
	
	void show() {
		System.out.println(">> This is show in abstract class");
	}
	
}

// PS: Implement the Interface here :)
/*interface Cab{
	
}*/

class MiniCab extends Cab{
	
	MiniCab(){
		baseFare += 50;
		System.out.println(">> MiniCab Obejct Constructed");
	}
	
	// Method Overriding -> Same Method as that was in the Parent with same inputs :)
	void bookCab(String source, String destinition) {
		System.out.println(">> Mini Cab Booked from "+source+" to "+destinition);
		System.out.println(">> Please Pay \u20b9"+baseFare);
		System.out.println(">> Free Wifi in Your Mini Cab Available");
	}
}

class SedanCab extends Cab{
	
	SedanCab(){
		baseFare += 80;
		System.out.println(">> SedanCab Obejct Constructed");
	}
	
	// Method Overriding -> Same Method as that was in the Parent with same inputs :)
	void bookCab(String source, String destinition) {
		System.out.println(">> Sedan Cab Booked from "+source+" to "+destinition);
		System.out.println(">> Please Pay \u20b9"+baseFare);
		System.out.println(">> Free Wifi and Prime Videos in Your Sedan Cab Available");
	}
}

class Bike extends Cab{
	
	Bike(){
		baseFare += 20;
		System.out.println(">> Bike Obejct Constructed");
	}
	
	// Method Overriding -> Same Method as that was in the Parent with same inputs :)
	void bookCab(String source, String destinition) {
		System.out.println(">> Bike Booked from "+source+" to "+destinition);
		System.out.println(">> Please Pay \u20b9"+baseFare);
		System.out.println(">> Helment Available for Your Ride");
	}
}


public class RTP {

	public static void main(String[] args) {
		
		//Cab cRef = new MiniCab(); // OK
		//MiniCab mRef = new Cab(); // ERROR
		
		// This is the Object of Parent
		// Do we any time have the need of it ? NO, as we will focus on typically creating Objects of Children here
		// We dont need the Parent Object to be created directly
		//Cab cab = new Cab();
		
		// bookCab is quite a generic method. we dont what type of Cab is booked.
		// Do we any time have the need of it ? NO, as we will not execute this
		//cab.bookCab("Pristine Magnum", "Country Homes");
		
		
		Cab cab = null;	// Reference Variable of Parent
		// cab = new Cab(); // Error Now
		// cab as ref var can only be used to point to child objects now :)
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println(">> Select a Cab to Book: ");
		System.out.println(">> 1. Mini Cab");
		System.out.println(">> 2. Sedan Cab");
		System.out.println(">> 3. Bike");
		
		int choice = scanner.nextInt();
		
		scanner.nextLine();
		
		System.out.println(">> Enter Source:");
		String source = scanner.nextLine();
		
		System.out.println(">> Enter Destinition:");
		String destinition = scanner.nextLine();
		
		
		switch (choice) {
			
			case 1:
				// Parent's Ref Variable can Point to the Child Object
				// Polymorphic Statement
				cab = new MiniCab();
				break;
				
			case 2:
				cab = new SedanCab();
				break;
				
			case 3:
				cab = new Bike();
				break;
		}
		
		// In the above switch case
		// cab can be either, MiniCab or SedanCab or Bike
		// RUN TIME POLYMORPHISM
		
		cab.bookCab(source, destinition);
		scanner.close();
		
		
	}

}
