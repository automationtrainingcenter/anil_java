package basics;

import java.util.Scanner;

public class ReadingInput {
	
	public static void main(String[] args) {
		/*
		 * to read the input from the console we can use Scanner class
		 * this class provides several methods to read different types of data
		 */
		
		// create an object of the Scanner class
		Scanner sc = new Scanner(System.in);
		
		// reading an integer input
		System.out.println("enter some number");
		int num = sc.nextInt();
		System.out.println("num is "+num);
		
		
		// reading a boolean input
		System.out.println("enter some boolean value");
		boolean b = sc.nextBoolean();
		System.out.println("boolean value is "+b);
		
		// reading a float input
		System.out.println("enter some floating point number");
		float f = sc.nextFloat();
		System.out.println("float value is "+f);
		
		// reading a string value
		System.out.println("enter your string value");
		String s = sc.next();
		System.out.println("string value is "+s);
		
		// reading a character value
		System.out.println("enter a character");
//		String str = sc.next();
//		char ch = str.charAt(0);
		char ch = sc.next().charAt(0); // object chaining
		System.out.println("character value is "+ch);
		
		
		
		
	}

}
