// Dish is an Object where quantity is attribute of an object
class Dish{
	
	// non static -> Property of Object
	int qunatity;
	
	// static -> Property of Class
	static int count;
	
	
	// non static -> Property of Object
	Dish(){
		qunatity = 1;
		count = 1;
	}
	
	
	// non static -> Property of Object
	void increment() {
		qunatity++;
		count++;
	}
	
	// non static -> Property of Object
	void decrement() {
		qunatity--;
		count--;
	}
	
	// non static -> Property of Object
	void showQuantity() {
		System.out.println("QUANTITY: "+qunatity+" COUNT: "+count);	// static can be accessed in non static
	}
	
	// static -> Property of Class
	static void showCount() {
		System.out.println(">> COUNT is: "+count);
		//System.out.println(">> QUANTITY is: "+qunatity); // err // non static cannot be accessed in static
	}
	
}

public class OOPSQuiz1 {

	public static void main(String[] args) {
		
		Dish dish1 = new Dish();	// D1/3 : 1	count : 1
		Dish dish2 = new Dish();	// D2   : 1 count : 1
		Dish dish3 = dish1;
		
		// How many objects in the memory ?
		// 2
		// dish1 and dish3 refers to the same object 
		
		dish1.increment(); // D1/3 : 2	count 2
		dish2.increment(); // D2   : 2	count 3
		dish3.increment(); // D1/3 : 3	count 4
		
		dish1.increment(); // D1/3 : 4	count 5
		dish2.increment(); // D2   : 3	count 6
		
		dish3.decrement(); // D1/3 : 3	count 5
		dish1.decrement(); // D1/3 : 2	count 4
		dish2.increment(); // D2   : 4	count 5
		
		dish1.showQuantity(); // QUANTITY: 2 COUNT: ?
		dish2.showQuantity(); // QUANTITY: 4 COUNT: ?
		dish3.showQuantity(); // QUANTITY: 2 COUNT: ?
		
		Dish.showCount();
		
		//Dish.showQuantity(); // err // non static cannot be accessed by static

	}

}
