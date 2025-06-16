// Optimization of the bubble sort(user enter the sorted array then buuble sort execute this logic but when  
//user already enter the sorted array then why we need to run this logic so overcome this problem we need to 
//declare the vairable
class BubblesortOptimize
{
	public static void sort(int arr[])
	{
		int swapCount=0;
		for(int turn=0; turn<arr.length-1; turn++)
		{
			
			for(int j=0; j<arr.length-1-turn; j++)
			{
				if(arr[j] > arr[j+1])
				{
					int temp;
					temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
					swapCount++;
				}
			}
			
		}
		if(swapCount==0)
			{
				System.out.println("Array already sorted");
			}
		
	}
	public static void printarr(int arr[])
	{
		for(int i=0; i<arr.length; i++)
		{
			System.out.print(arr[i]+ " ");
		}
	}
	public static void main(String args[])
	{
		int arr[]={1,2,3,6,5};
		sort(arr);
		printarr(arr);
		
	}
}