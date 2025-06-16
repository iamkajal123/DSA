class Pattern3
{
	public static void main(String agrs[])
	{
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=7;j++)
			{
				if((i+j=i) || ((i+j)%2!=0))
				{
					System.out.print(" 1 ");
				}
				else
				{
					System.out.print(" 2 ");
				}
			}
			System.out.println();
		}
	}
}