class InsertionSort
{
	public static void sort(int a[])
	{
		int temp,i,j,k;
		for(i=1; i<a.length; i++)
		{
			temp=a[i];
			for(j=i-1; j>=0 && a[j]>temp; j--)
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
	public static void main(String args[])
	{
		int a[]={4,3,2,1,5};
		sort(a);
	}

}