class queue_LL
{
	static class node
	{
		int data;
		node next;
		
		node(int data)
		{
			this.data=data;
			this.next=null;
		}
	}
	static class queue
	{
		static node head=null;
		static node tail=null;
	
		public static boolean isEmpty()
		{
			return head==null && tail==null;
		}
		
		public static void add(int data)
		{
			node newnode=new node(data);
			if(head==null)
			{
				head=tail=newnode;
			}
			tail.next=newnode;
			tail=newnode;
		}
		
		public static int remove()
		{
			if(isEmpty())
			{
				System.out.println("empty queue");
				return -1;
			}
			int front=head.data;
			if(tail==head)
			{
				head=tail=null;
			}
			else
			{
				head=head.next;
			}
			return front;
		}
		
		public static int peek()
		{
			if(isEmpty())
			{
				System.out.println("empty queue");
				return -1;
			}
			return head.data;
		}
	}
	public static void main(String agrs[])
	{
		queue q=new queue();
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