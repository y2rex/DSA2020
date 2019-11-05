package week6.binarytree.practice.childrensumproperty;

import java.util.LinkedList;
import java.util.Queue;

public class BinaryTree {

	public static void main(String[] args) {

		Node root=new Node(10);
		root.left=new Node(4);
		root.right=new Node(6);
		
		root.left.left=new Node(1);
		root.left.right=new Node(3);
		
		root.right.left=new Node(6);
		root.right.right=new Node(4);		
		
		show(root);
		System.out.println("\n=====================================================");	
		System.out.println(isCheckSum(root));
			
		System.out.println("=====================================================");
		System.out.println(isCheckSum2(root));
	}

	
//********BFS approach**********
	private static boolean isCheckSum2(Node root) 
	{
		Queue<Node> q=new LinkedList<>();
		q.add(root);
		
		while(!q.isEmpty())
		{
			Node head=q.remove();
			int sum=0;
			
			if(head.left!=null)
			{
				q.add(head.left);
				sum+=head.left.data;
			}
			if(head.right!=null)
			{
				q.add(head.right);
				sum+=head.right.data;
			}
			
			if(sum!=head.data && (head.left!=null || head.right!=null))
				return false;
		}
	
		 return true;
	}



	//****DFS approach*****	
	private static boolean isCheckSum(Node root) 
	{
		if(root==null)
			return true;
		if(root.left==null && root.right==null)
			return true;
		int sum=0;
		if(root.left!=null)
			sum+=root.left.data;
		if(root.right!=null)
			sum+=root.right.data;
		
		return sum==root.data && isCheckSum(root.left) && isCheckSum(root.right);
	}



	private static void show(Node root) {

		Queue<Node> q=new LinkedList<>();
		q.add(root);
		q.add(null);
		
		while(q.isEmpty()==false)
		{
			Node head=q.remove();
			if(head!=null)
			{
				System.out.print(head.data+" ");
				
				if(head.left!=null)
					q.add(head.left);
				if(head.right!=null)
					q.add(head.right);
			}
			else
			{
				if(!q.isEmpty())
					q.add(null);
				System.out.println();
			}
		}
		
	}
}