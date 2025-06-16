//selection sort

class SSort
{
	public static void sort(int a[])
	{
		int i,j,k,temp;
		for(i=0; i<a.length-1; i++)
		{
			k=i;
			for(j=i+1; j<a.length; j++)
			{
				if(a[j] < a[k])
				{
					k=j;
				}
			}
			if(k!=i)
			{
				temp=a[k];
				a[k]=a[j];
				a[j]=temp;
			}
		}
		for(i=0; i<a.length; i++)
		{
			System.out.print(a[i]+ " ");
		}
	}
    public static void main(String args[])
	{
		int a[]={3,2,5,1,4};
		sort(a);
	}
}