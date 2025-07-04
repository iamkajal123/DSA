import java.util.*;
class Cycle
{
	public static class node
	{
		int data;
		node next;
		
		public node(int data)
		{
			this.data=data;
			this.next=null;
		}
	}
	
	public static node head;
	public static node tail;
	
	public static boolean iscycle()
	{
		node slow = head;
		node fast = head;
		while(fast != null  &&  fast.next != null)
		{
			slow=slow.next;
			fast=fast.next.next;
			
			if(slow==fast)
			{
				return true;
			}
		}
		return false;
	}
	
	public static void main(String args[])
	{
		head =new node(1);
		head.next=new node(2);
		head.next.next=new node(3);
		head.next.next.next= head;
		System.out.println(iscycle());
	}
}