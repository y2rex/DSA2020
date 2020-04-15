package week6.binarytree.traversal.verticaltraversal;

import java.util.LinkedList;
import java.util.Queue;
import java.util.TreeMap;
import java.util.Vector;

public class MainRunner {

	public static void main(String[] args) 
	{
		Node root = new Node(1); 
		
        root.left = new Node(2); 
        root.right = new Node(3); 
        
        root.left.left = new Node(4); 
        root.left.right = new Node(5); 
        
        root.right.left = new Node(6); 
        root.right.right = new Node(7); 
        
        root.right.left.right = new Node(8); 
        root.right.right.right = new Node(9); 
        
        traversal(root);

	}

	private static void traversal(Node root) 
	{
		Queue<Node> q=new LinkedList<>();
		q.add(root);
		
		TreeMap<Integer, Vector<Integer>> t=new TreeMap<>();
		
		Vector<Integer> v=new Vector<>();
		v.add(root.data);
		t.put(0,v);
		
		int hd=0;
		
		while(!q.isEmpty())
		{
			Node head=q.remove();
			
			if(head.left!=null)
			{	
				for(int a : t.keySet())
				{
					if(t.get(a).contains(head.data))
						hd=a-1;
				}
				
				Vector<Integer> vLeft=new Vector<>();
				if(t.get(hd)!=null)
				{
					vLeft=t.get(hd);
					vLeft.add(head.left.data);
					
				}
				else
					vLeft.add(head.left.data);
				
				t.put(hd, vLeft);
				q.add(head.left);
			}
			
			if(head.right!=null)
			{
				for(int a : t.keySet())
				{
					if(t.get(a).contains(head.data))
						hd=a+1;
				}
				
				Vector<Integer> vRight=new Vector<>();
				if(t.get(hd)!=null)
				{
					vRight=t.get(hd);
					vRight.add(head.right.data);
					
				}
				else
					vRight.add(head.right.data);
				
				t.put(hd, vRight);
				q.add(head.right);
			}
		}
		
		for(int a :t.keySet())
			System.out.println(a+" : "+t.get(a));
		System.out.println("=========================");
		for(int k : t.keySet())
		{
			Vector<Integer> v1=t.get(k);
			System.out.println(v1.get(v1.size()-1));
		}
		
	}
}