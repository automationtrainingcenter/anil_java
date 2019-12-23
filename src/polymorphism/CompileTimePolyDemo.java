package polymorphism;

public class CompileTimePolyDemo {
	
	
	public void add(int a, String b) {
		System.out.println(a+b);
	}
	
	// by changing number of inputs
	public void add(int a, int b, String c) {
		System.out.println(a+b+c);
	}
	
	// by changing sequence of the input
	public void add(String a, int b) {
		System.out.println(a+b);
	}
	
	// by changing type of the arguments
	public void add(int a, int b) {
		System.out.println(a+b);
	}
	
	// by changing only return type of a method we can't achieve method overloading
//	public String add(int a, int b) {
//		return "";
//	}

}
