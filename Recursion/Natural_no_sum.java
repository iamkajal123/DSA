class Natural_no_sum
{
	public static int printSum(int n)
	{
		if(n==1)
		{
			return 1;
		}
		int fnm1 = printSum(n-1);
		int fact = n + fnm1;
		return fact;
	}
	public static void main(String args[])
	{
		int n=5;
		System.out.print(printSum(n));
	}
}
	