class Factorial
{
	public static void main(String agrs[])
	{
		int no=5;
		//printfactorial(no);
		System.out.print(printfactorial(no));
	}
	public static int printfactorial(int n)
	{
		if(n==1)
		{
			return 1;
		}
		//int fnm1 = printfactorial(n-1);
		int fn = n * printfactorial(n-1);
		//int fn = n * printfactorial(n-1);
		return fn;
	}
}