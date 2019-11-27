package basics;

public class TestVariablesDemo {
	public static void main(String[] args) {
		// access instance variable of VariablesDemo class
		// create an object of the VariablesDemo class
		VariablesDemo obj = new VariablesDemo();
		obj.iVar = 3000;
		System.out.println("instance variable value is "+obj.iVar);
		
		// access static variable of VariablesDemo class
		VariablesDemo.sVar = 5000;
		System.out.println("static varaible value is "+VariablesDemo.sVar);
		
	}

}
