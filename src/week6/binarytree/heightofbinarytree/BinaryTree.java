package week6.binarytree.heightofbinarytree;

import java.util.LinkedList;
import java.util.Queue;

public class BinaryTree {

	public static void main(String[] args) {

		Node root=new Node(10);
		root.left=new Node(5);
		root.right=new Node(20);
		
		root.left.left=new Node(3);
		root.left.right=new Node(5);
		
		root.right.left=new Node(15);
		root.right.right=new Node(6);
		
		show(root);
		System.out.println("==================================");
		int h=height(root);
		System.out.println("Height of given binary tree is : "+h);
		System.out.println("==================================");
		int h1=heightOptimized(root);
		System.out.println("Height of given binary tree is : "+h1);
	}

	private static int heightOptimized(Node root) 
	{
		if(root==null)
			return 0;
		
		return Math.max(heightOptimized(root.left),heightOptimized(root.right))+1;
	}

	private static void show(Node root) {
		
		if(root!=null){
			Queue<Node> q=new LinkedList<>();
			q.add(root);
			q.add(null);
			
			while(q.isEmpty()==false){
				
				Node head=q.remove();
				
				if(head==null)
				{
					if(q.isEmpty()==false)
						q.add(null);
					System.out.println();
				}
				else
				{
					System.out.print(head.data+" ");
					if(head.left!=null)
						q.add(head.left);
					if(head.right!=null)
						q.add(head.right);
				}
			}
		}
	}

	private static int height(Node root) 
	{
			if(root==null)
			return 0;
		
			Queue<Node> q=new LinkedList<>();
			q.add(root);
			int h=0;
			while(q.isEmpty()==false){
				int l=q.size();
				
				for(int i=0;i<l;i++)
				{
				Node head=q.remove();	
				if(head.left!=null)
						q.add(head.left);
					if(head.right!=null)
						q.add(head.right);
				}	
				h++;
			}
		return h;
	}

	
}
