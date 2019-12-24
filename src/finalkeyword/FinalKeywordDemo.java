package finalkeyword;
/*
 * we can declare a variable, method or class as final
 * if we declare a variable as final then we can't update the value of that variable
 * if we declare a method as final then we can't override that method in child class
 * if we declare a class as final then we can't create child classes to that final class, but 
 * it can have a parent class
 */


public class FinalKeywordDemo {
	int i = 100;
	final int j = 10;
	
	public static void main(String[] args) {
		FinalKeywordDemo obj= new FinalKeywordDemo();
		System.out.println("i = "+obj.i+"\t j = "+obj.j);
		obj.i = 500;
//		obj.j = 50;
		System.out.println("i = "+obj.i+"\t j = "+obj.j);
		
		FinalMethodParet fpObj = new FinalMethodChild();
		fpObj.methodOne();
		fpObj.methodTwo();
		
	}
	
	
	

}
