
class DoubleLL
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
	
	public static int size=0;
	public static node head;
	public static node tail;
	
	
	//addFirst
	public void addFirst(int data)
	{
		node newNode=new node(data);
		size++;
		if(head ==null)
		{
			head=tail=newNode;
			return;
		}
		newNode.next=head;
		head.prev=newNode;
		head=newNode;
	}
	
	//remove
	public int removeFirst()
	{
		if(head == null)
		{
			System.out.println("Empty linked list");
			return Integer.MIN_VALUE ;
		}
		if(size==1)
		{
			int val=head.data;
			head=tail=null;
			size--;
			return val;
		}
		int val=head.data;
		head=head.next;
		head.prev=null;
		size--;
		return val;
	}
	
	
	//print
	public  void print(node head)
	{
		node temp=head;
		if(head == null)
		{
			System.out.println("Empty linked list");
			return ;
		}
		while(temp!=null)
		{
			System.out.print(temp.data+"<->");
			temp=temp.next;
		}
		System.out.println("null");
	}
	
	
	public static void main(String agrs[])
	{
		DoubleLL dll =new DoubleLL();
		dll.addFirst(3);
		dll.addFirst(2);
		dll.addFirst(1);
		
		dll.print(head);
		System.out.println(size);
		
		dll.removeFirst();
		dll.print(head);
		System.out.println(size);
	}
}