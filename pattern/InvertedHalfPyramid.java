/*   INVERTED HALF-PYRAMID with Numbers pattern
		1 2 3 4 5
		1 2 3 4
		1 2 3
		1 2
		1          */
		
class InvertedHalfPyramid
{
	public static void main(String args[])
	{
		int n=5,i,j;
		for(i=1;i<=n;i++)
		{
			for(j=1;j<=n-i+1;j++)
			{
				System.out.print(j);
			}
			System.out.println();
		}
	}
}