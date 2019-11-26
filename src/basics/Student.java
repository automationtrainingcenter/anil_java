package basics;

public class Student {
	
	// properties
	String name;
	String course;
	long phnum;
	String qualification;
	
	public void storeDetails(String name, String course, long phnum, String qualification) {
		this.name = name;
		this.course = course;
		this.phnum = phnum;
		this.qualification = qualification;
	}
	
	public void printDetails() {
		System.out.println("name = "+name+"\ncourse = "+course+"\nphone number = "+phnum+"\nqualification = "+qualification);
	}
	
	
	public static void main(String[] args) {
		// create an object of student class
		Student s1 = new Student();
		s1.storeDetails("surya", "python", 9871234001l, "MS");
		Student s2 = new Student();
		s2.storeDetails("ravi", "java", 8971234567l, "BTech");
		Student s3 = new Student();
		s3.storeDetails("anil", "selenium", 7869911230l, "Mtech");
		
		s1.printDetails();
		s2.printDetails();
		s3.printDetails();
		
	}

}
