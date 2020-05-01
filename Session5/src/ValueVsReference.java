
public class ValueVsReference {
	
	// Pass By Value
	static void squareOfNumber(int number) {
		// number is the property of squareOfNumber as it is either input or gets created in the method
		
		System.out.println(">> [squareOfNumber] number before is: "+number);	// 5
		
		number = number * number;
		
		System.out.println(">> [squareOfNumber] number after is: "+number);		// 25
	}
	
	static void printArray(int[] array) {
		for(int num : array) {
			System.out.print(num+"  ");
		}
		System.out.println();
	}

	// Pass By Reference 
	static void squareOfNumbers(int[] numbers) {
		// numbers is a reference variable which will hold the HashCode of some Array
		// Further, number is the property of the method squareOfNumbers
		
		System.out.println(">> [squareOfNumbers] numbers is: "+numbers+" and length is: "+numbers.length);
		
		System.out.print(">> [squareOfNumbers] numbers BEFORE elements: ");
		/*for(int n : numbers) {
			System.out.print(n+"  ");
		}
		System.out.println();*/
		ValueVsReference.printArray(numbers);
		
		// Square each index of numbers
		for(int i=0;i<numbers.length;i++) {
			numbers[i] = numbers[i] * numbers[i];
		}
		
		System.out.print(">> [squareOfNumbers] numbers AFTER elements: ");
		/*for(int n : numbers) {
			System.out.print(n+"  ");
		}
		System.out.println();*/
		ValueVsReference.printArray(numbers);
		
	}
	
	// main is a method
	// static method : since for main it can be accessed with class name
	// is executed automatically whenever we execute the program
	public static void main(String[] args) {
		
		System.out.println(">> [main] method execution started");
		
		// num is the property of main as it is created in the main
		int num = 5;
		
		System.out.println(">> [main] num before is: "+num);	// 5
		
		ValueVsReference.squareOfNumber(num);					// Here control jumps to the squareOfNumber and main kind of pauses till tile squareOfNumber is not finished
		
		System.out.println(">> [main] num after is: "+num);		// 5
		
		int[] array = {10, 20, 30, 40, 50};
		System.out.println(">> [main] array is: "+array+" and length is: "+array.length);
		System.out.print(">> [main] array elements BEFORE : ");
		/*for(int n : array) {
			System.out.print(n+"  ");
		}
		System.out.println();*/
		ValueVsReference.printArray(array);
		
		ValueVsReference.squareOfNumbers(array);
		
		System.out.print(">> [main] array elements AFTER : ");
		/*for(int n : array) {
			System.out.print(n+"  ");
		}
		System.out.println();*/
		ValueVsReference.printArray(array);
		
		System.out.println(">> [main] method execution finished");
		
		// PS: How can we pass primitives as References -> By Using Wrapper Classes in Java 

	}

}
