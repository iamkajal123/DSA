import java.util.*;
class palindrom
{
   public static void palindromnum(int n)
   {
      for(int i=1;i<=n;i++)        //outer loop
	  {
	    for(int j=1;j<=n-i;j++)   //spaces
		{
		   System.out.print(" ");
		}
		for(int j=i;j>=1;j--)     //decending order
		{
		    System.out.print(j);
		}
		for(int j=2;j<=i;j++)    //ascending order
		{
		   System.out.print(j);
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
		palindrom p =new palindrom();
		p.palindromnum(no);
	}
}