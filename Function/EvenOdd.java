/* Write a method named isEven that accepts an int argument. The method
should return true if the argument is even, or false otherwise. Also write a program to test your method */

import java.util.*;
class EvenOdd
{
	public static boolean isEven(int n)
	{
		if(n%2==0)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number =");
		int no=sc.nextInt();
		boolean x=isEven(no);
		System.out.println("Even(true) or odd(false) = "+x);
	}
}
		