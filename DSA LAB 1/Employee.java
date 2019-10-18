import java.util.*;
class Employee
{
	int hours;
	int salary;
	
	public void getInfo(int hours,int salary)
{
	this.salary=salary;
	this.hours=hours;
}
	public void addSalary()
	{
		if(salary<500)
		{
			salary=salary+10;
		}
	}
	public void addWork()
	{
		if(hours>6)
		{
			salary=salary+5;
		}
		System.out.print("No of Hours = "+hours+"\nSalary = "+salary);
	}
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter No of Hours of Work of per Day = ");
		int h=sc.nextInt();
		System.out.print("Enter Salary of Employee = ");
		int s=sc.nextInt();
		Employee e=new Employee();
		e.getInfo(h,s);
		e.addSalary();
		e.addWork();

	}
}