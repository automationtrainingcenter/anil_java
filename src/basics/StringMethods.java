package basics;

public class StringMethods {

	public static void main(String[] args) {
		String s1 = "selenium";
		String s2 = "";
		String s3 = " webdriver";
		String s4 = "SUNSHINE";
		String s5 = "welcome to the selenium course with Java programming launguage";
		String s6 = "                          actual text                          ";
		/*
		 * length() : which will return an integer value which is the number of
		 * characters in the given string
		 */
		System.out.println("length of s1 is "+s1.length());
		System.out.println("lengtht of s2 is "+s2.length());

		/* isEmpty() : returns true if a given string is an empty string */
		System.out.println("s1 is empty ... "+s1.isEmpty());
		System.out.println("s2 is empty ... "+s2.isEmpty());

		/* concat(): combines two given strings */
		String str1 = s1.concat(s3);
		System.out.println(s1);
		System.out.println(s3);
		System.out.println(str1);

		/* equals(): verifies two strings by considering case */
		System.out.println(s1.equals("selenium")); // true
		String str2 = "Selenium";
		System.out.println(s1.equals(str2)); // false
		System.out.println(s1.equals(s3)); // false

		/*
		 * equalsIgnoreCase(): verifies two strings are equal or not without considering
		 * the case
		 */
		System.out.println(s1.equalsIgnoreCase("selenium")); // true
		System.out.println(s1.equalsIgnoreCase(str2)); // true
		System.out.println(s1.equalsIgnoreCase(s3)); // false

		/*
		 * contains(): verifies a given substring is available inside the given string
		 * or not
		 */
		System.out.println(s5.contains(s1)); // true
		System.out.println(s5.contains(str2)); // false
		
		/* toLowerCase(): converts given string to lower case */
//		s4 = s4.toLowerCase();
		System.out.println(s4.toLowerCase());
		System.out.println(s4);

		/* toUpperCase(): converts given string to upper case */
		System.out.println(s1.toUpperCase());
		
		/* charAt(int index): returns a character at a given index number */
		System.out.println(s1.charAt(4));

		/* indexOf(): returns index value of first occurrence of a given character */
		System.out.println(s1.indexOf("e"));
		System.out.println(s1.indexOf("w"));

		/* stratsWith(): verifies a given string starts with given substring */
		System.out.println(s5.startsWith("welcome")); // true
		System.out.println(s3.startsWith("web")); // false
		

		/* endsWith(): verifies a given string ends with given substring */
		System.out.println(s5.endsWith("launguage")); // true
		System.out.println(s3.endsWith("Driver")); // false

		/*
		 * replace(): it will replace given old character or old substring with new
		 * character or new substring
		 */
		System.out.println(s1.replace('e', 'E'));
		System.out.println(s1.replace("e", "eee"));
		System.out.println(s5.replace("Java", "Python"));
			

		/*
		 * substring(): returns substring from a given string based on beginning and
		 * optional ending index values Note: substring() will include the beginning
		 * index character and excludes ending index character
		 */
		System.out.println(s1.substring(5));
		System.out.println(s3.substring(1, 4));
		

		/* toCharArray() return an array of characters inside the given string */
		char[] chars = s1.toCharArray();
		System.out.println(chars[0]);
		System.out.println(chars.length);
		

		/*
		 * split() return an array of substrings inside the given string, divided based
		 * on some expression
		 */
		String[] words = s5.split(" ");
		System.out.println(words[0]);
		System.out.println(words[1]);

		/*
		 * trim() which will remove extra spaces at beginning and ending of given string
		 */
		System.out.println(s6);
		System.out.println(s6.trim());
	}

}
