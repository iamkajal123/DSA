import java.util.*;
class Min_Abs_Diff
{
	public static void main(String agrs[])
	{
		int a[]={1,2,3};
		int b[]={2,1,3};
		
		Arrays.sort(a);
		Arrays.sort(b);
		
		int mindiff=0;
		for(int i=0;i<a.length;i++)
		{
			mindiff += Math.abs(a[i]-b[i]);
		}
		System.out.println("Min absolute difference of pair ="+mindiff);
	}
}