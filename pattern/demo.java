import java.util.*;
class demo
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter n=");
		int n=sc.nextInt();
		for(int i=1; i<=n; i++)
		{
			for(int j=1;i<=i-1;i++)
			{
				System.out.print(" ");
			}
			System.out.println();
			for(int j=1;j<=(2*n);j++)
			{
				if(i==1 && j%2!=0)
				{
					System.out.print("*");
				}
				else if(i==j )
				{
					System.out.print("*");
				}
				else if(i+j==(2*n))
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			}
		
		}
	}
}
