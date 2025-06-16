//Write a Java program to check if a number is a palindrome in Java? number=121 =>reverse pn toch num milto

import java.util.*;
class palindrome
{
	public static int checkpalindrome(int n)
	{
		int Palindrome=n;
		int reverse=0;
		while(Palindrome!=0)
		{
			int remainder=Palindrome%10;
			 reverse=reverse*10+remainder;
			Palindrome=Palindrome/10;
			
		}
		return reverse;
	}
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number =");
		int no=sc.nextInt();
		int x=checkpalindrome(no);
		if(x==no)
			{
				System.out.println(no+" is palindrome number ");
			}
			else
			{
				System.out.println( no+" is not palindrome number ");
			}
	}
}