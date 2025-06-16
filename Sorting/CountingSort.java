class CountingSort
{
	public static void main(String args[])
	{
		int a[]={4,3,2,1,5};
		
		//find largest element
		int largest =Integer.MIN_VALUE;
		for(int i=0; i<a.length; i++)
		{
			largest=Math.max(largest,a[i]);
		}
		
		
		int count[]=new int[largest+1];
		for(int i=0; i<a.length; i++)
		{
			count[a[i]]++;
		}
		
		//sorting
		int j=0;
		for(int i=0; i<count.length; i++)
		{
			while(count[i] > 0)
			{
				a[j]=i;
				j++;
				count[i]--;
			}
		}
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i]+ " ");
		}
		
	}
}
