package finalkeyword;

public class FinalMethodChild extends FinalMethodParet{

	@Override
	public void methodOne() {
		System.out.println("method one overriden in child class");
	}
	
//	@Override
//	public void methodTwo() {
//		
//	} // we can't override a final method of the parent class

}
