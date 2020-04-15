
package week6.binarytree.practice.lca;

import java.util.LinkedList;
import java.util.Queue;

public class SearchNode 
{  
	private static void show(Node root) 
	{		
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
			else{
				System.out.print(head.data+" ");
				if(head.left!=null)
					q.add(head.left);
				
				if(head.right!=null)
					q.add(head.right);	
			}	
		}		
	}  
	
	public static void main(String[] args) {
				
	        Node root = new Node(1);
	        root.left = new Node(2);
	        root.right = new Node(3);
	        root.left.left = new Node(4);
	        root.left.right = new Node(5);
	        root.right.left = new Node(6);
	        root.right.right = new Node(7);
	        
	        show(root);
	        System.out.println("=======================");
	        System.out.println(search(root,7).data);

	}

	private static Node search(Node root, int n) 
	{
		if(root==null)
			return null;
		
		if(search(root.left, n)!=null && search(root.left, n).data==n)
				return root.left ;
		
		if(root.data==n)
			return root;
		
		return search(root.right, n);
	}

	
}