/*import java.util.*;
class funtionConcept1
{
	public static void calculateSum()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the two number =");
		int num1=sc.nextInt();
		int num2=sc.nextInt();
		int sum=num1+num2;
		System.out.println("Sum of two number ="+sum);
	}
	public static void main(String args[])
	{
		calculateSum();
	}
}*/

import java.util.*;
class funtionConcept1
{
	public static int calculateSum(int num1,int num2)
	{
		
		int sum=num1+num2;
		System.out.println("Sum of two number ="+sum);
		return sum;
	}
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the two number =");
		int a=sc.nextInt();
		int b=sc.nextInt();
		calculateSum(a,b);
	}
}