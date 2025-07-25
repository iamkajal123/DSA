import java.util.*;
class BinaryTreesYT
{
	static class Node
	{
		int data;
		Node left;
		Node right;
		
		Node(int data)
		{
			this.data=data;
			this.left=null;
			this.right=null;
		}
	}
	
	static class BinaryTrees
	{
		static int idx=-1;
		public static Node buildTree(int nodes[])
		{
			idx++;
			if(nodes[idx] == -1)
			{
				return null;
			}
			
			Node newnode = new Node(nodes[idx]);
			newnode.left = buildTree(nodes);
			newnode.right = buildTree(nodes);
			
			return newnode;
		}
	}
	
	public static void preorder(Node root)
	{
		if(root==null)
		{
			return;
		}
		System.out.print(root.data+" ");
		preorder(root.left);
		preorder(root.right);
	}
	
	public static void inorder(Node root)
	{
		if(root==null)
		{
			return;
		}
		inorder(root.left);
		System.out.print(root.data+" ");
		inorder(root.right);
	}
	
	public static void postorder(Node root)
	{
		if(root==null)
		{
			return;
		}
		postorder(root.left);
		postorder(root.right);
		System.out.print(root.data+" ");
	}
	
	public static void main(String args[])
	{
		int nodes[] = {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
		BinaryTrees tree = new BinaryTrees();
		Node root = tree.buildTree(nodes);
		//System.out.print(root.data);
		//preorder(root);
		//inorder(root);
		postorder(root);
	}
}
			