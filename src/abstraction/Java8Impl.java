package abstraction;

public class Java8Impl implements Java8Interface{

	@Override
	public void methodOne() {
		System.out.println("method one implementation in class");
	}
	
	// overriding default method
	@Override
	public void methodThree() {
		System.out.println("method three implementation in class");
	}
	// we can override default method of interface
	
	
	// overriding static method
//	@Override
//	public void methodTwo() {
//		
//	}
//	we can not override static method of interface
	

}
