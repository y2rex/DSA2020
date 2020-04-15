//****binary tree to doubly LinkedList

package week6.binarytree.practice.binarytree.traversal.bttodoublyll;

import java.util.Queue;
import java.util.LinkedList;

public class MainRunner {

	public static void main(String[] args) 
	{

		Node root=new Node(10);
		root.left=new Node(5);
		root.right=new Node(20);
		
		root.left.left=new Node(3);
		root.left.right=new Node(5);
		
		root.right.left=new Node(15);
		root.right.right=new Node(6);
		
		show(root);
		System.out.println("======================");
		showInOrder(root);
		System.out.println("\n======================");
		convetIntoDLL(root);
		System.out.println("Doubly Linked List :");
		showDLL(head);	
	}
	
	static Node prev;
	static Node head;
	
	private static void convetIntoDLL(Node root) 
	{
		if(root==null)
			return;
		convetIntoDLL(root.left);
		if(head==null)
			head=root;
		else
		{
			prev.right=root;
			root.left=prev;
		}
		prev=root;
		convetIntoDLL(root.right);	
	}

	private static void showInOrder(Node root) 
	{
		if(root==null)
			return ;
		showInOrder(root.left);
		System.out.print(root.data+" ");
		showInOrder(root.right);
		
	}

	private static void showDLL(Node head) 
	{
		Node temp=head;
		while(temp!=null)
		{
			System.out.print(temp.data+" ");
			temp=temp.right;
		}
	}

	private static void show(Node root) 
	{
		Queue<Node> q=new LinkedList<>();
		q.add(root);
		
		while(!q.isEmpty())
		{
			int l=q.size();
			
			for(int i=0;i<l;i++)
			{
				Node head=q.remove();
				System.out.print(head.data+" ");
				
				if(head.left!=null)
					q.add(head.left);
				if(head.right!=null)
					q.add(head.right);
			}
			System.out.println();
		}
		
	}

}