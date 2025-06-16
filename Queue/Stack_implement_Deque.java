import java.util.*;
class Stack_implement_Deque
{
	static class stack
	{
		Deque<Integer> d=new LinkedList<>();
		
		public void push1(int data)
		{
			d.addLast(data);
		}
		
		public int pop1()
		{
			return d.removeLast();
		}
		
		public int peek1()
		{
			return d.getLast();
		}
	
	}
	public static void main(String agrs[])
	{
		stack s=new stack();
		s.push1(1);
		s.push1(2);
		s.push1(3);
		
		System.out.println("peek ="+s.peek1());
		System.out.println(s.pop1());
		System.out.println(s.pop1());
		System.out.println(s.pop1());
	}
}