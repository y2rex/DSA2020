package week6.binarytree.childrensumproperty;

import java.util.LinkedList;
import java.util.Queue;

public class BinaryTree {

	public static void main(String[] args) {

		Node root=new Node(10);
		root.left=new Node(4);
		root.right=new Node(6);
		
		root.left.left=new Node(1);
		root.left.right=new Node(3);
		
		root.right.left=new Node(6);
		//root.right.right=new Node(4);		
		show(root);
		System.out.println("\n=====================================================");
		boolean res=isCheckSum(root);
		if(res)
			System.out.println("This tree is following children sum property!");
		else
			System.out.println("This tree is not following children sum property!");
		
		
		
		System.out.println("\n=====================================================");
		boolean res2=isCheckSum2(root);
		if(res2)
			System.out.println("This tree is following children sum property!");
		else
			System.out.println("This tree is not following children sum property!");
	}

	private static boolean isCheckSum2(Node root) {
		
		if(root==null)
			return true;
		
		if(root.left==null&&root.right==null)
			return true;
		
		int sum=0;
		if(root.left!=null)
			sum+=root.left.data;
		if(root.right!=null)
			sum+=root.right.data;
		
		
		return sum==root.data&& isCheckSum2(root.left)&&isCheckSum2(root.right);
	}

	private static boolean isCheckSum(Node root) {
		
		if(root==null)
			return true;
		
		Queue<Node> q=new LinkedList<>();
		q.add(root);
		while(q.isEmpty()==false)
		{
			
			Node head=q.remove();
			if(head.left!=null)
				q.add(head.left);
			if(head.right!=null)
				q.add(head.right);
			
//logic : whenever an element is popped that time their children has pushed into queue******************************
			/*if(head.left==null&&head.right==null)
					return true;*/
			
			if(head.left==null&&head.right!=null)
				if(head.data!=head.right.data)
					return false;
			
			if(head.right==null&&head.left!=null)
				if(head.data!=head.left.data)
					return false;
			
			if(head.left!=null&&head.right!=null)
				if(head.left.data+head.right.data!=head.data)
					return false;			
		}
		
		return true;
	}

	private static void show(Node root) {

		Queue<Node> q=new LinkedList<>();
		q.add(root);
		
		while(q.isEmpty()==false)
		{
			Node head=q.remove();
			System.out.print(head.data+" ");
			
			if(head.left!=null)
				q.add(head.left);
			if(head.right!=null)
				q.add(head.right);
		}
		
	}
}