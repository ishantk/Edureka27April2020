/*
 	
 	MODEL
 		Data
 	VIEW
 		UI
 	CONTROLLER
 		Logic
 			1. Operators 
 			2. Conditional Flows | How Program should be working on the basis of conditions
 			3. Iterations
 	
 */
public class ConditionalFlows {

	public static void main(String[] args) {

		// Use Case: Offer Discount of 20% in case amount >=200 and promoCode is 1001
		
		int promoCode = 1001;
		double amount = 300.0;
		
		// Simple/Regular if/else
		if(amount >=200) {
			System.out.println(">> You Are Elgible to get 20% Off");
			System.out.println(">> Use PromoCode 1001 to get the Discount");
		}else {
			System.out.println(">> Please Pay \u20b9"+amount);
		}
		
		System.out.println("~~~~~~~~~~~~~");
		
		
		// Nested if/else
		if(amount >= 200) {
			if(promoCode == 1001) {
				amount -= (amount*0.2);	// amount = amount - (amount*0.2);
				System.out.println(">> Promo Code 1001 Applied Successfully !!");
				System.out.println(">> Please Pay \u20b9"+amount+" after 20% discount");
			}else {	// in case promo code is not 1001
				System.out.println(">> You Are Elgible to get 20% Off");
				System.out.println(">> Use PromoCode 1001 to get the Discount");
			}
		}else {
			System.out.println(">> Please Pay \u20b9"+amount);
		}
		
		System.out.println("~~~~~~~~~~~~~");
		
		amount = 120;
		promoCode = 3001;
		
		// Ladder if/else
		// 	Use Case: 
		//	Offer Discount of 20% in case amount >=200 and <500 with promoCode is 1001
		//	Offer Discount of 30% in case amount >=500 and <1000 with promoCode is 2001
		//	Offer Discount of 50% in case amount >=1000 with promoCode is 3001
		
		if(amount >=200 && amount<500) {
			if(promoCode == 1001) {
				amount -= (amount*0.2);	// amount = amount - (amount*0.2);
				System.out.println(">> Promo Code 1001 Applied Successfully !!");
				System.out.println(">> Please Pay \u20b9"+amount+" after 20% discount");
			}else {
				System.out.println(">> Invalid Promo Code "+promoCode+" for discounts");
			}
		}else if(amount >=500 && amount<1000) {
			if(promoCode == 2001) {
				amount -= (amount*0.3);	// amount = amount - (amount*0.2);
				System.out.println(">> Promo Code 2001 Applied Successfully !!");
				System.out.println(">> Please Pay \u20b9"+amount+" after 30% discount");
			}else {
				System.out.println(">> Invalid Promo Code "+promoCode+" for discounts");
			}
		}else if(amount >=1000) {
			if(promoCode == 3001) {
				amount -= (amount*0.5);	// amount = amount - (amount*0.2);
				System.out.println(">> Promo Code 3001 Applied Successfully !!");
				System.out.println(">> Please Pay \u20b9"+amount+" after 50% discount");
			}else {
				System.out.println(">> Invalid Promo Code "+promoCode+" for discounts");
			}
		}else {
			System.out.println(">> Please Pay \u20b9"+amount);
			System.out.println(">> Add Minimum \u20b9"+(200-amount)+" value of products More to get discounts");
		}
		
		// switch case is when we want user to choose from multiple options
		System.out.println("~~~~~~~~~~~~~~");
		
		int netBanking = 1;
		int card = 2;
		int payTm = 3;
		int amazonPay = 4;
		int googlePay = 5;
		
		int userChoice = payTm;
		
		switch(userChoice) {
			
			case 1:
				System.out.println(">> Please pay \u20b9"+amount+" with NetBanking");
				break; // terminate the switch case flow
				
			case 2:
				System.out.println(">> Please pay \u20b9"+amount+" with Card");
				break;
				
			case 3:
				System.out.println(">> Please pay \u20b9"+amount+" with PayTM");
				break;
				
			case 4:
				System.out.println(">> Please pay \u20b9"+amount+" with Amazon Pay");
				break;
				
			case 5:
				System.out.println(">> Please pay \u20b9"+amount+" with Google Pay");
				break;
				
			default:
				System.out.println(">> Please Select a Payment Method before you wish to Pay");
				break;
		
		}
		
		// Explore:
		// switch case vs ladder if/else
		// switch case can be used on which and all data types
		

	}

}
