class DecSelectionSort
{
	public static void main(String args[])
	{
		int a[]={3,6,2,1,8,7,4,5,3,1};
		int i,j,k,temp;
		for(i=0; i<a.length-1; i++)
		{
			k=i;
			for(j=i+1; j<a.length; j++)
			{
				if(a[j]>a[k])
				{
					k=j;
				}
				
			}
			if(k!=i)
			{
				temp=a[k];
				a[k]=a[i];
				a[i]=temp;
			}
		}
		for(i=0; i<a.length; i++)
		{
			System.out.print(a[i]+ " ");
		}
	}
}