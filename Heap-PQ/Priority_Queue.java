import java.util.*;
class Priority_Queue
{
	public static void main(String agrs[])
	{
		PriorityQueue <Integer> pq =new PriorityQueue<>(Comparator.reverseOrder());
		
		pq.add(3);
		pq.add(4);
		pq.add(1);
		pq.add(7);
		
		while(!pq.isEmpty())
		{
			System.out.print(pq.peek() +" ");
			pq.remove();
		}
	}
}