import java.util.*;
class StackJCF
{
	public static void main(String agrs[])
	{
		Stack <Integer> s=new Stack<>();
		s.push(1);
		s.push(2);
		s.push(3);
		
		while(!s.isEmpty())
		{
			System.out.println(s.peek());
			s.pop();
		}
	}
}
		