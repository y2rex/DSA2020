package week6.binarytree.kthlevelelements;

import java.util.LinkedList;
import java.util.Queue;

public class BinaryTree {

	public static void main(String[] args) {

		Node root=new Node(10);
		root.left=new Node(4);
		root.right=new Node(6);
		
		root.left.left=new Node(1);
		root.left.right=new Node(3);
		
		root.right.left=new Node(2);
		root.right.right=new Node(4);
		show(root);
		System.out.println("============================");
		showKth(2,root);
		System.out.println("\n============================");
		showKth2(2,root);
	}

	//*********************O(n)********************	
private static void showKth2(int k, Node root) {
		
		Queue<Node> q=new LinkedList<>();
		q.add(root);
		q.add(null);
		
		int temp=1;
		
		while(q.isEmpty()==false)
		{
			Node head=q.remove();
			
			if(head==null)
			{
				if(q.isEmpty()==false)
				q.add(null);
				temp++;
			}
			else
			{
				if(temp==k)
					System.out.print(head.data+" ");
				
				if(head.left!=null)
					q.add(head.left);
				if(head.right!=null)
					q.add(head.right);
			}
		}
	
		
	}

	//*********************O(n2)********************	
	private static void showKth(int k, Node root) {
		Queue<Node> q=new LinkedList<>();
		q.add(root);
		int temp=1;
		while(q.isEmpty()==false)
		{
			int l=q.size();
			for(int i=0;i<l;i++)
			{
				Node head=q.remove();
				if(temp==k)
					System.out.print(head.data+" ");
				if(head.left!=null)
					q.add(head.left);
				if(head.right!=null)
					q.add(head.right);
			}
			temp++;
		}
		
	}

	private static void show(Node root) {

		Queue<Node> q=new LinkedList<>();
		q.add(root);
		q.add(null);
		
		while(q.isEmpty()==false)
		{
			Node head=q.remove();
			if(head==null){
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