import java.util.*;
class Indian_coins
{
	public static void main(String agrs[])
	{
		int a[]={1,2,5,10,20,50,100,500,2000};
		
		//Scanner sc=new Scanner(System.in);
		//System.out.println("Enter value=");
		int val=590;
		
		int n=0;
		for(int i=a.length-1;i>=0;i--)
		{
			if(a[i]<=val)
			{
				while(a[i]<=val)
				{
					val =val- a[i];
					n++;
				}
			}
		}
		System.out.println("no="+n);
	}
}