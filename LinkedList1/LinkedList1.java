class LinkedList1
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
	
	//add middle
	public void addMiddle(int idx, int data)
	{
		if(idx==0)
		{
			addFirst(data);
			return;
		}
		
		node newnode=new node(data);
		int i=0;
		node temp=head;
		while(i < idx-1)
		{
			temp=temp.next;
			i++;
		}
		newnode.next=temp.next;
		temp.next=newnode;
	
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
		LinkedList1 ll=new LinkedList1();
		ll.addFirst(1);
		ll.addFirst(2);
		ll.print();
		ll.addLast(3);
		ll.addLast(4);
		ll.print();
		ll.addMiddle(2,11);
		ll.print();
		
	}
}