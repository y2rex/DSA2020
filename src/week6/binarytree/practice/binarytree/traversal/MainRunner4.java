//print elements at Kth level

package week6.binarytree.practice.binarytree.traversal;

import java.util.Queue;
import java.util.LinkedList;

public class MainRunner4 {

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
		System.out.println("==============");
		print(root,1);
		System.out.println("\n==============");
		print2(root,1);
	}

	
//*********DFS approach**********
	private static void print(Node root, int k) {
		if(root==null)
			return ;
		if(k==0)
			System.out.print(root.data+" ");
		print(root.left, k-1);
		print(root.right, k-1);
		
	}

	
//*********BFS approach**********
	private static void print2(Node root, int k) 
	{
		Queue<Node> q=new LinkedList<>();
		q.add(root);
		q.add(null);
		int t=0;
		while(!q.isEmpty())
		{
			Node head=q.remove();
			if(head!=null)
			{
				if(t==k)
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
				t++;
			}
		}
		
		
	/*	while(!q.isEmpty())
		{
			int l=q.size();
			for(int i=0;i<l;i++)
			{
				Node head=q.remove();
				if(t==k)
					System.out.print(head.data+" ");
				if(head.left!=null)
					q.add(head.left);
				if(head.right!=null)
					q.add(head.right);
			}
			t++;
		}*/
		
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
