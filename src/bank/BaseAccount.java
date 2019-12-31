package bank;

import java.util.Scanner;

public class BaseAccount implements Account {

	private String name;
	private String accnum;
	protected double balance;
	private String phnum;
	private int pin;

	public BaseAccount(String name, String accnum, double balance, String phnum) {
		this.name = name;
		this.accnum = accnum;
		this.balance = balance;
		this.phnum = phnum;
	}

	public String getPhnum() {
		return phnum;
	}

	public void setPhnum(String phnum) {
		this.phnum = phnum;
	}

	public String getName() {
		return name;
	}

	public String getAccnum() {
		return accnum;
	}

	public void displayBalance() {
		System.out.println("Balance in your account is Rs. " + this.balance);
	}

	@Override
	public void setPin() {
		Scanner sc = new Scanner(System.in);
		if (this.pin == 0) {
			System.out.println("enter your pin");
			int pin = sc.nextInt();
			this.pin = pin;
		} else {
			System.out.println(
					"to update the pin please enter your phone number which starts with " + this.phnum.substring(0, 3));
			String phnum = sc.next();
			if (this.phnum == phnum) {
				System.out.println("your pin is " + this.pin);
			} else {
				System.out.println("invalid phone number");
			}
		}

	}

	@Override
	public boolean validate() {
		if (this.pin != 0) {
			Scanner sc = new Scanner(System.in);
			System.out.println("enter your pin");
			int pin = sc.nextInt();
			if (this.pin == pin) {
				return true;
			} else {
				System.out.println("invalid pin");
			}
		}else {
			System.out.println("please set the pin first");
		}
		return false;
	}

	@Override
	public void deposite(double amount) {
		if (amount >= 0) {
			System.out.println("depositing....");
			this.balance += amount;
			System.out.println("deposite successfull");
		} else {
			System.out.println("incorrect amount");
		}

	}

	@Override
	public double withdraw(double amount) {
		if (amount >= 0) {
			if (validate()) {
				if (this.balance >= amount) {
					this.balance -= amount;
					System.out.println("please collect your cash");
					return amount;
				} else {
					System.out.println("insufficient balance");
				}
			}
		} else {
			System.out.println("invalid amount");
		}
		return 0;
	}

}
