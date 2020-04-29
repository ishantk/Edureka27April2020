/*
 	
 	MODEL
 		Data
 	VIEW
 		UI
 	CONTROLLER
 		Logic
 			1. Operators 
 			2. Conditional Flows 
 			3. Iterations | Repetitions in the Logic
 	
 */
public class Iterations {

	public static void main(String[] args) {
	
		// Array with Prices of 5 Products
		//							0		1 		 2		3		4
		double[] productPrices = {2345.12, 1231.55, 5675.14, 3333.33, 8901.22};
		
		// Flat 50% Off Sale on all the products
		
		//productPrices[0] = productPrices[0] - (0.5*productPrices[0]);
//		productPrices[0] -= (0.5*productPrices[0]);
//		productPrices[1] -= (0.5*productPrices[1]);
//		productPrices[2] -= (0.5*productPrices[2]);
//		productPrices[3] -= (0.5*productPrices[3]);
//		productPrices[4] -= (0.5*productPrices[4]);
		
		// Above Statement we can see the same operation is done repeatedly
		// We must use the Loop in such scenarios
		
		// WHILE LOOP:
		/*
		int idx = 0;	 // Starting Point
		while(idx < 5) { // Condition where to terminate
			productPrices[idx] -= (0.5*productPrices[idx]);
			idx++;		 // Expressions which takes us from Starting Point to Terminating Point
		}
		
		System.out.println(">> Products After Discount:");
		idx = 0;
		while(idx < 5) {
			System.out.print(productPrices[idx]+"  ");
			idx++;
		}
		*/
		
		// DO-WHILE LOOP: Once this loop is going to be executed even though condition is not fulfilled
		/*
		int idx = 0;
		do {
			productPrices[idx] -= (0.5*productPrices[idx]);
			System.out.print(productPrices[idx]+" ");
			idx++;
		}while(idx<5); // Termination Condition is Checked Later
		 */
		
		// A different way of writing the while loop
		// FOR LOOP:
		for(int idx=0;idx<5;idx++) {
			productPrices[idx] -= (0.5*productPrices[idx]);
			System.out.print(productPrices[idx]+" ");
		}
	}

}
