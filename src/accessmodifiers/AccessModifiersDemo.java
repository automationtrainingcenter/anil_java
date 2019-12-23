package accessmodifiers;
/*
 * In Java we have 4 access modifiers
 * public : we can access these any where with in the Java world
 * private : we can access these with in the class only
 * default : we can access these with in the package only
 * protected : same as default. outside the package via child class objects we can access
 */
public class AccessModifiersDemo {
	
	public String pVar = "public";
	private String prVar = "private";
	String dVar  = "default";
	protected String proVar = "protected";
	
	
	public static void main(String[] args) {
		AccessModifiersDemo obj = new AccessModifiersDemo();
		System.out.println(obj.pVar);
		System.out.println(obj.prVar);
		System.out.println(obj.dVar);
		System.out.println(obj.proVar);
	}

}
