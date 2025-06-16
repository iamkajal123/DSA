
import java.util.*;
class BinToDec
{
	public static void bintodec(int n)
	{
		int temp=n;
		int pow=0;
		int decNum=0;
		while(n>0)
		{
			int lastdegit=n%10;
			decNum=decNum+(lastdegit* (int)Math.pow(2,pow));
			pow++;
			n=n/10;
		}
		System.out.println("decimal of " +temp+ " = " +decNum);
	}
	public static void main(String args[])
	{
		bintodec(101);
	}
}
	