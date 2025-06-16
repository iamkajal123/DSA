class RecursionDemo
{
	public static void  main(String args[])
	{
		int no=10;
		//printDec(no);
		printInc(no);
	}
	public static void printInc(int n)
	{
		if(n==1)
		{
			System.out.print(n+ " ");
			return;
		}
		printInc(n-1);
		System.out.print(n+" ");
		
	}
	public static void printDec(int n)
	{
		if(n==1)
		{
			System.out.println(n);
			return;
		}
		System.out.print(n+ " ");
		printDec(n-1);
	}
}