/*INVERTED & ROTATED HALF-PYRAMID pattern
   *
  **
 ***
****
          */
		  
import java.util.*;
class halfpyramidRotated
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		//System.out.println("Enter the n=");
		//int n=sc.nextInt();
		int n=4;
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=n-i;j++)
			{
				System.out.print(" " );
			}
			for(int k=1;k<=i;k++)
			{
				System.out.print("*");
			}
			
			System.out.println();
		}
	}
}