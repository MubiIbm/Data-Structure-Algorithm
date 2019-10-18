class Account//Parent class
{
	int amount;
	protected double balance;
	public void deposit(double amount)//passing double data type argument
	{
	System.out.print("Deposit amount is = "+amount+"$");

	}
	public void withdraw(double amount)//passing double data type argument
	{
		System.out.println("Withdraw Amount is = "+amount+"$");
	}
}
class SavingAccount extends Account
{
	double a;
	private  void defaultInterstRate(double a)//making method private so any other classes can't access it
	{
this.a=a;
System.out.println("Default Interst Rate = "+a);
	}
	private double interstRate;//instiating a Private variable so any other classes can't access it
	double rate;
	public  void setDefaultInterstRate(double rate)
{
	this.rate=rate;
	System.out.println("After setting Default Interst rate = "+rate);
}
public void applyMonthlyInterst()
{
	System.out.println("It is Apply monthly Interst Method");
}
public static void main(String[] args) {
	SavingAccount sa=new SavingAccount();//Object of Child class by which we can access the Parent Class also
	sa.deposit(331.2);//Passing values to the method
	sa.withdraw(223.1);//Passing values to the method
	sa.defaultInterstRate(25.2);//Passing values to the method
	sa.setDefaultInterstRate(45.22);//Passing values to the method
	sa.applyMonthlyInterst();

	
}
}

