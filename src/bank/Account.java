package bank;

public interface Account {

	void deposite(double amount);

	double withdraw(double amount);

	void setPin();

	boolean validate();

	String getPhnum();

	void setPhnum(String phnum);

	String getName();

	String getAccnum();

}
