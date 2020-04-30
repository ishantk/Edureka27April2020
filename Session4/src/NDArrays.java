
public class NDArrays {
	
	static void printArray(int[][] array) {
		System.out.println("Printing array: "+array+" with length: "+array.length);
		System.out.println("~~~~~~~~~~~~~~~");
		for(int i=0;i<array.length;i++) {
			for(int j=0;j<array[i].length;j++) {
				System.out.print(array[i][j]+"  ");
			}
			System.out.println();
		}
		System.out.println("~~~~~~~~~~~~~~~");
	}

	public static void main(String[] args) {
		
		// 1-D Array
		//			0   1   2   3   4
		int[] a1 = {10, 20, 30, 40, 50};
		
		// 2-D Array : Array of Arrays :)
		int[][] a2 = {
					 //  0   1    2   3   4
						{10, 20, 30},			// 0 | 3
						{10, 20, 30, 40, 50},	// 1 | 5
						{10, 20},				// 2 | 2
						{10, 20, 30, 40},		// 3 | 4
						{10}					// 4 | 1
					 };
		
		// 3-D Array : Array of Array of Arrays
		int[][][] a3 ={ 
						{
							{10, 20, 30},			// 0 | 3
							{10, 20, 30, 40, 50},	// 1 | 5
							{10, 20},				// 2 | 2		// 0
							{10, 20, 30, 40},		// 3 | 4
							{10}					// 4 | 1
						 },
						 {
							{10, 20, 30},			// 0 | 3
							{10, 20, 30, 40, 50},	// 1 | 5
							{10, 20},				// 2 | 2		// 1
							{10, 20, 30, 40},		// 3 | 4
							{10}					// 4 | 1
						 }
					  };
			
		
		System.out.println(">> a1 is: "+a1); // HashCode : a1 is ref variable in Stack and array is created in Heap
		System.out.println(">> a2 is: "+a2); // HashCode : a2 is ref variable in Stack and array is created in Heap
		
		System.out.println(">> a1 length is: "+a1.length); // 5
		System.out.println(">> a2 length is: "+a2.length); // 5
		
		System.out.println(">> a1[0] is: "+a1[0]); // 10
		System.out.println(">> a2[0] is: "+a2[0]); // HashCode of 0th Array in a2
		
		System.out.println(">> a2[0][0] is: "+a2[0][0]); // 10
		
		System.out.println(">> a2[1][3] is: "+a2[1][3]); // 40
		
		System.out.println("a2 elements:");
		NDArrays.printArray(a2);
		/*System.out.println("~~~~~~~~~~~");
		// Use Nested For Loop to print Array in Arrays
		for(int i=0;i<a2.length;i++) {	// i:0, 1, 2, 3, 4 [loop runs 5 times]
			
			for(int j=0;j<a2[i].length;j++) {	// i:0, j:0,1,2 | i:1, j:0,1,2,3,4 | i:2, j:0,1 | i:3, j:0,1,2,3 | i:4, j:0
				System.out.print(a2[i][j]+"  ");
			}
			
			System.out.println();
		}
		System.out.println("~~~~~~~~~~~");*/
		
		
		// PS: Explore how to achieve the same with Enhanced For Loop :)
		
		
		// Creating Array of Array With Size
		// 3 Arrays with each array having 3 elements and all of them are 0
		int[][] arr1 = new int[3][3];
		
		// 3 Arrays with each Array having no size yet
		int[][] arr2 = new int[3][];
		arr2[0] = new int[5];	// 0th Array contains 5 elements
		arr2[1] = new int[10];	// 1st Array contains 10 elements
		arr2[2] = new int[15];	// 2nd Array contains 15 elements
		
		arr1[1][1] = 1;
		arr2[2][2] = 2;
		
		System.out.println("arr1 elements:");
		NDArrays.printArray(arr1);
		/*System.out.println("~~~~~~~~~~~");
		for(int i=0;i<arr1.length;i++) {	
			
			for(int j=0;j<arr1[i].length;j++) {
				System.out.print(arr1[i][j]+"  ");
			}
			
			System.out.println();
		}
		System.out.println("~~~~~~~~~~~");*/
		
		
		System.out.println("arr2 elements:");
		NDArrays.printArray(arr2);
		/*System.out.println("~~~~~~~~~~~");
		for(int i=0;i<arr2.length;i++) {	
			
			for(int j=0;j<arr2[i].length;j++) {
				System.out.print(arr2[i][j]+"  ");
			}
			
			System.out.println();
		}
		System.out.println("~~~~~~~~~~~");*/
		
		// PS: Represent Covid19 Data in 2D Arrays and 3D Arrays: https://www.covid19india.org/
		
	}

}
