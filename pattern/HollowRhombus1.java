/*
    *****
   *   *
  *   *
 *   *
*****
*/



class HollowRhombus1
{
	public static void main(String args[])
	{
		int n=5,i,j;
		int totrow=5;
		int totcol=5;
		
		for(i=1;i<=n;i++)
		{
			for(j=1;j<=n-i;j++)
			{
					System.out.print(" ");
			}
			for( j=1;j<=totcol;j++)
			{
				if(i==1 || i==totrow || j==1 || j==totcol)
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
}