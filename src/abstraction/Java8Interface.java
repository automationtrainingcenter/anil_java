package abstraction;

public interface Java8Interface {
	
	// abstract method
	void methodOne();
	
	// normal method using static method
	public static void methodTwo() {
		System.out.println("static method two definition in interface");
	}
	
	// normal method using default method
	public default void methodThree() {
		System.out.println("default method three definition in interface");
	}
	

}
