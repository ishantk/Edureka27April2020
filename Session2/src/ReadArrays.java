
public class ReadArrays {

	public static void main(String[] args) {
		
		int[] numbers = {10, 20, 30, 40, 50};

		// Iterate in Array
		// Loop | idx can be any name of your choice :)
		for(int idx=0; idx<5; idx++) {
			System.out.println(">> idx is: "+idx+" and numbers["+idx+"] is: "+numbers[idx]);
		}
		
		System.out.println("~~~~~~~~~~~");

		// Enhanced For Loop : Only to read the data one by one in Array
		// in num 10 gets copied first, than 20 and so on and so forth
		// num can be any name of your choice :)
		for(int num : numbers) {
			System.out.println(">> num is: "+num);
		}
		
	}

}
