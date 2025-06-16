import java.util.LinkedList;
class ZigZag
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
	
	
	public static void zigzag()
	{
		//find mid
		node slow=head;
		node fast=head;
		
		while(fast!=null && fast.next!=null)
		{
			slow=slow.next;
			fast=fast.next.next;
		}
		node mid=slow;
		
		//reverse 2nd half
		node curr=mid.next;
		mid.next=null;
		node prev=null;
		node next;
		
		while(curr!=null)
		{
			next=curr.next;
			curr.next=prev;
			prev=curr;
			curr=next;
		}
		node left=head;
		node right=prev;
		
		//alternate merge (zigzag)
		node nextL,nextR;
		while(left!=null && right!=null)
		{
			nextL=left.next;
			left.next=right;
			nextR=right.next;
			right.next=nextL;
			
			left=nextL;
			right=nextR;
		}
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
	
	public static void main(String args[])
	{
		LinkedList <Integer> ll=new LinkedList<>();
		ll.addLast(1);
		ll.addLast(2);
		ll.addLast(3);
		ll.addLast(4);
		ll.addLast(5);
		
		System.out.println(ll);
		zigzag();
		System.out.println(ll);
	}
}


