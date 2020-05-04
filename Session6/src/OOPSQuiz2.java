
class Restaurant{
	
	// non static: Property of Object
	int menu; 					// it will be 0 by default initially
	
	// static: Property of Class
	// this is a common property for all the objects :)
	static int restaurantCount;	// it will be 0 by default initially
	
	Restaurant() {
		menu++;
		restaurantCount++;
		System.out.println(">> Restaurant Object Constructed");
	}
	
	static void showCount() {
		System.out.println(">> restaurantCount: "+ Restaurant.restaurantCount);
	}
	
}

// PS: For every object menu as an attribute will be their own attribute
//     But restaurantCount is a common attribute for all of them which is Class's Attribute


public class OOPSQuiz2 {

	public static void main(String[] args) {
		
		Restaurant r1 = new Restaurant();	// Object Construction	| menu: 1 | restaurantCount: 1
		Restaurant r2 = new Restaurant();	// Object Construction  | menu: 1 | restaurantCount: 2
		Restaurant r3 = r1;					// Reference Copy
		
		System.out.println("r1 menu: "+r1.menu+" count is: "+r1.restaurantCount);
		System.out.println("r2 menu: "+r2.menu+" count is: "+r2.restaurantCount);
		System.out.println("r3 menu: "+r3.menu+" count is: "+r3.restaurantCount);
		
		System.out.println(">> count is: "+Restaurant.restaurantCount);
		
		Restaurant.showCount();
		
		r1.showCount();
		r2.showCount();
		r3.showCount();
		
		

	}

}
