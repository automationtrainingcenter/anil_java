package basics;

public class StaticDemo {
	
	int i = 0;
	static int j = 0;
	
	public void display() {
		i++;
		j++;
		System.out.println("i = "+i+"\tj = "+j);
	}
	
	public static void main(String[] args) {
		StaticDemo s1 = new StaticDemo();
		StaticDemo s2 = new StaticDemo();
		StaticDemo s3 = new StaticDemo();
		
		s1.display();
		s2.display();
		s3.display();
	}

}
