/*
 	
 	MODEL
 		Data
 	VIEW
 		UI
 	CONTROLLER
 		Logic
 			1. Operators | Mathematical and Logical Computation
 			2. Conditional Flows
 			3. Iterations
 	
 */

public class Operators {

	public static void main(String[] args) {
		
		// Arithmetic -> +, -, *, /, %
		double amount = 200.20;
		double discount = 0.20;
		double taxes = 0.18;
		
		amount = amount - amount*discount;
		System.out.println(">> Amount After 20% Discount is: \u20b9"+amount);
		
		amount = amount + taxes*amount;
		System.out.println(">> Final Amount With 18% Taxes is: \u20b9"+amount);
		
		int remainder = (int)(amount % 2);
		System.out.println(">> remainder is: "+remainder);		
		
		// ++, --
		int customerCount = 0;
		customerCount++;	// customer = customer + 1
		++customerCount;
		customerCount++;
		
		customerCount--;	// 2
		
		// Prefix : ++customerCount;	// customerCount = customerCount + 1
		// Postfix: customerCount++;	// customerCount = customerCount + 1
		
		System.out.println(">> Current Customers in Restaurant: "+customerCount);
		
		//int howManyCustomers = customerCount++;	// In PostFix copy happens first and later increments
		int howManyCustomers = ++customerCount;		// In Prefix increment happens first and later copy
		System.out.println(">> howManyCustomers: "+howManyCustomers+" customerCount: "+customerCount);
		
		boolean isGPSEnabled = true;
		System.out.println(">> Is GPS NOT Enabled: " + !isGPSEnabled);
		
		// Assignment Operators
		// =, +=, -=, *=, /=, %=
		
		int num1 = 10;
		num1 *= 2; 		// num1 = num1 * 2;
		System.out.println(">> num1 now is: "+num1);
		
		int num2 = num1 % 3;
		num2 *= 3;
		System.out.println(">> num2 is: "+num2); // 6

		// Relational Operators
		// >, <, >=, <=, ==, !=
		double totalBillAmount = 401.33;
		
		// Use Case : Can we offer 50% Discount -> in case amount is greater than 500
		//            Can we offer 30% Discount -> in case amount is greater than 300
		//            Can we offer 10% Discount -> in case amount is greater than or equal to 200
		
		System.out.println("Can we offer 50% Discount: "+(totalBillAmount>500));
		System.out.println("Can we offer 30% Discount: "+(totalBillAmount>300));
		System.out.println("Can we offer 20% Discount: "+(totalBillAmount>=200));
		
		// Logical Operators
		// && -> both must be true
		// || -> any one must be true
		
		// Use Case : Can we offer 30% Discount -> in case amount is greater than 300 and less than or equal to 500
		System.out.println("Can we offer 30% Discount: "+(totalBillAmount>300 && totalBillAmount<=500));
		
		boolean primeCutomer = true;
		System.out.println("Can we offer 50% Discount: "+(totalBillAmount>500 || primeCutomer));
		
		// Bitwise
		// | & -> works on bits 
		int n1 = 8;			// 0 0 0 0  1 0 0 0
		int n2 = 3;			// 0 0 0 0  0 0 1 1
		
		int n3 = n1 | n2;	// 0 0 0 0  1 0 1 1	 // Any one should be true -> 1
		int n4 = n1 & n2;	// 0 0 0 0  0 0 0 0  // Both should be true -> 1
		
		System.out.println(">> n3 is: "+n3+" and n4 is: "+n4);
		
		// Please Explore
		// Shift Operators : >>, <<, >>> :)
		// >> divide by 2 power n
		// << * by 2 power n
		// >>> works on positive numbers
		
		// PS: Go through number formats in case you have no or less knowledge on the same 
		//     Binary, Octal, HexaDecimal
	}

}
