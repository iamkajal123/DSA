class LastOccurrence
{
	public static int islastoccurrence(int arr[],int key,int i)
	{
		if(i==arr.length)
		{
			return -1;
		}
		
		int isfound = islastoccurrence(arr,key,i+1);
		
		if(isfound == -1 && arr[i] == key)
		{
			return i;
		}
		return isfound;
	}
	
	public static void main(String args[])
	{
		int arr[]={8,3,6,9,5,20,2,3,5};
		System.out.println(islastoccurrence(arr,41,0));
	}
}
	