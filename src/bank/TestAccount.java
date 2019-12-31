package bank;

public class TestAccount {
	public static void main(String[] args) {
		Account acc = AccountFactory.createAccount("surya", "sbi1234rst", 100000, "9876543210");
		acc.setPin();
		acc.deposite(20000);
		acc.displayBalance();
		acc.withdraw(15000);
		acc.displayBalance();
		acc.deposite(10000);
		acc.displayBalance();
	}

}
