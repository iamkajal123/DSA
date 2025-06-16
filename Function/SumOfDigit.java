// Write a Java method to compute the sum of the digits in an integer.

import java.util.*;
class SumOfDigit
{
	public static void calculateSum(int no)
	{
			int sum=0,rem;
			while(no>0)
			{
				rem=no%10;
				sum=sum+rem;
				no=no/10;
			}
			System.out.println("Sum of digit ="+sum);
		
	}
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number =");
		int n=sc.nextInt();
		calculateSum(n);
		
	}
}
		