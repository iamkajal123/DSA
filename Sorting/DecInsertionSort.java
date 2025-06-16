class DecInsertionSort
{
	public static void main(String args[])
	{
		int a[]={3,6,2,1,8,7,4,5,3,1};
		int i,j,k,temp;
		for(i=1; i<a.length; i++)
		{
			temp=a[i];
			for(j=i-1; j>=0 && a[j]<temp; j--)
			{
				a[j+1]=a[j];
			}
			a[j+1]=temp;
		}
		for(i=0; i<a.length; i++)
		{
			System.out.print(a[i]+ " ");
		}
	}
}