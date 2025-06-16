
class LinkedList
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
	//getmid
	public node getmid(node head)
	{
		node slow=head;
		node fast=head.next;
		while(fast!=null && fast.next!=null)
		{
			slow=slow.next;
			fast=fast.next.next;
		}
		return slow;
	}
	
	//merge
	public node merge(node head1,node head2)
	{
		node mergedLL =new node(-1);
		node temp=mergedLL;
		
		while(head1!=null && head2!=null)
		{
			if(head1.data <= head2.data)
			{
				temp.next=head1;
				head1=head1.next;
				temp=temp.next;
			}
			else
			{
				temp.next=head2;
				head2=head2.next;
				temp=temp.next;
			}
		}
		while(head1!=null)
		{
			temp.next=head1;
			head1=head1.next;
			temp=temp.next;
		}
		while(head2!=null)
		{
			temp.next=head2;
			head2=head2.next;
			temp=temp.next;
		}
		return mergedLL.next;
	}
	
	//mergesort
	public node mergesort(node head)
	{
		if(head==null || head.next==null)
		{
			return head;
		}
		//mid
		node mid=getmid(head);
		
		//left/right ms
		node rightHead=mid.next;
		mid.next=null;
		node newleft=mergesort(head);
		node newright=mergesort(rightHead);
		
		//merge
		return merge(newleft,newright);
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
	
	public static void main(String agrs[])
	{
		LinkedList ll=new LinkedList();
		ll.addFirst(1);
		ll.addFirst(2);
		ll.addFirst(3);
		ll.addFirst(4);
		ll.addFirst(5);
		
		
		print();
		ll.head=ll.mergesort(ll.head);
		print();
	}
}