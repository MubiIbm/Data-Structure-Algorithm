class Account
{
int amount;
	protected double balance;
	public void deposit(double amount)
	{
	System.out.print(amount);

	}
	public void withdraw(double amount)
	{
		System.out.println(amount);
	}
}
class SavingAccount extends Account
{
	double a=2.5;
	private  void defaultInterstRate(double a)
	{
this.a=a;
	}
	private double interstRate;
	double rate;
	public  void setDefaultInterstRate(double rate)
{
	this.rate=rate;
}
public void applyMonthlyInterst()
{

}
public static void main(String[] args) {
	
}
}

