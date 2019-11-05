package week6.binarytree.balancedbinarytree;

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
		boolean res=isBalanced(root,new Height());
		if(res)
			System.out.println("Binary tree is balanced.");
		else
			System.out.println("Binary tree is not balanced.");
	}

	

	private static boolean isBalanced(Node root,Height height) {
		
		if(root==null)
		{
			height.height=0;
			return true;
		}
		
		Height lh=new Height();
		Height rh=new Height();
		
		boolean lb=isBalanced(root.left, lh);
		boolean rb=isBalanced(root.right, rh);
		
		int l=lh.height;
		int r=rh.height;	
		height.height=Math.max(l, r)+1;
		
		if(Math.abs(l-r)>1)
			return false;
	
		return lb&&rb;
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