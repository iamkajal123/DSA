/*  A
	BC
	DEF
	GHIJ
			*/


import java.util.*;
class characterprint
{
	public static void main(String args[])
	{
		int i,j;
		int n=4;
		char ch='A';
		for(i=1;i<=n;i++)
		{
			for(j=1;j<=i;j++)
			{
				System.out.print(ch);
				ch++;
			}
			System.out.println();
		}
	}
}