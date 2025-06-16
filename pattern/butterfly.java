/*

*      *  
**    **
***  ***
********
********
***  ***
**    **
*      *

*/

class butterfly
{
	public static void main(String args[])
	{
		int n=4;
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=i;j++)        //star
			{
				System.out.print("*");
			}
			for(int j=1;j<=2*(n-i);j++)  //spaces
			{
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++)        //star
			{
				System.out.print("*");
			}
			System.out.println();
		}
		//second half part
		for(int i=n;i>=1;i--)
		{
			for(int j=1;j<=i;j++)        //star
			{
				System.out.print("*");
			}
			for(int j=1;j<=2*(n-i);j++)  //spaces
			{
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++)        //star
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
