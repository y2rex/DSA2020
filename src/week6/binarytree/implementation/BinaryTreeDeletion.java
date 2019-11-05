/*
 * deletion : just copy the right most element to key node then,
 * delete the deepest right most element
 */

package week6.binarytree.implementation;

import java.util.LinkedList;
import java.util.Queue;

public class BinaryTreeDeletion {

	public static void main(String[] args) {

		Node root = new Node(10); 
        root.left = new Node(11); 
        root.left.left = new Node(7); 
        root.left.right = new Node(12);
        root.right = new Node(9); 
        root.right.left = new Node(15); 
        root.right.right = new Node(8);
        
        show(root);
        System.out.println("======================");
        delete(root,11);
        show(root);
	}
//find the key node & copy data of deepest right element to key node
	private static void delete(Node root, int key) {
		
		Queue<Node> q=new LinkedList<>();
		q.add(root);
		Node keyNode=null;
		Node temp=null;
		
		while(q.isEmpty()==false)
		{
			temp=q.remove();
			if(temp.data==key)
				keyNode=temp;
			
			if(temp.left!=null)
				q.add(temp.left);
			if(temp.right!=null)
				q.add(temp.right);
		}
		int data=temp.data;
		deleteNode(root,temp);
		keyNode.data=data;
		
	}

//now delete the deepest right most element	
	private static void deleteNode(Node root,Node temp) 
	{
		Queue<Node> q=new LinkedList<>();
		q.add(root);
		
		while(q.isEmpty()==false){
			Node head=q.remove();
			
			if(head.right!=null){
				if(head.right==temp)
					head.right=null;
				else
					q.add(head.right);
			}
			if(head.left!=null){
				if(head.left==temp)
					head.left=null;
				else
					q.add(head.left);
			}
				
		}
		
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
			else{
				System.out.print(head.data+" ");
				
				if(head.left!=null)
					q.add(head.left);
				if(head.right!=null)
					q.add(head.right);
			}
		}
		
	}

	
}