import java.util.*;
class BinaryTrees_pro
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
	
	//*************Level of Order **************
	public static void levelOrder(Node root)
	{
		if(root==null)
		{
			return;
		}
		Queue <Node> q=new LinkedList<>();
		q.add(root);
		q.add(null);
		
		while(!q.isEmpty())
		{
			Node currnode = q.remove();
			if(currnode == null)
			{
				System.out.println();
				if(q.isEmpty())
				{
					break;
				}
				else
				{
					q.add(null);
				}
			}
			else
			{
				System.out.print(currnode.data+" ");
				if(currnode.left !=null)
				{
					q.add(currnode.left);
				}
				if(currnode.right != null)
				{
					q.add(currnode.right);
				}
			}
		}
	}
	
	//***********Count of Node ****************
	public static int countOfNode(Node root)
	{
		if(root==null)
		{
			return 0;
		}
		int leftNodes = countOfNode(root.left);
		int rightNodes = countOfNode(root.right);
		
		return leftNodes+rightNodes+1;
	}
		
		
	//****************Sum of Node***************
	public static int sumofNode(Node root)
	{
		if(root==null)
		{
			return 0;
		}
		int leftsum = sumofNode(root.left);
		int rightsum = sumofNode(root.right);
		
		return leftsum+rightsum+root.data;
	}
	
	
	//****************Height******************
	public static int height(Node root)
	{
		if(root==null)
		{
			return 0;
		}
		int leftht =height(root.left);
		int rightht = height(root.right);
		int myheight = Math.max(leftht,rightht)+1;
	
		return myheight;
	}
	
	//****************Diameter*******************
	public static int diameter(Node root)
	{
		if(root==null)
		{
			return 0;
		}
		int leftDiam = diameter(root.left);
		int leftHt = height(root.left);
		int rightDiam = diameter(root.right);
		int rightHt = height(root.right);
		
		int selfDiam = leftHt+rightHt+1;
		return Math.max(selfDiam, Math.max(leftDiam, rightDiam));
	}
		
	
	public static void main(String args[])
	{
		int nodes[] = {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
		BinaryTrees tree = new BinaryTrees();
		Node root = tree.buildTree(nodes);
		//levelOrder(root);
		//System.out.print(countOfNode(root));
		//System.out.print(sumofNode(root));
		System.out.println(height(root));
		System.out.print(diameter(root));
	}
}
			