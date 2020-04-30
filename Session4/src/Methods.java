/*
 	Mathematically,	
 	f(x) = x*x
 	for x: 1 -> f(x) -> 1
 	for x: 2 -> f(x) -> 4
 	for x: 3 -> f(x) -> 9
 */

public class Methods {

	// Programatically,
	// return type 	: void or any data type i.e. primitive or reference
	// fun 			: name of function, any name of your choice
	// int x		: input to function, can be any number of inputs and can be primitives or references or both
	// {}			: definition of function i.e. what function is going to do
	
	// Non Static
	void fun(int x) {
		int result = x * x;
		System.out.println(">> result of fun("+x+") is: "+result);
	}
	
	// Static
	static void funAgain(int x) {
		int result = x * x;
		System.out.println(">> result of fun("+x+") is: "+result);
	}
	
	// double : return type which means function must return some double data in the end of execution
	// applyPromoCode is the name of function
	// promoCode is 1st input and int 
	// amount is 2nd input which is double type
	
	// Non Static
	double applyPromoCode(int pormoCode, double amount) {
		
		double amountToPay = 0;
		
		if(pormoCode == 1001) {
			amountToPay = amount - 0.5*amount;
			System.out.println("Promo Code Applied");
		}else {
			amountToPay = amount;
			System.out.println("Promo Code Not Applicable");
		}
		
		return amountToPay;	// return in the end. this is the last statement. any code below this line is not reachable
	}
	
	// Static
	static double applyPromoCodeAgain(int pormoCode, double amount) {
		
		double amountToPay = 0;
		
		if(pormoCode == 1001) {
			amountToPay = amount - 0.5*amount;
			System.out.println("Promo Code Applied");
		}else {
			amountToPay = amount;
			System.out.println("Promo Code Not Applicable");
		}
		
		return amountToPay;	// return in the end. this is the last statement. any code below this line is not reachable
	}
	
	// Non Static 
	void addNumbers(int num1, int num2) {
		System.out.println(">> addition result of "+num1+" and "+num2+" is: "+(num1+num2));
	}
	
	// Static
	static void addNumbersAgain(int num1, int num2) {
		System.out.println(">> addition result of "+num1+" and "+num2+" is: "+(num1+num2));
	}
	
	public static void main(String[] args) {
		System.out.println(">> Program Execution Started");
		
		// Execution Of Methods:
		// We need to create an Object of class Methods
		// PS: What is an Object -> We will discuss later
		
		// Object Construction Statement
		// Object Creation Syntax -> ClassName refVarName = new ClassName();
		Methods mRef = new Methods();	
		
		// We need Object for execution of Methods and mRef is a Reference Variable pointing to some object
		mRef.fun(3);
		double result = mRef.applyPromoCode(1001, 400.44);
		System.out.println(">> Amount To Pay is: "+result);
		mRef.addNumbers(10, 20);
		
		System.out.println("~~~~~~~~~~");
		
		// To execute a method which is static, we don't need objects. Class Name itself can be used to execute them :)
		Methods.funAgain(11);
		result = Methods.applyPromoCodeAgain(1001, 560.56);
		Methods.addNumbersAgain(11, 22);
		
		
		System.out.println(">> Program Execution Finished");
		// PS: Methods can be created anywhere in the class, before or after the main

	}

}
