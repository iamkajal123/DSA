import java.util.*;
class factorial
{
	public static int FactorialNum(int n)
	{
		int fact=1,i;
		for( i=1;i<=n;i++)
		{
			fact=fact*i;
		}
		return(fact);
	}
	public static void main(String args[])
	{
		int n,f;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value =");
		n=sc.nextInt();
		f=(FactorialNum(n));
		
		System.out.println("Factiral of the "+n+ " is = " +f);
	}
}
			