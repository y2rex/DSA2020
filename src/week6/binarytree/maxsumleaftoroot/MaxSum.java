package week6.binarytree.maxsumleaftoroot;

import java.util.LinkedList;
import java.util.Queue;

public class MaxSum 
{

	public static void main(String[] args) {

		Node root=new Node(10);
		root = new Node(1);
	    root.left = new Node(2);
	    root.right = new Node(3);
	    root.left.left = new Node(4);
	    root.left.right = new Node(5);
	    root.right.left = new Node(6);
	    root.right.right = new Node(7);
	    
		show(root);
		System.out.println("======================================");		
		System.out.println(maxSum(root));
	}

	
	static Node leaf;
	private static int maxSum(Node root) 
	{
		if(root==null)
			return 0;
		Maximum max=new Maximum();
		max.maxSum=Integer.MIN_VALUE;
		getLeaf(root,max,0);
		
		printLeaf(root,leaf);
		System.out.println();
		
		return max.maxSum;
	}


	private static boolean printLeaf(Node root,Node leaf) {
		
		if(root==null)
			return false;
		
		if(root==leaf|| printLeaf(root.left, leaf)||printLeaf(root.right, leaf))
		{
			System.out.print(root.data+" ");
			return true;
			
		}
		return false;
	}


	private static void getLeaf(Node root, Maximum maximum, int currSum) {
		
		if(root==null)
			return;
		
		currSum=currSum+root.data;
		
		if(root.left==null && root.right==null)
		{
			if(currSum>maximum.maxSum)
			{
				maximum.maxSum=currSum;
				leaf=root;
			}				
		}
		getLeaf(root.left, maximum, currSum);
		getLeaf(root.right, maximum, currSum);
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