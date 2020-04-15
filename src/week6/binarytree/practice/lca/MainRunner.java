//It needs tree traversal and n extra space.complexity O(n)+n extra space

package week6.binarytree.practice.lca;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class MainRunner 
{
	private static void show(Node root) 
	{
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
	
	public static void main(String[] args) 
	{
		  Node root = new Node(1);
	      root.left = new Node(2);
	      root.right = new Node(3);
	      root.left.left = new Node(4);
	      root.left.right = new Node(5);
	      root.right.left = new Node(6);
	      root.right.right = new Node(7);

	      show(root);
	      System.out.println("==============================");
	      System.out.println("LCA(4,6): " +findLCA(root,3, 17));

	}

	private static int findLCA(Node root, int n1, int n2) 
	{
		 List<Integer> path1 = new ArrayList<>();
		 List<Integer> path2 = new ArrayList<>();
		 
		boolean res1=findPath(root,n1,path1);
		boolean res2=findPath(root,n2,path2);
		
		if(res1 && res2)
		{
			int i=0;
			for(i=0;i<path1.size() && i<path2.size();i++)
				if(!path1.get(i).equals(path2.get(i)))
					break;
			return path1.get(i-1);
		}
		else
		{
			if(!res1)
				System.out.println(n1+" is missing");
			if(!res2)
				System.out.println(n2+" is missing");
		}
		
		return -1;
	}

	private static boolean findPath(Node root, int x,List<Integer> path) 
	{
		if(root==null)
			return false;
		
		path.add(root.data);
		if(root.data==x)
			return true;
		
		if(root.left!=null && findPath(root.left, x,path))
			return true;
		if(root.right!=null && findPath(root.right, x,path))
			return true;
		
		path.remove(path.size()-1);
		return false;
	}
	 
}
