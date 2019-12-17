package methods_and_constructors;
/*
 * Constructor is a special method whose name is same as the class name.
 * Constructor doesn't have any explicit return type. Every Constructor will return reference(memory location) 
 * of the object
 * 
 * Constructor is used to create an instance of the class. We have two types of constructors
 * Default constructor
 * 	It will assign default values based on the data type of the instance variables
 * 
 * Parameterized constructor
 *  It will assign user defined values to the instance variables at the time of object creation 
 *  we can create n number of parameterized constructors either by changing the number of parameters, type 
 *  of parameters or sequence of parameters, this is known as constructor overloading
 *  
 * Java provides "this" keyword. "this" keyword always represents the current class instance.
 * which will differentiate instance variables with local variables.
 * We can use "this" keyword to call the constructor inside another constructor,
 * calling a constructor inside another constructor is the first line of code. This concept known as
 * constructor chaining 
 * 
 */

public class ConstructorDemo {

	// properties
	int id;
	String name;
	String course;
	long phnum;
	float fee;

	// default constructor
	public ConstructorDemo() {
		id = 100;
		name = "surya";
		course = "python";
		phnum = 9988776655l;
		fee = 6000.0f;
	}
	
	// parameterized constructor
	public ConstructorDemo(int id, String name, String course, long phnum, float fee) {
		this(id, name, course, fee, phnum);
	}
	
	// Changing the sequence of arguments
	public ConstructorDemo(int id, String name, String course, float fee, long phnum) {
		this(id, name, course); // constructor call is first line of code inside another constructor
		this.fee = fee;
		this.phnum = phnum;
	}
	
	// changing number of arguments
	public ConstructorDemo(int id, String name, String course) {
		this.id = id;
		this.name = name;
		this.course = course;
	}

	public void display() {
		System.out.println(id + "\n" + name + "\n" + course + "\n" + phnum + "\n" + fee);
		System.out.println("*****************************************************");
	}

	public static void main(String[] args) {
		ConstructorDemo obj1 = new ConstructorDemo();
		obj1.display();

		ConstructorDemo obj2 = new ConstructorDemo(101, "praveen", "java", 8768112200l, 8000.00f);;
		obj2.display();
		
		
		ConstructorDemo obj3 = new ConstructorDemo(102, "anil", "selenium", 9000.00f, 786443210l);
		obj3.display();

		ConstructorDemo obj4 = new ConstructorDemo(103, "haritha", "testing");
		obj4.display();
		

	}

}
