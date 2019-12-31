package bank;

import java.util.Scanner;

public class AccountFactory {

	public static Account createAccount(String name, String accnum, double balance, String phnum) {
		Account acc = null;
		System.out.println("enter account type");
		Scanner sc = new Scanner(System.in);
		String accType = sc.next();
		if (accType.equalsIgnoreCase("savings")) {
			acc = new Savings(name, accnum, balance, phnum);
		} else if (accType.equalsIgnoreCase("current")) {
			acc = new Current(name, accnum, balance, phnum);
		} else if (accType.equalsIgnoreCase("credit")) {
			acc = new Credit(name, accnum, balance, phnum);
		} else {
			System.out.println("invalid account type");
		}
		return acc;
	}

}
