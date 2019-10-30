class Task4{

	public static float aver(int arr[])//Float return type Method of Array
	{
		int a=0;
		for(int  i: arr)//for each loop for adding the Elements of array to variable a
		{
			a=a+i;
		}
		return a/arr.length;//return the Average
	}
	public static void main(String[] args) {
		int [] ar={1,3,2,4,5};//Declaring Array
		System.out.print("Average is = "+aver(ar));//Calling the Method and Printing Average
	}
}
