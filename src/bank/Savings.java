package bank;

public class Savings extends BaseAccount{
	
	private final static double minBalance = 10000;

	public Savings(String name, String accnum, double balance, String phnum) {
		super(name, accnum, balance, phnum);
	}
	
	@Override
	public double withdraw(double amount) {
		if(amount >= 0) {
			if(validate()) {
				if(this.balance >= amount) {
					this.balance -= amount;
					System.out.println("please collect your cash");
					if(this.balance < minBalance) {
						this.balance -= 100;
					}
					return amount;
				}else {
					System.out.println("insufficient balance");
				}
			}
		}else {
			System.out.println("invalid amount");
		}
		return 0;
	}

	
	

}
