package week6.binarytree.traversal.bft;

import java.util.LinkedList;
import java.util.Queue;

import week6.binarytree.traversal.bft.Node;

public class MirrorTree {

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
	           System.out.println("===============================");
	           mirrorTree(root);
	
	}

	private static void mirrorTree(Node root) {
		Queue<Node> q=new LinkedList<Node>();
		q.add(root);
		q.add(null);
		
		while(q.isEmpty()==false)
		{
			Node head=q.remove();
			if(head!=null)
			{
				System.out.print(head.data+" ");
				
				if(head.right!=null)
					q.add(head.right);
				if(head.left!=null)
					q.add(head.left);
			}
			else
			{
				if(!q.isEmpty())
					q.add(null);
				System.out.println();
			}
			
		}	
		
	}

	private static void levelOrderTraversal(Node root) {
		
		Queue<Node> q=new LinkedList<Node>();
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
