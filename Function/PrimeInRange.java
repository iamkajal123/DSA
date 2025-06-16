//prime number of the given range

import java.util.*;
class PrimeInRange
{
	public static boolean IsPrime(int n)
	{
		if(n==2)
		{
			return true;
		}
		else
		{
			for(int i=2;i<=Math.sqrt(n);i++)
			{
				if(n%i==0)
				{
					return false;
				}
			}
			return true;
		}
	}
	public static void Primerange(int n)
	{
		for(int i=2;i<=n;i++)
		{
			if(IsPrime(i))
			{
				System.out.print(i+ " ");
			}
		}
		System.out.println();
	}
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the n=");
		int n=sc.nextInt();
		Primerange(n);
	}
}