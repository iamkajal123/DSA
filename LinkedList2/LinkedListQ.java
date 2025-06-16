class LinkedListQ               //      i\p= 8->12->10->5->4->1->6->NULL       o\p=  8->12->10->4->6->5->1->NULL
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
	
	public node isOddEven()
	{
		node temp=head;
		node OddEven=new node(-1);
		if(temp.data%2==0)
		{
			OddEven.next=temp;
			temp=temp.next;
			OddEven=OddEven.next;
		}
		if(temp.data%3==0)
		{
			OddEven=temp.next;
			OddEven=OddEven.next;
			temp=temp.next;
		}
		return OddEven.next;
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
	
	public static void main(String agrs[])
	{
		LinkedListQ ll=new LinkedListQ();
		ll.addLast(8);
		ll.addLast(12);
		ll.addLast(10);
		ll.addLast(5);
		ll.addLast(4);
		ll.addLast(1);
		ll.addLast(6);
		
		print();
		
		ll.isOddEven();
		
		print();
	}
}
		
		