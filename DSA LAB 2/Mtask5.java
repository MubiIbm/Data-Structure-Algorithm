import java.util.*;//Importing library
class Mtask5
{
	 public static void main(String[] ume ) {//main method
int av[]= new int[8]; //Array
int large=0;
int seclarge=0;

Scanner s = new Scanner (System.in);//For taking Input from User

for (int z=0;z<av.length;z++)//Loop for Returning 2nd largest number
{
	av[z]= s.nextInt();//Taking Input
	if (large < av[z])
	{
		seclarge = large;
		large = av[z];
	}
	else if (seclarge < av[z]) {
		seclarge = av[z];

	}

}
System.out.print(seclarge+ " Second largest array");//Printing 2nd large number


}
}