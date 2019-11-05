
package week6.binarysearchtree;


import java.util.LinkedList;
import java.util.Queue;

public class IsBST3 {

	
	public static void main(String[] args) {

		Node root=new Node(10);
		root.left=new Node(8);
		root.right=new Node(15);
		
		root.left.left=new Node(3);
		root.left.right=new Node(10);

		root.right.left=new Node(12);
		root.right.right=new Node(20);	
		
		show(root);
		System.out.println("======================================");
		boolean res=isBST(root,Integer.MIN_VALUE,Integer.MAX_VALUE);
		
		if(res)
			System.out.println("Binary tree is BST.");
		else
			System.out.println("Binary tree is not BST.");
	}

	

	private static boolean isBST(Node root, int minValue, int maxValue) {
		
		if(root==null)
			return true;
		
		if(root.data<=minValue || root.data>=maxValue)
			return false;
		
		return isBST(root.left, minValue, root.data)
				&& isBST(root.right, root.data, maxValue);
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