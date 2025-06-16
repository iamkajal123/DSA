class Find_Subset
{
	public static void findsubset(String str,String ans,int i)
	{
		if(i == str.length())
		{
			if(ans.length() == 0)
			{
				System.out.println("null");
			}
			else
			{
				System.out.println(ans);
			}
			return;
		}
		
		//yes
		findsubset(str,ans+str.charAt(i),i+1);
		
		//no
		findsubset(str,ans,i+1);
	}
	public static void main(String agrs[])
	{
		String str="abc";
		findsubset(str," ",0);
	}
}