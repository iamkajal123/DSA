class Convert_Num_To_String
{
	static String digits[]={"zero", "one", "two", "three", "four", "five", "six", "seven", "eigth", "nine"};
	
	public static void printDigits(int number)
	{
		if(number==0)
		{
			return;
		}
		
		int lastDigit = number%10;
		printDigits( number/10 );
		System.out.print( digits[lastDigit]+ " ");
		
	
	}
	public static void main(String agrs[])
	{
		printDigits(1234);
	}
}