package collections;

import java.util.ArrayList;
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
 * List is index based and index nubmer starts with 0
 */

public class ListDemo {

	public static void main(String[] args) {
		// create a list
		List<String> courses = new ArrayList<>();

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
		
		
		
	}

}
