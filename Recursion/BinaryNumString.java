class BinaryNumString
{
	public static void print_bin_string( int n, int lastplace, String str)
	{
		if(n==0)
		{
			System.out.println(str);
			return;
		}
		print_bin_string(n-1, 0, str+"0");
		if(lastplace == 0)
		{
			print_bin_string(n-1, 1, str+"1");
		}
	}

	public static void main(String args[])
	{
		print_bin_string(3,0,"");
	}
}