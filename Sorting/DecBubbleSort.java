class DecBubbleSort
{
	public static void main(String args[])
	{
		int a[]={3,6,2,1,8,7,4,5,3,1};
		int i,j,temp;
		for(i=0; i<a.length-1; i++)
		{
			for(j=i+1; j<a.length-1; j++)
			{
				if(a[i]<a[j])
				{
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		for(i=0; i<a.length; i++)
		{
			System.out.print(a[i]+ " ");
		}
	}
}