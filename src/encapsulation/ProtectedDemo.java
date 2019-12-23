package encapsulation;

import accessmodifiers.AccessModifiersDemo;

public class ProtectedDemo extends AccessModifiersDemo{
	
	public static void main(String[] args) {
		AccessModifiersDemo pobj = new AccessModifiersDemo();
		System.out.println(pobj.pVar);
//		System.out.println(pobj.proVar);
		
		ProtectedDemo cobj = new ProtectedDemo();
		System.out.println(cobj.pVar);
//		System.out.println(cobj.dVar);
		System.out.println(cobj.proVar);
		// we can access protected variables using child class object of a parent class in which they declared
	}

}
