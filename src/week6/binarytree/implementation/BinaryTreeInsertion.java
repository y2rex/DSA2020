/*
 * travel using level order,then try to find left null or right null.
 * When you get null node just add new node to that position
 * */

package week6.binarytree.implementation;

import java.util.LinkedList;
import java.util.Queue;

public class BinaryTreeInsertion {

	public static void main(String[] args) {

		Node root=new Node(10); 
        root.left = new Node(11); 
        root.left.left = new Node(7); 
        root.right = new Node(9); 
        root.right.right = new Node(8);
        
        show(root);
        System.out.println("======================");
        insert(root,12);
        show(root);
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
			else{
				System.out.print(head.data+" ");
				
				if(head.left!=null)
					q.add(head.left);
				if(head.right!=null)
					q.add(head.right);
			}
		}
		
	}

	private static void insert(Node root, int x) 
	{
		Queue<Node> q=new LinkedList<>();
		q.add(root);
		
		while(q.isEmpty()==false)
		{
			Node head=q.remove();
			
			if(head.left!=null)
				q.add(head.left);
			else
				{
				head.left=new Node(x);
				break;
				}
			
			if(head.right!=null)
				q.add(head.right);
			else
				{
				head.right=new Node(x);
				break;
				}
		}	
	}
}