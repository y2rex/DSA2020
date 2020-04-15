//*************not completed****************************8

package week6.binarytree.traversal.bft.spiraltraversal;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

import week6.binarytree.traversal.bft.Node;

public class SpiralTraversal {

	public static void main(String[] args) {
		//*******implementation****************************
		
				Node root=new Node(10);
				root.left=new Node(5);
				root.right=new Node(12);
				
				root.left.left=new Node(4);
				root.left.right=new Node(6);
				
				root.right.left=new Node(11);
				root.right.right=new Node(13);
				
//***********Level Order Traversal or Breadth First Traversal***********
	           levelOrderTraversal(root);
	           System.out.println("================================");
	           
	           spiralTraversal(root);
	
	}

	private static void spiralTraversal(Node root) {
		Queue<Node> q=new LinkedList<>();
		q.add(root);
		Stack<Node> st=new Stack<>();
		boolean flag=false;
		
		while(!q.isEmpty())
		{
			int l=q.size();
			for(int i=0;i<l;i++)
			{
				Node head=q.remove();
				if(flag==false)
					System.out.print(head.data+" ");
				else
					st.push(head);
				
				if(head.left!=null)
					q.add(head.left);
				if(head.right!=null)
					q.add(head.right);
			}
			if(flag)
			{
				while(!st.isEmpty())
					System.out.print(st.pop().data+" ");
			}
			flag=!flag;
		}
		
		
		
	}

	private static void levelOrderTraversal(Node root) {
		
		Queue<Node> q=new LinkedList<Node>();
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