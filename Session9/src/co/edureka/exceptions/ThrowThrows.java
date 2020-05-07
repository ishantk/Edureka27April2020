package co.edureka.exceptions;

import java.io.IOException; // IOException is CHECKED EXCEPTION: Not the child of RuntimeException

/*
 	
 	Exception	(Parent)
 		|
 		RuntimeException						UNCHECKED EXCEPTIONS
 			ArithmeticException
 			ArrayIndexOutOfBoundsException
 			NullPointerException
 			etc...
 												Other than RuntimeException and its Children all are CHECKED EXCEPTION
 		IOExcetption
 		SQLException
 		InterruptedException
 		etc...	
 	
 */

// User-Defined, UNCHECKED EXCEPTION (child of  RuntimeException)
class MyBankingException extends RuntimeException{
	MyBankingException(String message){
		super(message);	// pass the message to Parent's constructor
	}
}

//User-Defined, CHECKED EXCEPTION (child of Exception)
class YourBankingException extends Exception{
	YourBankingException(String message){
		super(message);	// pass the message to Parent's constructor
	}
}

class BankAccount{
	
	int balance;
	int minBalance;
	int attempts;
	
	BankAccount(){
		balance = 10000;
		minBalance = 2000;
		attempts = 0;
		System.out.println(">> Bank Account Created. Initial Balance is:\u20b9"+balance);
	}
	
	void withdraw(int amount) throws IOException, YourBankingException{
		
		balance -= amount; //balance = balance - amount;
		
		if(balance<=minBalance) {
			balance += amount;
			System.out.println(">> \u20b9"+amount+" Cannot Be Withdrawn. LOW Balance: \u20b9"+balance);
			attempts++;
		}else{
			System.out.println(">> \u20b9"+amount+" Withdrawn. New Balance is: \u20b9"+balance);
		}
		
		// We can give 3 unsuccessful trials to the User
		if(attempts == 3) {
			// Developer is creating the Object of Exception
			// ArithmeticException is a Built In Exception and Child of RuntimeException class
			// Hence, we are throwing a UNCHECKED EXCEPTION 
			//ArithmeticException aRef = new ArithmeticException("ILLEGAL ATTEMPTS: "+attempts);
			//throw aRef; // We throw an exception explicitly to crash the program
			
			// Lets throw a CHECKED EXCEPTION : IOException
			//IOException iRef = new IOException("ILLEGAL ATTEMPTS: "+attempts);
			//throw iRef;	// We will get error here, and in method's signature use throws keyword to eliminate that error
			
			YourBankingException yRef = new YourBankingException("ILLEGAL ATTEMPTS: "+attempts);
			throw yRef;
		}
	}
	
	void deposit(int amount) {
		balance+=amount;
	}
	
}

public class ThrowThrows {

	public static void main(String[] args) {
		System.out.println(">> Banking Started");

		BankAccount account = new BankAccount();
		
		// having said withdraw to be done n-number of times, we must not allow
		// we should terminate the program as these unlimited number of attempts may waste Bank's Resources
		try {
			for(int i=0;i<500;i++) {
				account.withdraw(3000);
			}
		}catch(Exception eRef) {
			System.out.println(">> Exception is: "+eRef);
			System.out.println("Message: "+eRef.getMessage());
			eRef.printStackTrace();
		}
		
		System.out.println(">> Banking Finished");
	}

}
