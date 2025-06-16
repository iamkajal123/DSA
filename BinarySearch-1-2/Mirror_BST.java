import java.util.*;
class Mirror_BST
{
	static class Node
	{
		int data;
		Node left,right;
	
		Node(int data)
		{
			this.data = data;
		}
	}
	
	public static Node insert(Node root , int val)
	{
		if(root == null)
		{
			root = new Node(val);
			return root;
		}
		if(root.data > val)
		{
			root.left = insert(root.left,val);
		}
		else
		{
			root.right = insert(root.right,val);
		}
		return root;
	}
	
	public static void inorder(Node root)
	{
		if(root==null)
		{
			return;
		}
		inorder(root.left);
		System.out.print(root.data+ " ");
		inorder(root.right);
	}
	
	public static Node mirror(Node root)
	{
		if(root == null)
		{
			return root;
		}
		Node leftMirror = mirror(root.left);
		Node rightMirror = mirror(root.right);
		
		root.left = rightMirror;
		root.right = leftMirror;
		return root;
	}
	
	public static void preorder(Node root)
	{
		if(root==null)
		{
			return;
		}
		System.out.print(root.data+ " ");
		preorder(root.left);
		preorder(root.right);
	}
	
	public static void main(String agrs[])
	{
		int values[]= {8,5,3,1,4,6,10,11,14};
		Node root = null;
		
		for(int i=0;i<values.length;i++)
		{
			root = insert(root,values[i]);
		}
		inorder(root);
		System.out.println();
		
		root=mirror(root);
		preorder(root);
	}
}
		