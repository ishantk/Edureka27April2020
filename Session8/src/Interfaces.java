/*abstract class AmazonPayPaymentGateway{
	
	AmazonPayPaymentGateway(){
		System.out.println(">> AmazonPayPaymentGateway Object Constructed");
	}
	
	// RULES MADE IN PARENT
	// To be defined by Children else we will have errors
	abstract void processPayments(int amount);
	abstract void onPaymentSuccess();
	abstract void onPaymentFailed();
}*/

// interface cannot have Objects
// neither we, nor JVM can create its Objects
interface AmazonPayPaymentGateway{
	
	/*AmazonPayPaymentGateway(){
		System.out.println(">> AmazonPayPaymentGateway Object Constructed");
	}*/
	
	// RULES MADE IN INTERFACE
	// To be defined by Classes Which Implements It
	// Rules are by Default public and abstract
	void processPayments(int amount);	// -> public abstract void processPayments(int amount);
	void onPaymentSuccess();
	void onPaymentFailed();
	
	/* ERROR
	void show() {
		
	}*/
}

// Interfaces are IMPLEMENTED and NOT EXTENDED
class SwiggyAppPayment implements AmazonPayPaymentGateway { //extends AmazonPayPaymentGateway{
	
	SwiggyAppPayment(){
		System.out.println(">> SwiggyAppPayment Object Constructed");
	}
	
	void pay(int amount, int promoCode) {
		if(amount > 500 && promoCode == 1001) {
			System.out.println(">> PROMO CODE APPLIED. Flat 1001 Discounted");
			processPayments(amount-100);
		}else {
			processPayments(amount);
		}
	}
	
	public void processPayments(int amount) {
		
		System.out.println(">> Executing Payments Method");
		onPaymentSuccess();
	}
	
	public void onPaymentSuccess() {
		System.out.println(">> Payment Successfully Processed");
		System.out.println(">> Send a Notification to Restaurant");
		System.out.println(">> Send a Notification to Rider");
		System.out.println(">> Send a Notification to User");
		System.out.println(">> Send an Invoice in the Email to User");
	}
	
	public void onPaymentFailed() {
		System.out.println(">> Payment Failed");
	}
}


public class Interfaces {

	public static void main(String[] args) {
		
		// Polymorphic Statement | RTP | Ref Var of Parent can point to the Object of Child
		// Polymorphic Statement | RTP | Ref Var of Interface can point to the Object of Class which implements it
		//AmazonPayPaymentGateway apg = new SwiggyAppPayment();
		//apg.processPayments(700);
		
		SwiggyAppPayment app = new SwiggyAppPayment();
		
		System.out.println();
		
		app.pay(700, 1001);
		
		

	}

}
