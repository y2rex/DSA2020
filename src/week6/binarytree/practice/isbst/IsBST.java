//not completed
package week6.binarytree.practice.isbst;

import java.util.LinkedList;
import java.util.Queue;

public class IsBST {

	static Node prev=null;
	static boolean res=true;
	public static void main(String[] args) {

		Node root=new Node(10);
		root.left=new Node(8);
		root.right=new Node(15);
		
		root.left.left=new Node(3);
		root.left.right=new Node(9);
		
		root.right.left=new Node(11);
		root.right.right=new Node(20);	
		
		show(root);
		System.out.println("======================================");
		isBST(root);
		System.out.println(res);
	}

	private static void isBST(Node root) 
	{
		if(root==null)
			return;
		isBST(root.left);
		if(prev!=null && prev.data>=root.data)
				res=false;
		prev=root;
		isBST(root.right);
		
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