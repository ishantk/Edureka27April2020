
public class BreakAndContinue {

	public static void main(String[] args) {
		
		double[] productPrices = {2345.12, 1231.55, 5675.14, 3333.33, 8901.22};
		
		// Search: Linear Search
		// Is any product available with price value of 1231.55
		double searchProductWithPrice = 1231.55;
		
		for(int idx=0;idx<5;idx++) {
		
			System.out.println(">> Searching " + searchProductWithPrice + " and Matching with " + productPrices[idx]);
			
			if(productPrices[idx] == searchProductWithPrice) {
				System.out.println(">> FOUND :) at idx: "+idx);
				break; // terminate the loop
			}
			
		}
		
		
		// Update the Prices of the Product whose value is > 3000 discount 30%
		System.out.println(">> BEFORE DISCOUNTS");
		for(double price : productPrices) {
			System.out.print(price+"  ");
		}
		
		System.out.println();
		
		
		for(int idx=0; idx<5; idx++) {
			
			if(productPrices[idx]<3000) {
				continue;	// skip the below code i.e. line#32 will not be executed and move the loop into next iteration
			}
			
			productPrices[idx] -= 0.3*productPrices[idx];
		}
		
		System.out.println(">> AFTER DISCOUNTS");
		for(double price : productPrices) {
			System.out.print(price+"  ");
		}

	}

}
