import java.util.*;// For taking input from User
class Area1
{
int length;
int breadth;//Declaring both length and breadth Instance Variable 
public Area1(int length,int breadth)// Passing arguments to the Constructor of Area1 class and setting the values of Length and Breadth
{
	this.length=length;
	this.breadth=breadth;
}
	
	public void returnArea()//Method for calculating the Area 
	{
		System.out.println("\nArea = "+(breadth*length));
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);//Scanner File object for taking input from User
		System.out.print("Enter Length of rectangle = ");
		int l=sc.nextInt();
		System.out.print("Enter its breadth = ");
		int b=sc.nextInt();
		Area1 a =new Area1(l,b); //Passing the arguments to the Constructor of Area1 class
		
		a.returnArea();//Calling this method for Printing Area
	}
}
