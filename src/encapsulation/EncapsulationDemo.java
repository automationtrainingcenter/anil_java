package encapsulation;
/*
 * encapsulation means hiding properties of a class
 * binding data and the operations on the data together is known as encapsulation
 * to hide the properties of a class declare those properties using  
 */

import java.util.Scanner;

// Employee class

public class EncapsulationDemo {
	private int id;
	private String name;
	private String address;
	private String designation;
	private double salary;
	private String phnum;
	private String password;

	public EncapsulationDemo(int id, String name, String address, String designation, double salary, String phnum) {
		this.id = id;
		this.name = name;
		this.address = address;
		this.designation = designation;
		this.salary = salary;
		this.phnum = phnum;
	}

	public void display() {
		System.out.println("Displaying Employee Details");
		System.out.println("name: " + name + "\ndesignation: " + designation);
	}

	public void setPassword(String password) {
		Scanner sc = new Scanner(System.in);
		if (this.password == null) {
			System.out.println("enter your password");
			this.password = sc.next();
			System.out.println("password created successfully");
		} else {
			System.out.println("enter your phone number");
			String pnum = sc.next();
			if (this.phnum.equals(pnum)) {
				System.out.println("your password is " + this.password);
			} else {
				System.out.println("unauthorised access");
			}
		}
	}

	private boolean validate() {
		Scanner sc = new Scanner(System.in);
		System.out.println("validating credentials\nenter your password");
		String pass = sc.next();
		if (this.password.equals(pass)) {
			return true;
		} else {
			return false;
		}
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		if (validate()) {
			this.address = address;
		} else {
			System.out.println("invalid credentials");
		}
	}

	public String getPhnum() {
		return phnum;
	}

	public void setPhnum(String phnum) {
		if (validate()) {
			this.phnum = phnum;
		} else {
			System.out.println("invalid credentials");
		}
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public String getDesignation() {
		return designation;
	}

	public double getSalary() {
		return salary;
	}

}
