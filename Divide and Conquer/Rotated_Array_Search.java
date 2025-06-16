class Rotated_Array_Search
{
	public static int search(int arr[], int tar,int si,int ei)
	{
		if(si>ei)
		{
			return -1;
		}
		int mid=si+(ei-si)/2;
		if(tar==arr[mid])
		{
			return mid;
		}
		if(arr[si]<=arr[mid])
		{
			if(arr[si]<=tar && tar<arr[mid])
			{
				return  search(arr,tar,si,mid-1);
			}
			else
			{
				return search(arr,tar,mid+1,ei);
			}
		}
		else
		{
			if(arr[mid]<=tar && tar<=arr[ei])
			{
				return search(arr,tar,mid+1,ei);
			}
			else
			{
				return search(arr,tar,si,mid-1);
			}
		}
	}		
		
	public static void main(String agrs[])
	{
		int arr[]={4,5,6,7,0,1,2};
		int target=0;
		int tarIndex = search(arr, target, 0, arr.length);
		System.out.println(tarIndex);
	}
}