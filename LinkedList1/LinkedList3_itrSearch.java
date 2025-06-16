import java.util.*;
class LinkedList3_itrSearch
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
	
	
	//add first
	public void addFirst(int data)
	{
		node newnode=new node(data);
		if(head==null)
		{
			head=tail=newnode;
			return;
		}
		newnode.next=head;
		head=newnode;

	}
	
	//add last
	public void addLast(int data)
	{
		node newnode =new node(data);
		if(head==null)
		{
			head=tail=newnode;
			return;
		}
	
		tail.next=newnode;
		tail=newnode;
	}
	
	//print
	public void print()
	{
		if(head==null)
		{
			System.out.print("Linked list is empty");
			return;
		}
		node temp=head;
		while(temp!=null)
		{
			System.out.print(temp.data+" -> ");
			temp=temp.next;
		}
		System.out.println("null");
	}
	
	public int itrSearch(int key)
	{
		node temp=head;
		int i=0;
		while(temp!=null)
		{
			if(temp.data==key)
			{
				return  i;
			}
			temp=temp.next;
			i++;
		}
		return -1;
	}
	
	
/*	public int helper(node head, int key)
	{
		if(head == null)
		{
			return -1;
		}
		if(head.data == key)
		{
			return 0;
		}
		int idx =helper(head.next, key);
		if(idx == -1)
		{
			return -1;
		}
		return idx+1;
		
	}
	public int recSearch(int key)
	{
		return helper(head, key);	
	}
	
*/	
	
	public static void main(String agrs[])
	{
		LinkedList3_itrSearch ll = new LinkedList3_itrSearch();
		ll.addFirst(2);
		ll.addFirst(1);
		ll.addLast(4);
		ll.addLast(5);
		
		ll.print();
		
		System.out.println(ll.itrSearch(2));
		System.out.println(ll.itrSearch(10));
		
		//System.out.println(ll.recSearch(2));
		//System.out.println(ll.recSearch(10));
    }
}	
		
		
		