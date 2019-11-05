import java.util.*;//For Input
class TestingArray 
{
	public static void main (String ume[])
	{
	int arr[] = new int[100];//Creating Array
	Scanner s = new Scanner(System.in);//For taking Input from User
	for(int i = 0;i<arr.length;i++)
	{
	System.out.println("Enter number for array");//for printing
	arr[i] = s.nextInt();
	}
	}
}