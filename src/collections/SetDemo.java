package collections;
/*
 * Set is also an inbuilt data structure in Java
 * Set is used to store a collection of values of similar data type
 * Set is an interface and is implemented by 
 * 1. HashSet: it will not maintain any order for the data
 * 2. LinkedHashSet: it will maintain insertion order for the data
 * 3. TreeSet: it will maintain ascending order for numeric data and alphabetical order
 * for character data.
 * 
 * Set is not index based, Set does not allow duplicate values
 * 
 */

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class SetDemo {

	public static void main(String[] args) {
		// create a Set
		Set<String> courses = new TreeSet<>();

		// find the number of items in a set
		int noi = courses.size();
		System.out.println("number of items in the set is " + noi);

		// verify a set is empty or not
		System.out.println("set is empty " + courses.isEmpty());

		// store the data in a list
		courses.add("Java");
		courses.add("Python");
		courses.add("selenium");
		courses.add("testing");
		courses.add("katalon");
		courses.add("RestAssured");
		courses.add("flask");
		courses.add("django");
		courses.add("selenium");

//		System.out.println(courses.size());

		// to print the values of a set we can use object reference name
		System.out.println(courses);

		// retrieve all the data from the set using for each loop
		for (String course : courses) {
			System.out.println(course + " --- " + course.length());
		}

		// retrieve all the data from the set using iterator interface
		Iterator<String> it = courses.iterator();
		while (it.hasNext()) {
			System.out.println(it.next().toLowerCase());
		}
		
		// delete the data from the set
		courses.remove("katalon");
		System.out.println(courses);
		
		// search for any data in the set
		System.out.println(courses.contains("Java"));
		
		// remove all the data from the set
		courses.clear();
		System.out.println(courses.size());
		

	}

}
