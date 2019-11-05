package week6.binarytree.traversal.bft;

import java.util.LinkedList;
import java.util.Queue;

import week6.binarytree.traversal.bft.Node;

public class MaxWidth {

	public static void main(String[] args) {
		//*******implementation****************************
		
				Node root=new Node(10);
				root.left=new Node(5);
				root.right=new Node(20);
				
				root.left.left=new Node(3);
				root.left.right=new Node(5);
				
				root.right.left=new Node(15);
				root.right.right=new Node(6);
				
//***********Level Order Traversal or Breadth First Traversal***********
	           levelOrderTraversal(root);
	
	}

	private static void levelOrderTraversal(Node root) {
		
		Queue<Node> q=new LinkedList<Node>();
		q.add(root);
		int max=Integer.MIN_VALUE;
		
		while(q.isEmpty()==false)
		{	
			System.out.println(q.size());
			int n=q.size();
			if(max<n)
				max=n;
	
				Node head=q.remove();
				
				if(head.left!=null)
					q.add(head.left);
				
				if(head.right!=null)
					q.add(head.right);
		}
		System.out.println("Maximum Width : "+max);
	}
}