package encapsulation;

public class TestEmployee {
	public static void main(String[] args) {
		EncapsulationDemo obj1 = new EncapsulationDemo(101, "satish", "lingampllai", "Manager", 50000, "9876543210");
		obj1.display();
		obj1.setPassword("password");
//		obj1.salary = 5000;
		System.out.println(obj1.getSalary());
		System.out.println(obj1.getId());
		System.out.println("before modifying phone num is "+obj1.getPhnum());
		obj1.setPhnum("7778889900");
		System.out.println("after modifying phone num is "+obj1.getPhnum());
		
	}

}
