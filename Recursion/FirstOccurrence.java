class FirstOccurrence
{
	public static int firstOccure(int arr[],int key, int i)
	{
		if(i==arr.length)
		{
			return -1;
		}
		
		if(arr[i]==key)
		{
			return i;
		}
		
		return firstOccure(arr,key,i+1);
		
	}
	public static void main(String args[])
	{
		int arr[]={8,3,6,9,5,10,2,5,3};
		int key=5;
		int i=0;
		System.out.println(firstOccure(arr,key,i));
	}
}