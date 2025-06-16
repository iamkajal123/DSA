/*    1
	  12
	  123
	  1234
	  
	           */


import java.util.*;
class HalfPyramidNum
{
	public static void main(String args[])
	{
		int i,j;
		int n=4;
		for(i=1;i<=n;i++)
		{
			for(j=1;j<=i;j++)
			{
				System.out.print(j);
			}
			System.out.println();
		}
	}
}