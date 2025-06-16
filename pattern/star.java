import java.util.*;
class star
{
    public static void printstar(int n)
	{
	   for(int i=1;i<=n;i++)
	   {
	       for(int j=i;j<=n;j++)
		   {
		        System.out.print("*");
			}
			System.out.println();
		}
	}
	public static void main(String args[])
	{
	    int no;
	    Scanner sc=new Scanner(System.in);
		System.out.println("Enter the n=");
		no=sc.nextInt();
		star s=new star();
		s.printstar(no);
	}
}