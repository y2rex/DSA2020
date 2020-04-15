//spiral traversal

package week6.binarytree.practice.binarytree.traversal;

import java.util.Queue;
import java.util.Stack;
import java.util.LinkedList;

public class MainRunner3 {

	public static void main(String[] args) 
	{

		Node root=new Node(10);
		root.left=new Node(5);
		root.right=new Node(20);
		
		root.left.left=new Node(3);
		root.left.right=new Node(5);
		
		root.right.left=new Node(15);
		root.right.right=new Node(6);
		
		traversal(root);
		System.out.println("\n======================");
		show(root);
		System.out.println("==========================");
		show2(root);

	}
	
	private static void show2(Node root) 
	{
		Queue<Node> q=new LinkedList<>();
		q.add(root);
		while(!q.isEmpty())
		{
			int l=q.size();
			for(int i=0;i<l;i++)
			{
				Node head=q.remove();
				//System.out.print(head.data+" ");
				if(head.left!=null)
					q.add(head.left);
				if(head.right!=null)
					q.add(head.right);
			}
			System.out.println(q.size());
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

	private static void traversal(Node root) 
	{
		Queue<Node> q=new LinkedList<>();
		Stack<Node> s=new Stack<>();
		q.add(root);
		
		boolean flag=false;
		while(!q.isEmpty())
		{
			int l=q.size();
			
			for(int i=0;i<l;i++)
			{
				Node n=q.remove();
				if(!flag)
					System.out.print(n.data+" ");
				if(flag)
					s.push(n);
				if(n.left!=null)
					q.add(n.left);
				if(n.right!=null)
					q.add(n.right);
			}
			if(flag)
				while(!s.isEmpty())
					System.out.print(s.pop().data+" ");
			flag=!flag;
		}
	}
}
