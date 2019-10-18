import java.util.*;
class Area
{
int length;
int breadth;
	public void setDim(int length,int breadth)
	{
		this.length=length;
		this.breadth=breadth;
	
	}
	public void getArea()
	{
		System.out.println("\nlength of rectangle = "+length+"\nBreadth of rectangle = "+breadth+"\nArea = "+(breadth*length));
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter Length of rectangle = ");
		int l=sc.nextInt();
		System.out.print("Enter its breadth = ");
		int b=sc.nextInt();
		Area a =new Area();
		a.setDim(l,b);
		a.getArea();
	}
}
