package basics;
/**
 * String is a collection of characters
 * Strings are immutable in java that means we can't modify or change string data once 
 * stored in a memory location
 * Strings will store in separate memory location known as String constant pool
 * To create mutable strings we have to use StringBuilder or StringBuffer classes
 * 
 * String values must be stored using ""
 */

public class StringDemo {
	
	public static void main(String[] args) {
		String s1 = "sunshine";
		String s2 = "selenium";
		String s3 = "sunshine";
		
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
		System.out.println(s3.hashCode());
		
		s1 = "selenium";
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
		System.out.println(s3.hashCode());
	}

}
