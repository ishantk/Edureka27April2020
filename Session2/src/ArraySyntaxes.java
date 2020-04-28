
public class ArraySyntaxes {

	public static void main(String[] args) {
	
		// Syntax 1
		int[] a1 = {10, 20, 30, 40, 50};	// Implicit

		// Syntax 2
		int a2[] = {10, 20, 30, 40, 50};	// Implicit
		
		// Syntax 3
		int[] a3 = new int[]{10, 20, 30, 40, 50}; // Explicit

		// Syntax 4
		int a4[] = new int[]{10, 20, 30, 40, 50}; // Explicit
		
		// new int[] -> new creates an int[] in the Heap Area at Run Time i.e. Upon Programs Execution
		// after array is created in the heap it will return the HashCode which gets stored in reference var i.e. a1, a2, a3, a4
		
		// Create an Array with 5 elements but all the values will be 0
		int a5[] = new int[5];
		a5[1] = 11;
		
		// Create an Array with 10 elements but all the values will be 0
		int[] a6 = new int[10];
		
		System.out.println("Iterating in a1");
		for(int num : a1) {
			System.out.print(num+" ");
		}
		
		System.out.println();
		
		System.out.println("Iterating in a5");
		for(int num : a5) {
			System.out.print(num+" ");
		}
		
		// int a5[10]; // error : C/CPP Style wont work
		// int[] a3 = new int[5]{10, 20, 30, 40, 50};  // error: can't mention size if we are putting the values
		// int[] a3 = new int[50]{10, 20, 30, 40, 50}; // error: can't mention size if we are putting the values
		
		// Creating Reference Variables
		int arr1[], arr2[], num;
		
		// Creating Arrays Later:
		arr1 = new int[5];
		arr2 = new int[]{10, 20, 30, 40, 50};
		num = 100;
		
		int[] arr3, arr4;
		arr3 = new int[5];
		arr4 = new int[]{10, 20, 30, 40, 50};	
		
		// PS: Arrays will always be of fixed size and homogeneous
	}

}
