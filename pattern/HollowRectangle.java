//hollow rectangle
/*
*****
*   *
*   *
*****
*/

import java.util.*;
class HollowRectangle
{
	public static void main(String args[])
	{ 	
		
		PrintHollowRect(4,5);
	
	}
	public static void PrintHollowRect(int totrow,int totcolunm)
	{
		int i,j;
		for(i=1;i<=totrow;i++)   //outer (total num of row)
		{
			for(j=1;j<=totcolunm;j++)   //inner column (total num of column);
			{
				if(i==1 || i==totrow || j==1 || j==totcolunm)  //location of the cell
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