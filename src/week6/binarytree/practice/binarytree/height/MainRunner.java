//line by line traversal

package week6.binarytree.practice.binarytree.height;

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
		
		root.right.right.right=new Node(7);
		
		show(root);
		int h=height(root);
		System.out.println("Height of tree : "+h);

	}

	private static int height(Node root) {
		
		if(root==null)
			return 0;
		return Integer.max(height(root.left), height(root.right))+1;
	}

	private static void show(Node root) 
	{
		Queue<Node> q=new LinkedList<>();
		q.add(root);
		q.add(null);
		
		while(!q.isEmpty())
		{
			Node n=q.remove();
			if(n!=null)
			{
				System.out.print(n.data+" ");
				if(n.left!=null)
					q.add(n.left);
				if(n.right!=null)
					q.add(n.right);
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
