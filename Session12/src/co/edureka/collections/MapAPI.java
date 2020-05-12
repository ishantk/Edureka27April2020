package co.edureka.collections;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

class Employee{
	int eid;
	String name;
	String department;
	String email;
	int salary;
}

public class MapAPI {

	public static void main(String[] args) {
		
		//Map<Integer, String> map = new HashMap<Integer, String>();	// Polymorphic Statement
		HashMap<Integer, String> map = new HashMap<Integer, String>();	// Direct Object Construction
		HashMap<Integer, Employee> employees = new HashMap<Integer, Employee>();	// Direct Object Construction
		
		// Adding Data in HashMap
		map.put(312, "john@example.com");
		map.put(121, "fionna@example.com");
		map.put(567, "kim@example.com");
		map.put(411, "jack@example.com");
		map.put(923, "leo@example.com");
		map.put(111, "sia@example.com");
		
		Employee emp = new Employee();
		employees.put(emp.eid, emp);
		
		System.out.println(map);
		
		// Uniqueness | Update Operation
		map.put(411, "dan@example.com");	// This will update the value, 411 key will not be added again
		
		// Value can be Duplicated
		map.put(513, "kim@example.com");
		
		// We can have 1 null key
		map.put(null, "someone@example.com");
		
		// We can have null values
		map.put(123, null);
		
		System.out.println(map);
		
		// Fetch Data
		String email = map.get(411);
		System.out.println(">> email at 411 is: "+email);
		
		System.out.println(">> map size is: "+map.size());
		if(map.containsKey(567)) {
			System.out.println(">> key 567 is in the map");
		}
		
		if(map.containsValue("sia@example.com")) {
			System.out.println(">> sia@example.com is in the map");
		}
		
		// remove on the basis of key
		//map.remove(123);

		// Read All the elements in the map i.e. iterate in Map
		Set<Integer> keys = map.keySet();	// Extract all the keys from the Map
		System.out.println(">> keys are: "+keys);
		
		Iterator<Integer> itr = keys.iterator();
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~");
		while(itr.hasNext()) {
			Integer key = itr.next();
			String value = map.get(key);
			System.out.println(key+"\t"+value);
		}
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~");
		
		// HashMap stores the Key Value Pair as an Entry Object
		// Entry Object has 2 attributes -> key and value
		
		System.out.println();
		
		Set<Entry<Integer, String>> entries = map.entrySet();
		Iterator<Entry<Integer, String>> itr1 = entries.iterator();
		
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~");
		while(itr1.hasNext()) {
			Entry<Integer, String> entry = itr1.next();
			Integer key = entry.getKey();
			String value = entry.getValue();
			System.out.println(key+"\t"+value);
		}
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~");
		
		
		/// Thread-Safe
		Hashtable<Integer, String> table = new Hashtable<Integer, String>();
		table.put(312, "john@example.com");
		table.put(121, "fionna@example.com");
		table.put(567, "kim@example.com");
		table.put(411, "jack@example.com");
		table.put(923, "leo@example.com");
		table.put(111, "sia@example.com");
		//table.put(null, "sia@example.com");	// null key not allowed
		//table.put(115, null);					// null value not allowed
		
		System.out.println("table: ");
		System.out.println(table);
		
		
	}

}
