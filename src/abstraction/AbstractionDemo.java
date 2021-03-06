package abstraction;

import abstraction.Outer.Inner;

/*
 * Abstraction means a plan or template to create a class
 * Abstraction means hiding the implementation details of methods
 * we have two to implement abstraction
 * 1. abstract classes
 * 		It is class which contains at least one abstract method and declared using "abstract" keyword. 
 * Abstract method is a method with declaration only. 
 * A normal Java class "extends" this abstract class and provides implementation to the abstract methods.
 * If in case this normal Java class failed to provide implementation to any one abstract method then that
 * normal Java class also becomes abstract class.
 * An abstract class can extends another abstract class or normal java class and it can implement an interface
 * Abstract class can contain both abstract methods and concrete methods.
 * 
 * 
 * 2. Interfaces
 * 		In interface all the methods are public and abstract by default. A normal Java class "implements" 
 * interface and provides implementation to the abstract methods.
 * By default all the methods in Interface are public and abstract
 * By default all the variables of interface are public, static and final
 * An interface can extends multiple interfaces and it can't implement another interface
 * A class can implement multiple interfaces and can only extends one normal class or one abstract class
 * 
 * From Java 8 onwards interface allows concrete methods
 * These concrete methods are either static methods or "default" methods
 * We can access default method using interface reference and static method using interface name only
 * we can override a default method of interface in implementation classes but
 * we can't override static method of interface
 * 
 * 
 * we can't create an instance of either abstract class or interface but we can create object reference,
 * 
 * 
 * Type of interfaces
 * Marker Interfaces or Tagged interfaces
 * 	it is an interface without any abstract methods like Serializable, Clonable .etc
 * 	Generally these interfaces provides special instructions to the JVM
 * 	we can have common parent to the multiple classes or interfaces
 * 
 * Functional interfaces
 * 	it is an interface with only one abstract method.
 * A class can implement this functional interface or we can write a lambda expression which will implement 
 * the abstract method of functional interface
 */

public class AbstractionDemo {
	
	public static void main(String[] args) {
		// abstract class
		AbstractClassChild obj = new AbstractClassChild();
		obj.methodOne();
		obj.methodTwo();
		obj.methodThree();
		
		 
		// interface
		InterfaceDemo iObj = new InterfaceImpl();
		iObj.methodOne();
		iObj.methodTwo();
	
		
		
		// multiple interfaces implemented by single class : multiple inheritance
		InterfaceOne miObj = new MultileIntefacesImpl();
		miObj.methodOne();
		InterfaceTwo mcObj = (InterfaceTwo) miObj;
		mcObj.methodTwo();
		
		
		// inner interfaces
		Outer oObj = new OuterInnerImpl();
		oObj.omethod();
		Inner inObj = (Inner) oObj;
		inObj.imethod();
		
		// if outer interface contains a method which returns inner interface object reference
		// then we can use any one of the following two approaches 
		Inner innObj = oObj.method();
		innObj.imethod();
		
		oObj.method().imethod();
		
		
		// java 8 interface
		Java8Interface j8Obj = new Java8Impl();
		j8Obj.methodOne(); // abstract method
		j8Obj.methodThree(); // default method 
		Java8Interface.methodTwo(); // static method
		
		
		// functional interface implemented by a normal java class
		FuncInterface fnor = new FuncInterfaceImpl();
		fnor.methodOne();
		
		// functional interface implemented by an anonymous class
		FuncInterface fanon = new FuncInterface() {

			@Override
			public void methodOne() {
				System.out.println("FuncInterface method one implementation using Anonymous class");
			}   
			
		};
		fanon.methodOne();
		
		// functional interface implementation by using a lambda expression
		FuncInterface flam = () -> System.out.println("FuncInterface method one implementation using lambda expression");
		flam.methodOne();
		
	} 
	

}
