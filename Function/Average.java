//Write a Java method to compute the average of three numbers..


import java.util.*;
class Average
{
	public static int calculateAverage(int a,int b,int c)
	{
		return(a+b+c)/3;
		
	}
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any three number=");
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		int average=calculateAverage(a,b,c);
		System.out.println("Average of three number = "+average);
	}
}