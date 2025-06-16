import java.util.*;
class BinomialCoefficient
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
	public static int binoCoeff(int n,int r)
	{
		int fact_n=FactorialNum(n);
		int fact_r=FactorialNum(r);
		int fact_nmr=FactorialNum(n-r);
		int fa=fact_n/(fact_r*fact_nmr);
		return(fa);
	}
	public static void main(String args[])
	{
		int n,r,f;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value of n and r =");
		n=sc.nextInt();
		r=sc.nextInt();
		f=(binoCoeff(n,r));
		
		System.out.println("Binomial coefficient is = " +f);
	}
}