class SubArray
{
	public static void printarray(int number[])
	{
		int totalpair=0;
		int max=Integer.MIN_VALUE;
		for(int i=0; i<=number.length; i++)
		{
			int start=i;;
			for(int j=i; j<number.length; j++)
			{
				int end=j;
				int sum=0;
				for(int k=start; k<=end; k++)
				{
					
					System.out.print(number[k]+" ");
					sum=sum+number[k];
					
				}
				System.out.println(   "sum  = "+sum);
				totalpair++;
				System.out.println();
				if(max < sum)
				{
					max=sum;
				}
			}
			System.out.println();
		}
		System.out.println("total subarray = "+totalpair);
		
		System.out.println("max element = "+max);
	}
	public static void main(String args[])
	{
		int number[]={2,4,6,8,10};
		printarray(number);
	}
}