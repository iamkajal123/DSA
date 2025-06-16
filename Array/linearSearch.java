//import java.string.*;
class linearSearch
{
/*
	public static int search(int number[],int key)
	{
		for(int i=0;i<number.length;i++)
		{
			if(number[i]==key)
			{
				return i;
			}
		}
		return -1;
		
	}
	public static void main(String args[])
	{
		int number[]={10,20,30,40,50};
		int key=60;
		
		int index=search(number,key);
		if(index==-1)
		{
			System.out.println("Element is not found");
		}
		else
		{
			System.out.println("Element is found at location = "+index);
		}
	}
*/


    public static int search(String item[],String key)
	{
		for(int i=0;i<item.length;i++)
		{
			if(item[i]==key)
			{
				return i;
			}
		}
		return -1;
		
	}
	public static void main(String args[])
	{
		String item[] ={"dosa","samosa","vadapav","misal"};
		String key = "vadapav"; 
		int index=search(item,key);
		if(index==-1)
		{
			System.out.println("Element is not found");
		}
		else
		{
			System.out.println("Element is found at location = "+index);
		}
	}
}