package week6.binarytree.traversal.digonaltraversal;

import java.util.LinkedList;
import java.util.Queue;

public class MainRunner {

	public static void main(String[] args) 
	{
		    Node root = new Node(8); 
	        root.left = new Node(3); 
	        root.right = new Node(10); 
	        root.left.left = new Node(1); 
	        root.left.right = new Node(6); 
	        root.right.right = new Node(14); 
	        root.right.right.left = new Node(13); 
	        root.left.right.left = new Node(4); 
	        root.left.right.right = new Node(7); 
	        
	        trav(root);

	}

	private static void trav(Node root) 
	{
	Queue<Node> q=new LinkedList<>();
	q.add(root);
	while(!q.isEmpty())
	{
		Node h=q.remove();
		if(h==null)
    		q.add(null);
		else
		{
			while(h!=null)
			{
				 System.out.print(h.data+" ");
						
				 if(h.left!=null)
				    q.add(h.left);	
				 h=h.right;
			}
		}
	  }	
	}
}