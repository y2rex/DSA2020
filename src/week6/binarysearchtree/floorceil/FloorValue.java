package week6.binarysearchtree.floorceil;

public class FloorValue {

	public static void main(String[] args) 
	{
		Node root=new Node(10);
		root.left=new Node(5);
		root.right=new Node(15);
		
		root.right.right=new Node(30);
		root.right.left=new Node(12);
		
		show(root);
		System.out.println();
		System.out.println(getFloor(root,14));

	}


//****descending order**********	
	private static void show(Node root) 
	{
		if(root==null)
			return;
		show(root.right);
			System.out.print(root.data+" ");
		show(root.left);
		
	}

	private static int getFloor(Node root, int k) 
	{
		if(root==null)
			return Integer.MAX_VALUE;
		
		if(root.data==k)
			return k;
		
		if(root.data>k)
			return getFloor(root.left, k);
		
		int t=getFloor(root.right, k);	//root.data<=k
		
		return t<=k?t:root.data;
	}

}
