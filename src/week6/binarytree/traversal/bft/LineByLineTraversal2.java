package week6.binarytree.traversal.bft;

import java.util.LinkedList;
import java.util.Queue;

import week6.binarytree.traversal.bft.Node;

public class LineByLineTraversal2 {

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
		
		while(q.isEmpty()==false)
		{			
			int n=q.size();
			while(n>0)
			{
				Node head=q.remove();
					System.out.print(head.data+" ");
	
				if(head.left!=null)
					q.add(head.left);
				
				if(head.right!=null)
					q.add(head.right);
				
				n--;
			}
			System.out.println();
			
			
			/*for(int i=0;i<n;i++)
			 * {
				Node head=q.remove();
				System.out.print(head.data+" ");
				
				if(head.left!=null)
					q.add(head.left);
				
				if(head.right!=null)
					q.add(head.right);
				
			}
			System.out.println();
			*/
			
			
		}
		
		
	}

}
