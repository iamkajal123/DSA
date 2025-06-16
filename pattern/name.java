import java.util.*;
class name
{
	//k
    public static void main(String args[])
	{
	   int n=4;
	   for(int i=1;i<=n;i++)
	   {
	       for(int j=1;j<=1;j++)
		   {
			   System.out.print("*");
		   }
		   for(int j=1;j<=n-i;j++)
		   {
			   System.out.print(" ");
		   }
		   for(int j=1;j<=1;j++)
		   {
			   System.out.print("*");
		   }
		   System.out.println();
	   }
	   for(int i=n;i>=1;i--)
	   {
	       for(int j=1;j<=1;j++)
		   {
			   System.out.print("*");
		   }
		   for(int j=1;j<=n-i;j++)
		   {
			   System.out.print(" ");
		   }
		   for(int j=1;j<=1;j++)
		   {
			   System.out.print("*");
		   }
		   System.out.println();
	    }
		System.out.println();
	
		   //A
		
		for(int i=1;i<=6;i++)
		{
			for(int j=1;j<=6;j++)
			{
				if(i==1 ||i==4 ||j==1 ||j==6)
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	    System.out.println();

	//j
	
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=5;j++)
			{
				if(i==1 || j==4 || (i==5 & j<=4) || (i==4 &j==1))
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		System.out.println();
	   //A
		for(int i=1;i<=6;i++)
		{
			for(int j=1;j<=6;j++)
			{
				if(i==1 ||i==4 ||j==1 ||j==6)
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		System.out.println();
		
   //l
	
			int number=7;
			for(int i=1;i<=number;i++)
			{
				for(int j=1;j<=1;j++)
				{
					System.out.print("*");
					if(i==number)
					{
						for(int k=1;k<n;k++)
						{
							System.out.print("*");
						}
					}
					System.out.println();
			    }
			}
	
	}
}



				
				

