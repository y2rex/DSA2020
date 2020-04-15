
package week6.binarytree.practice.isbst;

import java.util.LinkedList;
import java.util.Queue;

public class IsBST3 {

	static Node prev=null;
	public static void main(String[] args) 
	{

		Node root=new Node(10);
		root.left=new Node(8);
		root.right=new Node(15);
		
		root.left.left=new Node(3);
		root.left.right=new Node(9);
		
		root.right.left=new Node(11);
		root.right.right=new Node(20);	
		
		show(root);
		System.out.println("======================================");
		System.out.println(isBST(root,Integer.MAX_VALUE,Integer.MIN_VALUE));
		
	}


	private static boolean isBST(Node root, int maxValue, int minValue) 
	{
		if(root==null)
			return true;
		
		if(root.data<=minValue ||root.data>=maxValue)
			return false;
		
		return isBST(root.left, root.data, minValue) && isBST(root.right, maxValue, root.data);
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