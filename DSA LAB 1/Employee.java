import java.util.*;// For taking input from User
class Employee
{
	int hours;
	int salary;//Declaring both length and breadth Instance Variable 
	
	public void getInfo(int hours,int salary)//Method for Setting the values of salary and hours
{
	this.salary=salary;
	this.hours=hours;
}
	public void addSalary()//Method for adding 10$ if Salary is less than 500
	{
		if(salary<500)
		{
			salary=salary+10;
		}
	}
	public void addWork()//Method for adding 5$ if Working Hours are greater than 6
	{
		if(hours>6)
		{
			salary=salary+5;
		}
		System.out.print("No of Hours = "+hours+"hrs\nSalary = "+salary+"$");
	}
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);//Scanner File object for taking input from User
		System.out.print("Enter No of Hours of Work of per Day = ");
		int h=sc.nextInt();
		System.out.print("Enter Salary of Employee = ");
		int s=sc.nextInt();
		Employee e=new Employee();
		e.getInfo(h,s);//Passing values to the getInfo() method
		e.addSalary();
		e.addWork();

	}
}