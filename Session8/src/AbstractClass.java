// abstract class given by 3rd party vendor
// so that you cannot create its object directly and mis-use it
abstract class PayTMPaymentGateway{
	
	PayTMPaymentGateway(){
		System.out.println(">> PayTMPaymentGateway Object Constructed");
	}
	
	abstract void processPayments(int amount);
	abstract void onPaymentSuccess();
	abstract void onPaymentFailed();
}

class ZomatoAppPayment extends PayTMPaymentGateway{
	
	ZomatoAppPayment(){
		System.out.println(">> ZomatoAppPayment Object Constructed");
	}
	
	void pay(int amount, int promoCode) {
		if(amount > 500 && promoCode == 1001) {
			System.out.println(">> PROMO CODE APPLIED. Flat 1001 Discounted");
			processPayments(amount-100);
		}else {
			processPayments(amount);
		}
	}
	
	void processPayments(int amount) {
		System.out.println(">> Executing Payments Method");
		onPaymentSuccess();
	}
	
	void onPaymentSuccess() {
		System.out.println(">> Payment Successfully Processed");
		System.out.println(">> Send a Notification to Restaurant");
		System.out.println(">> Send a Notification to Rider");
		System.out.println(">> Send a Notification to User");
		System.out.println(">> Send an Invoice in the Email to User");
	}
	
	void onPaymentFailed() {
		System.out.println(">> Payment Failed");
	}
}

public class AbstractClass {

	public static void main(String[] args) {
		
		// Polymorphic Statement
		//PayTMPaymentGateway pgp = new ZomatoAppPayment();
		//pgp.pay(); // we wont be able to execute pay method as it is not a RULE in PayTMPaymentGateway
		
		ZomatoAppPayment app = new ZomatoAppPayment();
		app.pay(700, 1001);
				

	}

}
