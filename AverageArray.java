import java.util.*;//For Input
class AverageArray
{
	public static void main (String ume[])//Main method
	{
		int  total=0;
		int arr[] = new int [8];//Declaring Array
		double average;

		Scanner s = new Scanner(System.in);//For Taking Input
		for (int i = 0;i<arr.length;i++)
		{ 
           arr[i] = s.nextInt();
           total =  total + arr[i];
           

		}
		average = total / arr.length;
		System.out.println(average + " Average of array");//Printing Average of Array


	}
}