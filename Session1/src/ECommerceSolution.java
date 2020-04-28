/*
 
	Platform 	| Price| Profits
	Amazon 		| 8950 | 1150.22
	Flipkart 	| 8945 | 1011.75
	
			Amazon		Flipkart
	Day1	120			115
	Day2	150 		170
	Day3	375			347
 
 */

public class ECommerceSolution {

	public static void main(String[] args) {
		
		// 1. Representing Data in Program
		// We are representing mathematical numbered data with int and double
		// int and double are known as Data Types i.e. types in which we represent the data :)
		int amazonSalesDay1 = 120;
		int amazonSalesDay2 = 150;
		int amazonSalesDay3 = 375;
		
		int flipkartSalesDay1 = 115;
		int flipkartSalesDay2 = 170;
		int flipkartSalesDay3 = 347;
	
		double amazonProfit = 1150.22;
		double flipkartProfit = 1011.75;
		
		// 2. Computation
		// Expression to compute some result
		int amazonTotalSales = amazonSalesDay1 + amazonSalesDay2 + amazonSalesDay3;
		int flipkartTotalSales = flipkartSalesDay1 + flipkartSalesDay2 + flipkartSalesDay3;
		
		// Compute Total Profits for 3 days
		double amazonTotalProfits = amazonTotalSales * amazonProfit;
		double flipkartTotalProfits = flipkartTotalSales * flipkartProfit;
		
		// 3. Printing
		System.out.println("Amazon Total Sales: " + amazonTotalSales);
		System.out.println("Amazon Total Profits: " + amazonTotalProfits);
		
		System.out.println("Flipkart Total Sales: " + flipkartTotalSales);
		System.out.println("Flipkart Total Profits: " + flipkartTotalProfits);
		
		// Time and Accuracy :)
		
	}

}
