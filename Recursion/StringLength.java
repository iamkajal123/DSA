class StringLength
{
	public static int find_String_Length(String str, int i)
	{
		if(i== str.length())
		{
			return i ;
		}
		 return find_String_Length(str, i+1);
		
	}	
	public static void main(String args[])
	{
		String str="mahadev";
		int i=0;
		System.out.print(find_String_Length(str,i));
	}
}