class Duplicate 
{
	public static void main (String ume[])
	{
	int arr[] = {1,1,2,2,3,3,4,4,5,5,6,6,7,7,8,8,9,9,10,10};//Array and its value
	int av = arr.length;
	int pkb[] = new int [arr.length];//Declaring another Array
	int u=0;
	for (int i=0;i<arr.length-1;i++)//Loop for checking
	{
	if (arr[i] != arr[i+1])
	{
     pkb[u++] = arr[i];
	}
	}
	pkb[u++]= arr[av-1];
	for (int k = 0;k<u;k++)
	{
		System.out.println(pkb[k]);//Printing Array
	}
	}
}