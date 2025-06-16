class DoublelyLL_reverse
{
	public class node
	{
		int data;
		node next;
		node prev;
		
		public node(int data)
		{
			this.data=data;
			this.next=null;
			this.prev=null;
		}
	}
	
	public static node head;
	public static node tail;


	//addFirst
	public void addFirst(int data)
	{
		node newNode=new node(data);
		if(head==null)
		{
			head=tail=newNode;
			return;
		}
		newNode.next=head;;
		head.prev=newNode;
		head=newNode;
	}
	
	//print
	public static int print()
	{
		if(head == null)
		{	
			System.out.println("null linked list");
			return -1;
		}
		node temp=head;
		while(temp!=null)
		{
			System.out.print(temp.data+"<->");
			temp=temp.next;
		}
		System.out.println("null");
		return 0;
	}
	
	public void reverseLL()
	{
		node curr=head;
		node prev=null;
		node next;
		while(curr !=null)
		{
			next=curr.next;
			curr.next=prev;
			curr.prev=next;
			prev=curr;
			curr=next;
		}
		head=prev;
	}
	
	public static void main(String agrs[])
	{
		DoublelyLL_reverse dll=new DoublelyLL_reverse();
		dll.addFirst(3);
		dll.addFirst(2);
		dll.addFirst(1);
		
		System.out.println(print());
		dll.reverseLL();
		System.out.println(print());
	}
}