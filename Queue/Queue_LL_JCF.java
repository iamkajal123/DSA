import java.util.*;
class Queue_LL_JCF
{
	public static void main(String agrs[])
	{
		Queue<Integer> q=new LinkedList<>();
		//Queue<Integer> q=new ArrayDeque<>();
		q.add(1);
		q.add(2);
		q.add(3);
		
		while(!q.isEmpty())
		{
			System.out.println(q.peek());
			q.remove();
		}
	}
}