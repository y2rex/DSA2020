//max sum root to leaf

package week6.binarytree.practice.binarytree.traversal;

import java.util.Queue;
import java.util.LinkedList;

public class MainRunner5 {

	public static void main(String[] args) 
	{

		Node root=new Node(10);
		root.left=new Node(5);
		root.right=new Node(20);
		
		root.left.left=new Node(3);
		root.left.right=new Node(35);
		
		root.right.left=new Node(15);
		root.right.right=new Node(6);
		
		show(root);
		System.out.println("==============");
		findMax(root,0);
		System.out.println(temp);
	}

	static int temp=Integer.MIN_VALUE;
	private static void findMax(Node root, int sum) 
	{
		if(root==null)
			return;
		
		sum+=root.data;
		if(root.left==null && root.right==null && temp<sum)
			temp=sum;
	
		findMax(root.left,sum);
		findMax(root.right,sum);
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
