package polymorphism;
/*
 * Polymorphism means one object behaving differently based on the input or environment.
 * We have two types of Polymorphism
 * 1. Compile time polymorphism or method overloading
 * 		To Achieve CTP we need a class with multiple methods of same name. 
 * 	 	We can achieve CTP in 3 ways
 * 		1. by changing the number of arguments of a method
 * 		2. by changing the sequence of arguments
 * 		3. by changing the type of arguments
 * 		By simply changing the return type of a method we can't achieve CTP or method overloading
 * 
 * 2. Runtime polymorphism or method overriding
 * 		To achieve method overriding or RTP we need two classes which are in parent and child relation
 * 		we are going to override the definition of parent class method in child class. The child class
 *  method will have the same signature as the parent class method.
 * 	
 */
public class PolymorphismDemo {
	
	public static void main(String[] args) {
		CompileTimePolyDemo obj = new CompileTimePolyDemo();
		obj.add(10, "20");
		obj.add("20", 10);
		obj.add(10, 10, "10");
		obj.add(10, 10);
		
		
		RunTimePolyParent rpObj = new RunTimePolyParent();
		rpObj.add(10, "100");
		
		
		RunTimePolyChild rcObj = new RunTimePolyChild();
		rcObj.add(10, "100");
		
		RunTimePolyParent pcObj = new RunTimePolyChild();
		pcObj.add(10, "50");
	}

}
