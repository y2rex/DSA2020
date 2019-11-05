package week6.binarysearchtree.floorceil;

public class CeilValue {

	public static void main(String[] args) 
	{
		Node root=new Node(10);
		root.left=new Node(5);
		root.right=new Node(15);
		
		root.right.right=new Node(30);
		root.right.left=new Node(12);
		
		System.out.println(getCeil(root,11));

	}

	private static int getCeil(Node root, int k) 
	{
		if(root==null)
			return Integer.MIN_VALUE;
		
		if(root.data==k)
			return k;
		
		if(root.data<k)
			return getCeil(root.right, k);
		
		int t=getCeil(root.left, k);  //root.data>=k
		
		return t>=k?t:root.data;
	}

}
