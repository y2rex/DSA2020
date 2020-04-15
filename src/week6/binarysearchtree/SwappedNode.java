package week6.binarysearchtree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class SwappedNode 
{
	public static void main(String[] args) 
	{
		Node root = new Node(6); 
        root.left = new Node(10); 
        root.right = new Node(2); 
        root.left.left = new Node(1); 
        root.left.right = new Node(3); 
        root.right.right = new Node(12); 
        root.right.left = new Node(7); 	
		
		show(root);
		System.out.println("================");
		show2(root);
		System.out.println("\n================");
		ArrayList<Node> al=new ArrayList<>();
		swappedNodes(root,al);
		for(Node n : al)
			System.out.print(n.data+" ");
		System.out.println("\n================");
		correctBST(root,al.get(0).data,al.get(1).data);
		show2(root);
		//System.out.println(al.size());
		

	}
	
	
	private static void correctBST(Node root, int n1, int n2) 
	{
		if(root==null)
			return;
		correctBST(root.left, n1, n2);
		
		if(root.data==n1)
			root.data=n2;
		else if(root.data==n2)
			root.data=n1;
		correctBST(root.right, n1, n2);
	}
	
	
	
	/*
	 static Node p;
	  
	 private static void correctBST(Node root, ArrayList<Node> al) 
	{

		if(root==null)
			return;
		
		correctBST(root.left, al);
		
			if(p!=null && p.data>root.data) 
			{
				if(al.size()==2)
					p.data=al.remove(al.size()-1).data;
				else if(al.size()==1)
					root.data=al.remove(al.size()-1).data;
			}

		p=root;
		correctBST(root.right, al);
	}
*/

	static Node prev;
	private static void swappedNodes(Node root, ArrayList<Node> al) 
	{
		if(root==null)
			return;
		
		swappedNodes(root.left, al);
		
			if(prev!=null && prev.data>root.data)
				if(al.size()==0)
				    al.add(prev);
				else
					al.add(root);

		prev=root;
		swappedNodes(root.right, al);
	}

	private static void show(Node root) 
	{
		Queue<Node> q=new LinkedList<Node>();
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
		
	}

	private static void show2(Node root) 
	{
		if(root==null)
			return;
		show2(root.left);
		System.out.print(root.data+" ");
		show2(root.right);
		
	}
}
