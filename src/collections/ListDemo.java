package collections;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/*
 * List is an inbuilt data structure in Java
 * List is used to store multiple sets of data of similar type
 * List is an interface and is implemented by two classes
 * 1. ArrayList: it is same as an array but array list size is dynamic
 * 2. LinkedList
 * 
 * List allows duplicate values also
 * 
 * List is index based and index number starts with 0
 */

public class ListDemo {

	public static void main(String[] args) {
		// create a list
		List<String> courses = new LinkedList<>();

		// find the number of items in a list
		int noi = courses.size();
		System.out.println("number of items in the list is " + noi);

		// verify a list is empty or not
		System.out.println("list is empty " + courses.isEmpty());

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

		// to print the values of a list we can use object reference name
		System.out.println(courses);

		// to retrieve the data from the list we can use get(int index)
		System.out.println(courses.get(1));

		// retrieve all the data from the list using normal for loop
		for (int i = 0; i < courses.size(); i++) {
			System.out.println(courses.get(i).toUpperCase());
		}
		
		// retrieve all the data from the list using for each loop
		for(String course : courses) {
			System.out.println(course + " --- "+ course.length());
		}
		
		// retrieve all the data from the list using iterator interface
		Iterator<String> it = courses.iterator();
		while(it.hasNext()) {
			System.out.println(it.next().toLowerCase());
		}
		
		// insert the data into the list
		courses.add(3, "manual");
		System.out.println(courses);
		
		// update the data in a list
		courses.set(2, "cucumber");
		System.out.println(courses);
		
		
		// delete the data from the list
		courses.remove(2);
		System.out.println(courses);
		
		courses.remove("manual");
		System.out.println(courses);
		
		// search for an item with in the list
		System.out.println("courses contains katalon "+courses.contains("katalon"));
		
		System.out.println("katalon is at index number "+courses.indexOf("katalon"));
		
		List<String> subList = courses.subList(3, 7);
		System.out.println(subList);
		
		// remove all the values from the list
		courses.clear();
		
		System.out.println(courses.size());
	
		
		
		
		
		
		
	}

}
