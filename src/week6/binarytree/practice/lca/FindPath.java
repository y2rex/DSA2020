package week6.binarytree.practice.lca;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Stack;

public class FindPath 
{

	public static void main(String[] args) {

		Node root=new Node(10);
		root = new Node(1);
	    root.left = new Node(2);
	    root.right = new Node(3);
	    root.left.left = new Node(4);
	    root.left.right = new Node(5);
	    root.right.left = new Node(6);
	    root.right.right = new Node(7);
	    
		show(root);
		System.out.println("======================================");		
		List<Integer> p=new ArrayList<>();
		boolean res=path(root,6,p);
		
		if(res)
			System.out.println(p);
		
		else
			System.out.println("Element doesn't exit in given tree.");
	}

	private static boolean path(Node root, int x, List<Integer> p) {
		
		if(root==null)
			return false;
		
		p.add(root.data);
		if(root.data==x)
		return true;
		if(root.left!=null &&path(root.left, x,p))
			return true;
		if(root.right!=null && path(root.right, x,p))
			return true;

		p.remove(p.size()-1);
		return false;
	}

	static Stack<Integer> path=new Stack<>();
	
	


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