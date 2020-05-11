package co.edureka.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.LinkedList;
//import java.util.LinkedList; -> Doubly Circular LinkedList
import java.util.List;
import java.util.ListIterator;
import java.util.Vector;

class MyComparator implements Comparator<Product>{

	@Override // Annotation -> Telling us compare method is overrided in MyComparator
	public int compare(Product o1, Product o2) {
		if(o1.price > o2.price) {
			return -1;
		}else if(o1.price < o2.price) {
			return 1;
		}else {
			return 0;
		}
	}
	
}

class Product implements Comparable<Product>{
	
	int pid;
	String name;
	int price;
	
	Product() {
		
	}
	
	Product(int pid, String name, int price) {
		this.pid = pid;
		this.name = name;
		this.price = price;
	}
	
	public String toString() {
		return "["+pid+","+name+","+price+"]";
	}

	@Override // Annotation -> Telling us compareTo method is overrided in MyComparator
	public int compareTo(Product pRef) {
		if(pRef.price > price) {
			return -1;
		}else if(pRef.price < price) {
			return 1;
		}else {
			return 0;
		}
	}
	
}

public class ListAPI {

	public static void main(String[] args) {
		
		// Direct Object Construction:
		// Can Store Any Type of Object -> Hetro
		ArrayList list1 = new ArrayList();
		
		// Can Store only String Objects -> Homo
		ArrayList<String> list2 = new ArrayList<String>();
		
		// Can Store only Product Objects -> Homo
		ArrayList<Product> cart = new ArrayList<Product>();
		
		// Polymorphic Statements :)
		//List list1 = new ArrayList();
		//List<String> list2 = new ArrayList<String>();
		//List<Product> cart = new ArrayList<Product>();
		
		/*
		// RTP:
		List list = new ArrayList();
		list = new ArrayList<String>();
		list = new ArrayList<Product>();
		list = new Vector<String>();
		list = new LinkedList<String>()
		*/
		
		Product p1 = new Product(101, "iPHone", 70000);
		Product p2 = new Product(201, "Alphabounce", 8000);
		Product p3 = new Product(301, "LED", 50000);
		Product p4 = new Product(401, "Laptop", 30000);
		
		// 1. Add Data in ArrayList
		list1.add(10);	// -> list1.add(new Integer(10)); // shall be AutoBoxed		| 0
		list1.add("John");
		list1.add("Fionna");
		list1.add(2.2);
		list1.add('A');
		list1.add(p1); //															| n-1
		
		
		//list2.add(0,"John");		// 0
		list2.add("John");			// 0
		list2.add("Jennie");
		list2.add("Anna");
		list2.add("Fionna");
		list2.add("Kia");			// n-1
		list2.add(5, "Mike");
		//list2.add(10); // err
		//list2.add(p1); // err
		
		cart.add(p1);				// 0
		cart.add(p2);				// 1
		cart.add(p3);				// 2
		//cart.add("John");	// err
		//cart.add(10);		// err
		
		// Add All
		ArrayList<String> names = new ArrayList<String>();
		names.add("Harry");
		names.add("Dan");
		
		names.addAll(list2); // Add all the objects from one list into another
		System.out.println(">> names: ["+names.size()+"]");
		System.out.println(names);
		
		// 2. Print the List
		System.out.println("list1:");
		System.out.println(list1);
		System.out.println();
		
		System.out.println("list2:");
		System.out.println(list2);
		System.out.println();
		
		System.out.println("Shopping Cart:");
		System.out.println(cart);
		System.out.println();
		
		// 3. Print Sizes
		System.out.println("list1 size is: "+list1.size());
		System.out.println("list2 size is: "+list2.size());
		System.out.println("cart size is: "+cart.size());
		
		// 4. Update the data in list
		list2.set(1, "Leo");
		cart.set(1, p4);
		
		// 5. remove the data from list
		list2.remove(3);
		
		// 6. Remove All
		//list2.clear();
		
		System.out.println("list2:");
		System.out.println(list2);
		System.out.println();
		
		//cart.clear();
		
		System.out.println("Shopping Cart:");
		System.out.println(cart);
		System.out.println();
		
		// 7. Find Data in List
		if(list1.contains(10)) {
			System.out.println(">> 10 is in the list1");
		}
		
		if(list2.contains("Jennie")) {
			System.out.println(">> Jennie is in the list2");
		}else {
			System.out.println(">> Jennie is not in the list2");
		}
		
		// 8. Index of Elements
		int idx = list2.indexOf("Leo");
		System.out.println(">> idx of Leo in list2 is: "+idx);
		
		idx = cart.indexOf(p1);
		System.out.println(">> idx of p1 in cart is: "+idx);
		
		// 9. Read Single Element
		Object o = list1.get(3);
		String s = list2.get(1);
		Product p = cart.get(2);
		
		System.out.println(o);
		System.out.println(s);
		System.out.println(p);
		
		// 10. Read All the elements in the List
		System.out.println("==FOR LOOP==");
		for(int i=0;i<list1.size();i++) {
			Object oRef = list1.get(i);
			System.out.println(oRef);
		}
		System.out.println();
		
		for(int i=0;i<list2.size();i++) {
			String str = list2.get(i);
			System.out.println(str);
		}
		System.out.println();
		
		for(int i=0;i<cart.size();i++) {
			Product pRef = cart.get(i);
			System.out.println(pRef);
		}
		
		System.out.println("==ENHANCED FOR LOOP==");
		for(Object oRef : list1) {
			System.out.println(oRef);
		}
		System.out.println();
		
		for(String str : list2) {
			System.out.println(str);
		}
		System.out.println();
		
		for(Product pRef : cart) {
			System.out.println(pRef);
		}
		System.out.println();
		
		System.out.println("==Iterator API==");	// Can Only Iterate Forward
		Iterator itr1 = list1.iterator();
		System.out.println(itr1.next());
		System.out.println(itr1.next());
		
		Iterator<String> itr2 = list2.iterator();
		Iterator<Product> itr3 = cart.iterator();
		
		System.out.println();
		
		while(itr2.hasNext()) {
			String str = itr2.next();
			System.out.println(str);
			/*if(str.equals("John")) {
				itr2.remove(); // Iterator can remove elements from the list
			}*/
		}
		
		System.out.println("==List Iterator API==");	// Can Iterate Forward and backward Both
		ListIterator<String> listItr = list2.listIterator();
		while(listItr.hasNext()) {
			String str = listItr.next();
			System.out.println(str);
		}
		System.out.println("~~~~~");
		while(listItr.hasPrevious()) {
			String str = listItr.previous();
			System.out.println(str);
		}
		
		System.out.println("==Enumeration API==");
		Enumeration<String> enm = Collections.enumeration(list2);
		while(enm.hasMoreElements()) {
			String str = enm.nextElement();
			System.out.println(str);
		}
		
		System.out.println(">> names are : "+names);
		Collections.sort(names);
		System.out.println(">> names now are : "+names);
		
		System.out.println(">> cart is: "+cart);
		//Collections.sort(cart); // With Comparable
		
		MyComparator cRef = new MyComparator();
		Collections.sort(cart, cRef);	// With Comparator
		
		System.out.println(">> cart now is: "+cart);
		
		// THREAD-SAFE i.e. SYNCHRONIZED
		Vector<String> vector = new Vector<String>();
		vector.add("John");
		vector.add("Fionna");
		vector.add("Sia");
		vector.add("Kim");
		System.out.println("vector: ");
		System.out.println(vector);
		
	}

}
