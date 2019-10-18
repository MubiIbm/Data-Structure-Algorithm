import java.util.*;
class Area1
{
int length;
int breadth;
public Area1(int length,int breadth)
{
	this.length=length;
	this.breadth=breadth;
}
	
	public void returnArea()
	{
		System.out.println("\nArea = "+(breadth*length));
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter Length of rectangle = ");
		int l=sc.nextInt();
		System.out.print("Enter its breadth = ");
		int b=sc.nextInt();
		Area1 a =new Area1(l,b);
		
		a.returnArea();
	}
}
