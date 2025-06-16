class HollowRhombus
{
	public static void main(String args[])
	{
		int n=5,j,i,k,x,m,p;
		for(i=1;i<=n;i++)
		{
			for(j=1;j<=n-i;j++)
			{
				System.out.print(" ");
			}
			for(k=i;k<=n;k++)
			{
				System.out.print("*");
			}
			for(x=i;x<=2;x++)
			{
				System.out.print("*");
				    for(m=1;m<=3;m++)
					{
						System.out.print(" ");
					}
			}
			for(p=i;p<=n;p++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}
}