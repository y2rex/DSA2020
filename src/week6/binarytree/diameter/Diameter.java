package week6.binarytree.diameter;

import java.util.LinkedList;
import java.util.Queue;


public class Diameter 
{

	public static void main(String[] args) {

		Node root = new Node(1);
	    root.left = new Node(2);
	    root.right = new Node(3);
	    root.left.left = new Node(4);
	    root.left.right = new Node(5);
	    root.right.left = new Node(6);
	    root.right.right = new Node(7);
	    
		show(root);
		System.out.println("======================================");		
		System.out.println(diameter(root));
	}

	
	private static int diameter(Node root) 
	{
		if(root==null)
			return 0;
		
		return Math.max(Math.max(diameter(root.left), diameter(root.right)), 
						height(root.left)+height(root.right)+1);
	}


	private static int height(Node root) {
		if(root==null)
			return 0;
		int l=height(root.left);
		int r=height(root.right);
		return Math.max(l, r)+1;
	}


	private static void show(Node root) {

		Queue<Node> q=new LinkedList<>();
		q.add(root);
		q.add(null);
		
		while(q.isEmpty()==false)
		{
			Node head=q.remove();
			if(head==null)
			{
				if(q.isEmpty()==false)
					q.add(null);
				System.out.println();
			}
			else
			{
				System.out.print(head.data+" ");
				if(head.left!=null)
					q.add(head.left);
				if(head.right!=null)
					q.add(head.right);
			}
		}
		
	}
}