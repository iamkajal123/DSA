import java.util.*;
class pyramid
{
   public static void pyramidnum(int n)
   {
      for(int i=1;i<=n;i++)        //outer loop
	  {
	    for(int j=1;j<=n-i;j++)   //spaces
		{
		   System.out.print(" ");
		}
		for(int j=1;j<=i;j++)     //number
		{
		    System.out.print(i +" ");
		}
		System.out.println();
	  }
	}
	public static void main(String args[])
	{
		 int no;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any number =");
		no=sc.nextInt();
		pyramid p=new pyramid();
		p.pyramidnum(no);
	}
}