package basics;
/*
 * Data type is nothing but type of the data we are going to store in memory.
 * 
* In java we have mainly two types of data types
* 1. primitive
* 		boolean either true or false - Boolean 1 bit
* 		char which will store single character - Character 2 bytes
*		byte store integer values - Byte 1 byte 
*		short store integer values - Short 2 bytes
*		int store integer values -Integer 4 bytes
*		long store integer values - Long 8 bytes
*		float store floating point number -Float 4 bytes
*		double store floating point number - Double 8 bytes
* 	
* 2. reference/ non primitive
* 		Arrays
* 		Strings
* 
*  Wrapper class: For every primitive data_type we have an equivalent class in Java. Those classes
* are known as Wrapper classes. These are used to perform different operations on data.
* 		1. Boolean
* 		2. Character
* 		3. Byte
* 		4. Short
* 		5. Integer
* 		6. Long
* 		7. Float
* 		8. Double
* 
* 	WCData_type obj_name = new WCData_type(value);
* 
* 	Type Casting: converting one type of primitive data to another type of primitive data
* 	up casting: lower memory type to higher memory type : widening : no data loss
* 	down casting: higher memory data type to lower memory data type : narrowing : data loss is possible
* 
* 	Converting primitive data type to wrapper class: boxing
*  Converting wrapper to primitive : un-boxing
* 
* 
* syntax to create primitive data type
* data-type var-name  = value; //initialization
* data-type var-name; //declaration
* var-name = value; //assignment to the variable which is already declared
* 
* variable is nothing but name of memory location where we are storing data
*/

public class DataTypesDemo {
	public static void main(String[] args) {
		// boolean 
		boolean b = true;
		System.out.println("boolean value is "+b);
		System.out.println("**************************************************");
		
		
		// character 
		char ch = 'a';
		System.out.println("character value is "+ch);
		System.out.println("min value of character is  "+Character.MIN_VALUE);
		System.out.println("max value of character is "+Character.MAX_VALUE);
		System.out.println("size of character is "+Character.SIZE);
		System.out.println("size of character in bytes is "+Character.BYTES);
		System.out.println("**************************************************");
		
		
		// byte
		byte by = 123;
		System.out.println("byte value is "+by);
		System.out.println("min value of byte is  "+Byte.MIN_VALUE);
		System.out.println("max value of byte is "+Byte.MAX_VALUE);
		System.out.println("size of byte is "+Byte.SIZE);
		System.out.println("size of byte in bytes is "+Byte.BYTES);
		System.out.println("**************************************************");
		
		// short
		short sh = 12345;
		System.out.println("short value is "+sh);
		System.out.println("min value of short is  "+Short.MIN_VALUE);
		System.out.println("max value of short is "+Short.MAX_VALUE);
		System.out.println("size of short is "+Short.SIZE);
		System.out.println("size of short in bytes is "+Short.BYTES);
		System.out.println("**************************************************");
		
		// int
		int i = 1234567890;
		System.out.println("integer value is "+i);
		System.out.println("min value of integer is  "+Integer.MIN_VALUE);
		System.out.println("max value of integer is "+Integer.MAX_VALUE);
		System.out.println("size of integer is "+Integer.SIZE);
		System.out.println("size of integer in bytes is "+Integer.BYTES);
		System.out.println("**************************************************");
		
		// long
		long l = 1234567890987l;
		System.out.println("long value is "+l);
		System.out.println("min value of long is  "+Long.MIN_VALUE);
		System.out.println("max value of long is "+Long.MAX_VALUE);
		System.out.println("size of long is "+Long.SIZE);
		System.out.println("size of long in bytes is "+Long.BYTES);
		System.out.println("**************************************************");
		
		// float
		float fl = 21.234f;
		System.out.println("float value is "+fl);
		System.out.println("min value of float is  "+Float.MIN_VALUE);
		System.out.println("max value of float is "+Float.MAX_VALUE);
		System.out.println("size of float is "+Float.SIZE);
		System.out.println("size of float in bytes is "+Float.BYTES);
		System.out.println("**************************************************");
		
		// double
		double d = 1234.5678;
		System.out.println("double value is "+d);
		System.out.println("min value of double is  "+Double.MIN_VALUE);
		System.out.println("max value of double is "+Double.MAX_VALUE);
		System.out.println("size of double is "+Double.SIZE);
		System.out.println("size of double in bytes is "+Double.BYTES);
		System.out.println("**************************************************");
		
		// type casting
		// up casting
		short shLow = 12345;
		int iHigh;
		iHigh = shLow;
		System.out.println("iHigh = "+iHigh);
		
		// down casting
		// lower-type-var-name = (lower_type) higher_type_var_name
		short shHigh = 400;
		byte byLow;
		byLow = (byte) shHigh;
		System.out.println("byLow = "+byLow);
		
		
		// primitive to wrapper conversion boxing
		int ip = 123;
		Integer iw = Integer.valueOf(ip);
		
		// wrapper to primitive conversion unboxing
		Float fw = 12.2f;
		float fp = fw.floatValue();
		
		// primitive to reference (string)
		int inp = 123456;
		String i2s = Integer.toString(inp);
		System.out.println(i2s+10);
		
		double dp = 9.8;
		String d2s = Double.toString(dp);
		System.out.println(d2s+10);

		
		
		// reference (string) to primitive
		String s1 = "456321";
		int s2i = Integer.parseInt(s1);
		System.out.println(s2i+10);
		
		String s2 = "98.876";
		float s2f = Float.parseFloat(s2);
		System.out.println(s2f+10);
		
		
	}

}
