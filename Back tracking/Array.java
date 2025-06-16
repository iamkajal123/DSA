class Array
{
	public static void changeArr(int arr[],int val,int i)
	{
		if(i==arr.length)
		{
			printArr(arr);
			return ;
		}
		 arr[i]=val;
		changeArr(arr, val+1, i++);
		arr[i]=arr[i] - 2;
		
	
	}
	public static void printArr(int arr[])
	{
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+ " ");
		}
		System.out.println();
	}
	public static void main(String agrs[])
	{
		int arr[]=new int[5];
		changeArr(arr,1,0);
		printArr(arr);
	}
}
		