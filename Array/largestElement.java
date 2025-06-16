import java.util.*;
class largestElement
{
	public static int findlargest(int no[],int large)
	{
		for(int i=0;i<no.length;i++)
		{
			if(no[i]>large)
			{
				large=no[i];
			}
		}
		return large;
	}
	public static void main(String args[])
	{
		int number[]={100,2,6,99,5};
		int largest=0;    //int largest=Integer.MIN_VALUE; (mam can use  -infinity intial value to largest)
		int max =findlargest(number,largest);
		System.out.println("Largest element = "+max);
	}
}
		