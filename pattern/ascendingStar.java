*
**
***
****

import java.util.*;
class ascendingStar
{
	public static star(int n)
	{
		int i,j;
		for(i=1;i<=n;i++)
		{
			for(j=1;j<=i;j++)
			{
				System.out.println("*");
			}
		}
	}
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int no=sc.nextInt();
		ascendingStar a=new ascendingStar();
		a.star(no);
	}
}