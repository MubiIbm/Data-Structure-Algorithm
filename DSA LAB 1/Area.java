import java.util.*;// For taking input from User
class Area
{
int length;
int breadth;
	public void setDim(int length,int breadth)//Method for setting the Values of Length and Breadth of Rectangle
	{
		this.length=length;
		this.breadth=breadth;
	
	}
	public void getArea()//Method for printing and Calculating the Area of Rectangle
	{
		System.out.println("\nlength of rectangle = "+length+"\nBreadth of rectangle = "+breadth+"\nArea = "+(breadth*length));
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);//Scanner File object for taking input from User
		System.out.print("Enter Length of rectangle = ");
		int l=sc.nextInt();
		System.out.print("Enter its breadth = ");
		int b=sc.nextInt();
		Area a =new Area();
		a.setDim(l,b); //Passing arguments to setDim()method
		a.getArea(); //Calling getArea method to print the Area
	}
}
