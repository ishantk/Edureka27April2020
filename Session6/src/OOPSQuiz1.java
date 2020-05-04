// Dish is an Object where quantity is attribute of an object
class Dish{
	
	int qunatity;
	static int count;
	
	Dish(){
		qunatity = 1;
		count = 1;
	}
	
	void increment() {
		qunatity++;
		count++;
	}
	
	void decrement() {
		qunatity--;
		count--;
	}
	
	void showQuantity() {
		System.out.println("QUANTITY: "+qunatity+" COUNT: "+count);
	}
	
}

public class OOPSQuiz1 {

	public static void main(String[] args) {
		
		Dish dish1 = new Dish();	// D1/3 : 1
		Dish dish2 = new Dish();	// D2   : 1
		Dish dish3 = dish1;
		
		// How many objects in the memory ?
		// 2
		// dish1 and dish3 refers to the same object 
		
		dish1.increment(); // D1/3 : 2
		dish2.increment(); // D2   : 2
		dish3.increment(); // D1/3 : 3
		
		dish1.increment(); // D1/3 : 4
		dish2.increment(); // D2   : 3
		
		dish3.decrement(); // D1/3 : 3
		dish1.decrement(); // D1/3 : 2
		dish2.increment(); // D2   : 4
		
		dish1.showQuantity(); // QUANTITY: 2 COUNT: ?
		dish2.showQuantity(); // QUANTITY: 4 COUNT: ?
		dish3.showQuantity(); // QUANTITY: 2 COUNT: ?

	}

}
