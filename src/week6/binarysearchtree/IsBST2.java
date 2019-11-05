//***************O(n)+n extra space**************
//inorder traversal and store the node data into an array
//then checking it is sorted or not

package week6.binarysearchtree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class IsBST2 {

	
	public static void main(String[] args) {

		Node root=new Node(10);
		root.left=new Node(8);
		root.right=new Node(15);
		
		root.left.left=new Node(3);
		root.left.right=new Node(10);
		
		root.right.left=new Node(12);
		root.right.right=new Node(20);	
		
		show(root);
		System.out.println("======================================");
		convertToArray(root);
		boolean res=isSorted(al);
		if(res)
			System.out.println("Binary tree is BST.");
		else
			System.out.println("Binary tree is not BST.");
	}

	private static boolean isSorted(ArrayList<Integer> al) {
		int temp=Integer.MIN_VALUE;
	
		for(int a : al)
		{
			if(a<=temp)
				return false;
			temp=a;
		}
		return true;
	}

	static ArrayList<Integer> al=new ArrayList<>();

	private static void  convertToArray(Node root) {
		
		if(root==null)
		return;	
		
		convertToArray(root.left);
		al.add(root.data);
		convertToArray(root.right);
		
	}

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