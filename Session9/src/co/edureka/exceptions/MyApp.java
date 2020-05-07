package co.edureka.exceptions;

import java.util.Scanner;

public class MyApp {

	public static void main(String[] args) {
		
		System.out.println(">> App Started");
		
		int[] array = {10, 20, 30, 40, 50};
		
		// Intialization Before Use Principle : Always initialize Local Variables (in a method) before use
		int a=0, b=0, c=0;
		
		Scanner scanner = new Scanner(System.in);

		// Having try and catch makes Program Robust
		// Our App wont crash :)
		try {
			System.out.println(">> array[2] is: "+array[2]);	// if error occurs here, control jumps to catch and nothing else below will be executed in try
			
			System.out.println(">> Enter a and b values:");
			a = scanner.nextInt();
			b = scanner.nextInt();
			
			c = a/b;
			System.out.println(">> c is: "+c);
			
		}/*catch(ArrayIndexOutOfBoundsException aRef) {
			System.out.println(">> Some Array Exception: "+aRef);
		}catch(ArithmeticException aRef) {
			System.out.println(">> Some Arithmetic Exception: "+aRef);
		}*/
		catch(Exception eRef) {	// Run Time Polymorphism : Parent Class Exception Ref Var can point to any Exception Object being thrown by JVM at Run Time
			System.out.println(">> Some Exception: "+eRef);
		}finally { // either you handle the exception or not -> finally with try will be executed
			System.out.println(">> This will always be executed");
		}

		
		scanner.close();
		System.out.println(">> App Finished");

	}

}
// Normal/Graceful Termination of Program -> All the statements in the main are executed
	// Error -> 1. Compile Time (At the time of Program Creation)
	//		    2. Run Time (At the time of Program Execution)

// Due to Run Time Error, Program is disrupted
// Abnormal Termination of Program -> Statements in the main were left to be executed due to some error
// Error at Run Time -> Exception
// RTE will always end up in OS showing -> Unfortunately, Your App Stopped Working


/*
 
 	try{
 	
 	}catch(){
 	
 	}
 	
 	try{
 	
 	}catch(){
 	
 	}catch(){
 	
 	}
 	
 	
 	try{
 	
 	}finally{
 	
 	}
 	
 	try{
 	
 	}catch(){
 	
 	}finally{
 	
 	}
 	
 	try{
 	
 	}catch(){
 	
 	}catch(){
 	
 	}finally{
 	
 	}
 	
 	try{
 		try{
 	
	 	}catch(){
	 	
	 	}finally{
	 	
	 	}
 	}catch(){
 		try{
 	
	 	}catch(){
	 	
	 	}finally{
	 	
	 	}
 	}finally{
 		try{
 	
	 	}catch(){
	 	
	 	}finally{
	 	
	 	}
 	}
 
 
 */


