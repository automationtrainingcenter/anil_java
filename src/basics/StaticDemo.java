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
		
		s1.display(); // i = 1	j = 1
		s2.display(); // i = 1	j = 2
		s3.display(); // i = 1	j = 3
	}

}
