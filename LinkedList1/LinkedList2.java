class LinkedList2
{
	public class node
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
	public static int size=0;
	
	//add first
	public void addFirst(int data)
	{
		node newnode =new node(data);
		size++;
		if(head==null)
		{
			head=tail=newnode;
			return;
		}
		newnode.next=head;
		head=newnode;
		
	}
	
	
	//remove first
	public int removefirst()
	{
		if(size==0)
		{
			System.out.println("Linked list is empty");
			return Integer.MIN_VALUE;
		}
		else if(size ==1)
		{
			int val=head.data;
			head=tail=null;
			size=0;
			return val;
		}
		int val=head.data;
		head=head.next;
		size--;
		return val;
	}
	
	//remove last
	public int removelast()
	{
		if(size==0)
		{
			System.out.print("Linked list is empty");
			return Integer.MIN_VALUE;
		}
		else if(size==1)
		{
			int val=head.data;
			head=tail=null;
			size=0;
			return val;
		}
		node prev=head;
		for(int i=0;i<size-2;i++)
		{
			prev=prev.next;
		}
		int val	=prev.next.data;
		prev.next=null;
		tail=prev;
		size--;
		return val;
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
	public static void main(String agrs[])
	{
		LinkedList2 ll= new LinkedList2 ();
		ll.addFirst(2);
		ll.addFirst(1);
		ll.addFirst(3);
		ll.addFirst(4);
		ll.addFirst(5);
		ll.print();
		ll.removefirst();
		ll.print();
		ll.removelast();
		ll.print();
		
	}
}