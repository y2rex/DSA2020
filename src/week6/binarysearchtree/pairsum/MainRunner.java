package week6.binarysearchtree.pairsum;

import java.util.HashSet;

public class MainRunner {

	public static void main(String[] args) {

		   Node root = new Node(20);
	       root.left = new Node(8);
	       root.right = new Node(22);
	       
	       root.left.left = new Node(4);
	       root.left.right = new Node(12);
	       
	       root.left.right.left = new Node(10);
	       root.left.right.right = new Node(14);
	       
	       show(root);
	       System.out.println("\n"+getPairSum(root,14));
	}

	private static boolean getPairSum(Node root, int sum) 
	{
		for(int a :h)
			if(h.contains(sum-a))
				return true;
		return false;
	}

	static HashSet<Integer> h=new HashSet<>();

	private static void show(Node root) 
	{
		if(root==null)
			return;
		show(root.left);
		System.out.print(root.data+" ");
		h.add(root.data);
		show(root.right);
	}

	

}
