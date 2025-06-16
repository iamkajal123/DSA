import java.util.*;
class functionConcept1
{
	public static void calculateSum()            //formal parameter , parameter
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
		calculateSum();                   //actual parameter , argument
	}
}

/*2)second method
import java.util.*;
class functionConcept1
{
	public static int calculateSum(int num1,int num2)    //formal parameter,parameter
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
}*/

/*3)third method
import java.util.*;
class functionConcept1
{
	public static int calculateSum(int num1,int num2)
	{
		
		int sum=num1+num2;
        return sum;
	}
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the two number =");
		int a=sc.nextInt();
		int b=sc.nextInt();
		int sum=(calculateSum(a,b));
		System.out.println("Sum of two number ="+sum);
		
	}
}*/