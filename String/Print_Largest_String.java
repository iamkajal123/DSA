class Print_Largest_String
{
	public static void main(String args[])
	{
		String str1="kajal";
		String str2="Mahadev";
		System.out.println(printLargest(str1,str2));
	}
	
	public static String printLargest(String str1,String str2)
	{
		if(str1.length() > str2.length())
		{
			return str1;
		}
		else
		{
			return str2;
		}
	}
}