/*    ****
	  ***
	  **
	  *
	           */


import java.util.*;
class invertedStar
{
	public static void main(String args[])
	{
		int i,j;
		int n=4;
		for(i=1;i<=n;i++)
		{
			for(j=1;j<=n-i+1;j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}
}