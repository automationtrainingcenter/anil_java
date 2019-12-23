package accessmodifiers;

public class PrivateDemo {
	public static void main(String[] args) {
		AccessModifiersDemo obj = new AccessModifiersDemo();
		System.out.println(obj.pVar);
		System.out.println(obj.dVar);
		System.out.println(obj.proVar);
//		System.out.println(obj.prVar); 
		// we can't access private variables outside the class in which they declared
	}

}
