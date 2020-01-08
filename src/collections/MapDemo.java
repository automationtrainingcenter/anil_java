package collections;

import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

/*
 * Map is inbuilt data structure in Java
 * Map is used to store collection of items of similar data type as key and value pairs
 * Map is an interface which is implemented by
 * 1. HashMap: it will not maintain any order for your data
 * 2. LinkedHashMap: it will maintain insertion order for data
 * 3. TreeMap: it will maintain ascending order for numeric data and alphabetical order for character data
 * based keys
 * 
 * In map we can use duplicate values but we can not use duplicate keys
 */

public class MapDemo {
	public static void main(String[] args) {
		// create a Map
		Map<String, Integer> courses = new LinkedHashMap<>();

		// find the number of items in a map
		int noi = courses.size();
		System.out.println("number of items in the map is " + noi);

		// verify a map is empty or not
		System.out.println("map is empty " + courses.isEmpty());
		
		// add items to the map
		courses.put("Java", 45);
		courses.put("Python", 60);
		courses.put("selenium", 60);
		courses.put("django", 40);
		courses.put("flask", 30);
		courses.put("testing", 90);
//		courses.put("django", 30);
		
		// to print the values of a map on the console
		System.out.println(courses);
		
		// retrieve the data from the map
		System.out.println(courses.get("testing"));
		
		// retrieve all the keys from a map
		Set<String> keys = courses.keySet();
		System.out.println(keys);
		for(String key : keys) {
			System.out.println(key + " course will take "+courses.get(key)+ " days");
		}
		
		// retrieve all the values from the map
		Collection<Integer> values = courses.values();
		for(Integer value : values) {
			System.out.println(value);
		}
		
		// retrieve all the key and value pairs
		Set<Entry<String, Integer>> kvpairs = courses.entrySet();
//		System.out.println(kvpairs);
		for(Entry<String , Integer> pair : kvpairs) {
			System.out.println(pair.getKey() +" === "+pair.getValue());
		}
		
		// update the data of the map
		courses.put("Java", 30);
		System.out.println(courses);
		
		// delete the data from the map
		courses.remove("flask");
		System.out.println(courses);
		
		courses.remove("Java", 40);
		System.out.println(courses);
		
		// search for a key in a map
		System.out.println("courses contains Java "+courses.containsKey("Java"));
		
		// search for a value in a map
		System.out.println("courses contains value as 45 "+courses.containsValue(45));
		
		// remove all the data from the map
		courses.clear();
		System.out.println(courses.size());
		
		
	}

}
