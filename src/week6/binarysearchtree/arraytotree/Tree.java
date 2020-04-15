package week6.binarysearchtree.arraytotree;

import java.util.LinkedList;
import java.util.Queue;

public class Tree 
{ 
    public static Node insertLevelOrder(int[] arr, Node node,int i) 
    { 
        if (i < arr.length) 
        { 
            node = new Node(arr[i]); 
  
            node.left = insertLevelOrder(arr,node.left,2 * i + 1); 
  
            node.right = insertLevelOrder(arr,node.right,2 * i + 2); 
        } 
        return node; 
    } 
  
    public static void show(Node root) 
    { 
        Queue<Node> q=new LinkedList<>();
        q.add(root);
        
        while(q.isEmpty()==false){
        	int n=q.size();
        	for(int i=0;i<n;i++)
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
    public static void main(String args[]) 
    { 
        int arr[] = { 1, 2, 3, 4, 5, 6, 6, 6, 6 }; 
        Node root = insertLevelOrder(arr, null, 0); 
        show(root); 
    } 
} 