import java.util.*;
class DecToBin
{
	public static void calculateBin(int n)
	{
		int temp=n;
		int pow=0;
		int binNum=0;
		while(n>0)
		{
			int rem=n%2;
			binNum=binNum+(rem*(int)Math.pow(10,pow));
			pow++;
			n=n/2;
		}
		System.out.println("decimal number is " +temp+ " has binary number = "+binNum);
	}
	public static void main(String args[])
	{
		calculateBin(5);
	}
}