import java.util.Scanner;	// Scanner Class has to be imported to be used. Built in class.

public class Overloading {

	void addNumbers(int num1, int num2) {
		int result = num1 + num2;
		System.out.println(">> result is: "+result);
	}
	
	// Same function name with same inputs is error
	/*void addNumbers(int num1, int num2) {
		int result = num1 + num2;
		System.out.println(">> result is: "+result);
	}*/
	
	// Same function with same type and number of pnputs with changed variable names is also error
	/*void addNumbers(int n1, int n2) {
		int result = n1 + n2;
		System.out.println(">> result is: "+result);
	}*/
	
	// We can use the same name but with different inputs as in number or type
	void addNumbers(int num1, int num2, int num3) {
		int result = num1 + num2 + num3;
		System.out.println(">> result is: "+result);
	}
	
	void addNumbers(double num1, double num2) {
		double result = num1 + num2;
		System.out.println(">> result is: "+result);
	}
	
	// Variable Arguments
	// can take any number of integer inputs
	void addNumbers(int... inputs) {	// inputs is a reference variable which points to an array
		System.out.println(">> inputs is: "+inputs);
		
		int sum = 0;
		
		for(int num : inputs) {
			sum += num;
		}
		
		System.out.println(">> sum is: "+sum);
	}
	
	// Overloading : Using the same method name to achieve different results
	//				 by making the inputs unique (as in number of inputs / type of inputs)
	
	public static void main(String[] args) {
		
		// Object Construction
		Overloading oRef = new Overloading();
		
		Scanner scanner = new Scanner(System.in);
		System.out.println(">> Enter num1: ");
		int num1 = scanner.nextInt();	// nextDouble() etc...
		
		System.out.println(">> Enter num2: ");
		int num2 = scanner.nextInt();
		
		oRef.addNumbers(num1, num2);
		oRef.addNumbers(10, 20, 30);
		oRef.addNumbers(2.2, 3.3);
		oRef.addNumbers(10, 20, 30, 40, 50);
		
		scanner.close(); // to release the memory resources 
		
		// PS: Method is a piece of logic which can be executed n number of times as in when required

	}

}
