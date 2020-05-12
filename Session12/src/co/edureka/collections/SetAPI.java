package co.edureka.collections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class SetAPI {

	public static void main(String[] args) {
		
		ArrayList<String> emailList = new ArrayList<String>();
		emailList.add("john@example.com");
		emailList.add("jennie@example.com");
		emailList.add("fionna@example.com");
		emailList.add("john@example.com");
		emailList.add("jack@example.com");
		emailList.add("sia@example.com");
		
		System.out.println(emailList);
		
		// Duplicates are supported by List
		
		// When we need to work on Uniqueness we must use HashSet
		// HashSet works on hashing(algo)
		// Output shall be unordered due to hashing as it is not indexed
		//Set<String> emailSet = new HashSet<String>();		// Polymorphic Statement
		HashSet<String> emailSet = new HashSet<String>();	// Direct Object Construction
		emailSet.add("john@example.com");
		emailSet.add("jennie@example.com");
		emailSet.add("fionna@example.com");
		emailSet.add("john@example.com");
		emailSet.add("jack@example.com");
		emailSet.add("sia@example.com");
		
		System.out.println(emailSet);
		
		Iterator<String> itr = emailSet.iterator();
		while(itr.hasNext()) {
			String email = itr.next();
			System.out.println(">> email sent to: "+email);
		}
				
		//HashSet<String> set = new HashSet<String>(emailList);
		TreeSet<String> set = new TreeSet<String>(emailList);	// TreeSet is sorted version
		System.out.println(set);
		
		System.out.println("Size is: "+emailSet.size());
		System.out.println("emailSet contains john@example.com? "+emailSet.contains("john@example.com"));
		
		emailSet.remove("john@example.com");
		System.out.println("Size now is: "+emailSet.size());
		System.out.println("emailSet contains john@example.com? "+emailSet.contains("john@example.com"));
		
		// PS: Since elements in HashSet they dont have indexes, we cannot say get method to read some element individually
		
	}

}
