import java.util.*;
class StackLL
{
	public static class node
	{
		int data;
		node next=null;
		public node(int data)
		{
			this.data=data;
			this.next=null;
		}
	}
	static class stack
	{
		static node head=null;
		
		//isEmpty
		public static boolean isEmpty()
		{
			return head==null;
			
		}
		
		//push
		public static void push(int data)
		{
			node newnode=new node(data);
			if(isEmpty())
			{
				head=newnode;
				return;
			}
			newnode.next=head;
			head=newnode;
		}
		
		//pop
		public static int pop()
		{
			if(isEmpty())
			{
				return -1;
			}
			int top=head.data;
			head=head.next;
			return top;
		}
		
		//peek
		public static int peek()
		{
			if(isEmpty())
			{
				return -1;
			}
			return head.data;
		}
		
	}	
		public static void main(String agrs[])
		{
			stack s=new stack();
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