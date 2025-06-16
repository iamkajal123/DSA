import java.util.*;
class Remove_Cycle
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
		while(fast != null && fast.next != null)
		{
			slow = slow.next;
			fast = fast.next.next;
			
			if(slow == fast)
			{
				return true;
			}
		}
		return false;
	}
	
	public static void removecycle()
	{
		//detect cycle
		node slow = head;
		node fast = head;
		boolean cycle = false;
		while(fast != null && fast.next != null)
		{
			slow=slow.next;
			fast=fast.next.next;
			if(slow==fast)
			{
				cycle=true;
				break;
			}
		}
		if(cycle == false)
		{
			return;
		}
		
		//find meeting point
		slow=head;
		node prev=null;
		while(slow!=fast)
		{
			prev=fast;
			slow=slow.next;
			fast=fast.next;
		}
		
		//remove cycle -> last.next=null
		prev.next=null;
	
	}
	public static void main(String agrs[])
	{
		head = new node(1);
		node temp = new node(2);
		head.next = temp;
		head.next.next = new node(3);
		head.next.next.next = temp;
		
		System.out.println(iscycle());
		removecycle();
		System.out.println(iscycle());
	}
}