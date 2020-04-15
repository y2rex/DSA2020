//********recursive approach**********

package week6.binarytree.differentviews;

import java.util.LinkedList;
import java.util.Queue;

public class TopVIew2 {

	public static void main(String[] args) 
	{
		Node root = new Node(1); 
		
        root.left = new Node(2); 
        root.right = new Node(3); 
        
        root.left.left = new Node(4); 
        root.left.right = new Node(5); 
        
        root.right.left = new Node(6); 
        root.right.right = new Node(7); 
        
        root.right.left.right = new Node(8); 
        root.right.right.right = new Node(9); 
        
        show(root);        
      //  traversal(root);

	}



	

	private static void show(Node root) 
	{
		Queue<Node> q=new LinkedList<>();
		q.add(root);
		q.add(null);
		
		while(!q.isEmpty())
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
		System.out.println("================================");
	}
}
