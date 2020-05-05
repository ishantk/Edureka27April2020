// eCommerce Platform Objects

/*class MobilePhone{
	
	int pid;
	int price;
	String name;
	String brand;
	int memory;
	int screenSize;
	int ram;
	
	MobilePhone(){
		System.out.println(">> Mobile Phone Object Constructed");
	}
	
	void setMobilePhoneDetails(int pid, int price, String name, String brand, int memory, int screenSize, int ram) {
		this.pid = pid;
		this.price = price;
		this.name = name;
		this.brand = brand;
		this.memory = memory;
		this.screenSize = screenSize;
		this.ram = ram;
	}
	
	void showMobilePhoneDetails() {
		System.out.println("~~~~~~~~Mobile Phone Details~~~~~~~");
		System.out.println("PID: "+pid);
		System.out.println("PRICE: "+price);
		System.out.println("NAME: "+name);
		System.out.println("BRAND: "+brand);
		System.out.println("MEMORY: "+memory);
		System.out.println("SIZE: "+screenSize);
		System.out.println("RAM: "+ram);
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
	}
}

class Shoe{
	
	int pid;
	int price;
	String name;
	String brand;
	String color;
	int shoeSize;
	
	Shoe(){
		System.out.println(">> Shoe Object Constructed");
	}
	
	void setShoeDetails(int pid, int price, String name, String brand, String color, int shoeSize) {
		this.pid = pid;
		this.price = price;
		this.name = name;
		this.brand = brand;
		this.color = color;
		this.shoeSize = shoeSize;
	}
	
	void showShoeDetails() {
		System.out.println("~~~~~~~~Shoe Details~~~~~~~");
		System.out.println("PID: "+pid);
		System.out.println("PRICE: "+price);
		System.out.println("NAME: "+name);
		System.out.println("BRAND: "+brand);
		System.out.println("COLOR: "+color);
		System.out.println("SIZE: "+shoeSize);
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~");
	}
}

class LEDTV{
	
	int pid;
	int price;
	String name;
	String brand;
	String technology;
	int screenSize;
	
	LEDTV(){
		System.out.println(">> LEDTV Object Constructed");
	}
	
	void setLEDTVDetails(int pid, int price, String name, String brand, String technology, int screenSize) {
		this.pid = pid;
		this.price = price;
		this.name = name;
		this.brand = brand;
		this.technology = technology;
		this.screenSize = screenSize;
	}
	
	void showLEDTVDetails() {
		System.out.println("~~~~~~~~LEDTV Details~~~~~~~");
		System.out.println("PID: "+pid);
		System.out.println("PRICE: "+price);
		System.out.println("NAME: "+name);
		System.out.println("BRAND: "+brand);
		System.out.println("TECH: "+technology);
		System.out.println("SIZE: "+screenSize);
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
	}
}*/

// PARENT : Having Common Attributes/Methods
class Product{
	
	int pid;
	int price;
	String name;
	String brand;
	
	Product(){
		System.out.println(">> Product Object Constructed");
	}
	
	void setProductDetails(int pid, int price, String name, String brand){
		this.pid = pid;
		this.price = price;
		this.name = name;
		this.brand = brand;
	}
	
	/*void showProductDetails() {
		System.out.println("-----Product Details----");
		System.out.println("PID: "+pid);
		System.out.println("PRICE: "+price);
		System.out.println("NAME: "+name);
		System.out.println("BRAND: "+brand);
		System.out.println("------------------------");
	}*/
	
	void showDetails() {
		System.out.println("-----Product Details----");
		System.out.println("PID: "+pid);
		System.out.println("PRICE: "+price);
		System.out.println("NAME: "+name);
		System.out.println("BRAND: "+brand);
		System.out.println("------------------------");
	}
	
}

class MobilePhone extends Product{
	
	int memory;
	int screenSize;
	int ram;
	
	MobilePhone(){
		System.out.println(">> Mobile Phone Object Constructed");
	}
	
	void setMobilePhoneDetails(int pid, int price, String name, String brand, int memory, int screenSize, int ram) {
		setProductDetails(pid, price, name, brand);
		this.memory = memory;
		this.screenSize = screenSize;
		this.ram = ram;
	}
	
	//void showMobilePhoneDetails() {
	void showDetails() {
		System.out.println("~~~~~~~~Mobile Phone Details~~~~~~~");
		//showProductDetails();
		super.showDetails();
		System.out.println("MEMORY: "+memory);
		System.out.println("SIZE: "+screenSize);
		System.out.println("RAM: "+ram);
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
	}
}

class Shoe extends Product{
	
	String color;
	int shoeSize;
	
	Shoe(){
		System.out.println(">> Shoe Object Constructed");
	}
	
	void setShoeDetails(int pid, int price, String name, String brand, String color, int shoeSize) {
		setProductDetails(pid, price, name, brand);
		this.color = color;
		this.shoeSize = shoeSize;
	}
	
	//void showShoeDetails() {
	void showDetails() {
		System.out.println("~~~~~~~~Shoe Details~~~~~~~");
		//showProductDetails();
		super.showDetails();
		System.out.println("COLOR: "+color);
		System.out.println("SIZE: "+shoeSize);
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~");
	}
}

class LEDTV extends Product{
	
	String technology;
	int screenSize;
	
	LEDTV(){
		System.out.println(">> LEDTV Object Constructed");
	}
	
	void setLEDTVDetails(int pid, int price, String name, String brand, String technology, int screenSize) {
		setProductDetails(pid, price, name, brand);
		this.technology = technology;
		this.screenSize = screenSize;
	}
	
	//void showLEDTVDetails() {
	void showDetails() {
		System.out.println("~~~~~~~~LEDTV Details~~~~~~~");
		//showProductDetails();
		super.showDetails();
		System.out.println("TECH: "+technology);
		System.out.println("SIZE: "+screenSize);
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
	}
}


public class WhyInheritance {

	public static void main(String[] args) {
		
		MobilePhone mRef = new MobilePhone();
		System.out.println();
		
		Shoe sRef = new Shoe();
		System.out.println();
		
		LEDTV lRef = new LEDTV();
		System.out.println();
		
		
		mRef.setMobilePhoneDetails(101, 90000, "iPhone 11", "Apple", 256, 5, 4);
		sRef.setShoeDetails(201, 8000, "AlphaBounce", "Adidas", "Black", 9);
		lRef.setLEDTVDetails(301, 50000, "Bravia", "Sony", "OLED", 40);
		
		System.out.println();
		//mRef.showMobilePhoneDetails();
		mRef.showDetails();
		
		System.out.println();
		//sRef.showShoeDetails();
		sRef.showDetails();
		
		System.out.println();
		//lRef.showLEDTVDetails();
		lRef.showDetails();
		
	}

}

// PS: If we have Redundancy in the Code while writing classes.
//	   Use Inheritance  to save Development Time. :)
