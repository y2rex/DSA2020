//this will work only when both nodes are available in tree.It needs only one traversal & no extra space
package week6.binarytree.lca;

import java.util.LinkedList;
import java.util.Queue;

public class MainRunner2 
{  
	private static void show(Node root) 
	{		
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
	
	public static void main(String[] args) {
				
	        Node root = new Node(1);
	        root.left = new Node(2);
	        root.right = new Node(3);
	        root.left.left = new Node(4);
	        root.left.right = new Node(5);
	        root.right.left = new Node(6);
	        root.right.right = new Node(7);
	        
	        show(root);
	        System.out.println("\n=======================");
	        System.out.println("LCA(2, 5): " + findLCA(root,3, 5).data);

	}

	private static Node findLCA(Node node, int n1, int n2)
	{  
		if(node==null)
			return null;
		
		if(node.data==n1 || node.data==n2)
			return node;
		
/*Look for keys in left and right subtrees*/	
		Node left=findLCA(node.left, n1, n2);
		Node right=findLCA(node.right, n1, n2);
		
/*If both of the above calls return Non-NULL, then one key is present in once subtree and 
  other is present in other, So this node is the LCA	*/	
		if(left!=null && right!=null)
			return node;
	        
		return (node.left!=null)?left:right;
	}
}