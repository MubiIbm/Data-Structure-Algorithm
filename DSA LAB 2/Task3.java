import java.util.Arrays;;//Library used for importing Arrays methods
import java.util.*
class Task3
{
	public static void printArray(float a[])//Created a method for printing Array
	{
		for(float i:a)//For each (for printing every element of Array 
		{
			System.out.println(i);
		}
	}
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);//Scanner File for Taking 
		float [] arr={1.2f,2.4f,1.4f,7.4f,6.4f,0.2f};//Declared an Array of FLoat Datatype
		printArray(arr);//called method for printing array
		Arrays.sort(arr);//method for sorting array
		System.out.println("After Sorting");
		printArray(arr);
		System.out.println("Length of Array = "+arr.length);//Printing the length of array
		System.out.print("Enter a no you want to Search = ");
		Float sEARCH_NO=sc.nextFloat();//Taking Input from User
		System.out.println("Location of Number is = "+Arrays.binarySearch(arr,sEARCH_NO));//Binary Search Methods
		float []arr1=Arrays.copyOf(arr,arr.length);//Copy method to copy elements from Arrays
		System.out.println("Copied array :- ");
		printArray(arr1);
		System.out.println("Equal method in java = "+Arrays.equals(arr,arr1));//Equals Mehtod that whether Arrays are equal or not
		Arrays.fill(arr1,1,5,5);//For filling a number in Array
		printArray(arr1);
		System.out.println("toString Method:-\n"+Arrays.toString(arr1));//To convert a Array to String
	}
}