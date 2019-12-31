package bank;

public class Credit extends BaseAccount{
	private double cashLimit;
	private double creditLimit;

	public Credit(String name, String accnum, double balance, String phnum) {
		super(name, accnum, balance, phnum);
		// here balance means credit limit
		creditLimit = balance;
		cashLimit = balance * 0.3;
	}

	// deposite means repayments
	@Override
	public void deposite(double amount) {
		if(amount >= 0) {
			if(amount <= (creditLimit-balance)) {
				System.out.println("depositing.........");
				balance += amount;
				cashLimit = balance * 0.3;
				System.out.println("deposite successfull");
			}else {
				System.out.println("total due amount is Rs. "+(creditLimit - balance)+" amount your entered is "+amount);
			}
		}else {
			System.out.println("invalid amount");
		}
	}

	
	@Override
	public double withdraw(double amount) {
		if(amount >= 0) {
			if(validate()) {
				if(this.cashLimit >= amount) {
					System.out.println("withdrawing....");
					this.balance -= amount;
					System.out.println("Withdraw successufull\nPlease collect your cash");
					this.balance -= 500;
					this.cashLimit = this.balance * 0.3;
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
