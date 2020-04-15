package week6.binarytree.practice.binarytree.height.balancedtree;

import java.util.LinkedList;
import java.util.Queue;

public class BinaryTree {

	public static void main(String[] args) {

		Node root=new Node(10);
		root.left=new Node(4);
		root.right=new Node(6);
		
		root.left.left=new Node(1);
		root.left.left.left=new Node(1);
		//root.left.right=new Node(3);
		
		//root.right.left=new Node(2);
		//root.right.right=new Node(4);		
		show(root);
		System.out.println("======================================");
		System.out.println(isBalanced(root,new Height()));
	}

	

	private static char[] isBalanced(Node root, Height height) {
		// TODO Auto-generated method stub
		return null;
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