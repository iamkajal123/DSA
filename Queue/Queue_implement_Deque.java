import java.util.*;
class Queue_implement_Deque
{
	static class queue
	{
		Deque<Integer> d=new LinkedList<>();
		
		public  void add1(int data)
		{
			d.addLast(data);
		}
		
		public  int remove1()
		{
			return d.removeFirst();
		}
	
		public  int peek1()
		{
			return d.getFirst();
		}
	
	
	}
	public static void main(String agrs[])
	{
		queue q=new queue();
		q.add1(1);
		q.add1(2);
		q.add1(3);
		
		System.out.println("Peek ="+q.peek1());
		System.out.println(q.remove1());
		System.out.println(q.remove1());
		System.out.println(q.remove1());
	}
}
		