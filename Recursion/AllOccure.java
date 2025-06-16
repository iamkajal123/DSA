class AllOccure
{
	public static void alloccurences(int number[], int key, int i)
	{
		if(i==number.length)
		{
			return ;
		}
		
		if(number[i]==key)
		{
			System.out.println(i);
		}
		alloccurences(number,key, i+1);
	
	}
	public static void main(String agrs[])
	{
		int number[]={3,2,4,5,6,2,7,2,2};
		int key=2;
		alloccurences(number, key, 0);
	}
}