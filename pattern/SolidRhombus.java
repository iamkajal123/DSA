/*   SOLID RHOMBUS pattern
    *****
   *****
  *****
 *****
*****         */

class SolidRhombus
{
	public static void main(String args[])
	{
		int n=5,i,j,k;
		for(i=1;i<=n;i++)
		{
			for(j=1;j<=n-i;j++)
			{
				System.out.print(" ");
			}
			for(k=1;k<=n;k++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}
}