package bank;

public class Current extends BaseAccount{
	private static final double minBalance = 25000;
	
	
	public Current(String name, String accnum, double balance, String phnum) {
		super(name, accnum, balance, phnum);
	}
	
	
	@Override
	public double withdraw(double amount) {
		if(amount >= 0) {
			if(validate()) {
				if(this.balance >= amount) {
					System.out.println("withdrawing money");
					this.balance -= amount;
					System.out.println("Withdraw successfull\nPlease collect your cash");
					if(this.balance < minBalance) {
						this.balance -= 500;
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
