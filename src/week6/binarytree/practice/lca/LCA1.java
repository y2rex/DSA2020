package week6.binarytree.practice.lca;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class LCA1 {

	public static void main(String[] args) {
		

		  Node root = new Node(1);
	      root.left = new Node(2);
	      root.right = new Node(3);
	      root.left.left = new Node(4);
	      root.left.right = new Node(5);
	      root.right.left = new Node(6);
	      root.right.right = new Node(7);

	      show(root);
	      System.out.println("====================");
	      List<Integer> p=new ArrayList<>();
	      findPath(root,4,p);
	      System.out.println(p);

	}

	private static boolean findPath(Node root, int x, List<Integer> p) 
	{
		if(root==null)
			return false;
		p.add(root.data);
		if(root.data==x)
			return true;
		if(root.left!=null && findPath(root.left, x, p))
			return true;
		if(root.right!=null && findPath(root.right, x, p))
			return true;
		p.remove(p.size()-1);
		return false;
		
	}

	private static void show(Node root) {
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
		
	}

}
