package basics;

public class InstanceVsStatic {
	
	// instance variable
	int id;
	String name;
	
	// static variable
	static String ifsc;
	
//	public void storeDetails(int i, String n, String ifscCode) {
//		id = i;
//		name = n;
//		ifsc = ifscCode;
//	}
	
	public void display() {
		System.out.println("id = "+id+"\nname = "+name+"\nifsc code = "+ifsc);
	}
	
	public static void main(String[] args) {
		// assign some value to ifsc code
		InstanceVsStatic.ifsc = "HDFC001";
		
		
		// create an object of the class
		InstanceVsStatic obj1 = new InstanceVsStatic();
		obj1.id = 101;
		obj1.name = "surya";
		
		
		InstanceVsStatic obj2 = new InstanceVsStatic();
		obj2.id = 102;
		obj2.name = "anil";
		
		InstanceVsStatic obj3 = new InstanceVsStatic();
		obj3.id = 103;
		obj3.name = "ramesh";
		
		obj1.display();
		obj2.display();
		obj3.display();
		
		System.out.println("***************************************************");
		
		obj2.name = "anil kumar";
		
		InstanceVsStatic.ifsc = "HDFC00101";
		InstanceVsStatic obj4 = new InstanceVsStatic();
		obj4.id = 104;
		obj4.name = "ramya";
		
		obj1.display();
		obj2.display();
		obj3.display();
		obj4.display();
	}
	

}
