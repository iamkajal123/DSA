class Concept
{
	static class Node
	{
		int data;
		Node left,right;
		Node(int data)
		{
			this.data= data;
			this.left=this.right =null;
			System.out.println("yes");
		}
	}
	/*public static Node isclear(Node root)
	{
		if(root == null)
		{
			return null;
		}
		isclear(root.left);
		Node right = isclear(root.right);
		
		return root;
	}
*/
	public static void main(String agrs[])
	{
		Node root = new Node(4);
		root.left = new Node(3);
		root.right = new Node(5);
		root.right.right = new Node(7);
		
		//Node r =isclear(root);
	}
}