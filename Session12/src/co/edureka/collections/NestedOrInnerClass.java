package co.edureka.collections;

class Outer{
	
	void show() {
		System.out.println(">> This is show of Outer");
	}
	
	// Class Created within the class : Local/Nested/Inner Class :)
	class Inner{
		void show() {
			System.out.println(">> This is show of Inner");
		}
	}
	
}

public class NestedOrInnerClass {

	public static void main(String[] args) {
		
		Outer oRef = new Outer();
		oRef.show();
		
		Outer.Inner iRef = oRef.new Inner();
		iRef.show();

	}

}
