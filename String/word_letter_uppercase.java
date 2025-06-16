//print first letter of each word to uppercase

class word_letter_uppercase
{
	public static String touppercase(String str1)
	{
		StringBuilder sb = new StringBuilder("");
		int ch = Character.toUpperCase(str1.charAt(0));
		sb.append(ch);
		
		for(int i=1; i<=str1.length(); i++)
		{
			if(str1.charAt(i)== ' ' && i<str1.length()-1)
			{
				sb.append(str1.charAt(i));
				i++;
				sb.append(Character.toUpperCase(str1.charAt(i)));
			}
			else
			{
				sb.append(str1.charAt(i));
			}
		}
		return sb.toString();
	}
	
	public static void main(String args[])
	{
		String str="hi, i am kajal";
		System.out.println(touppercase(str));
	}
}