package week6.binarytree.traversal.dft;

public class DepthFirstTraversal {

	public static void main(String[] args) {

//*******implementation****************************
		
		Node root=new Node(10);
		root.left=new Node(5);
		root.right=new Node(20);
		
		root.left.left=new Node(3);
		root.left.right=new Node(5);
		
		root.right.left=new Node(15);
		root.right.right=new Node(6);
		
		
//***********In Order traversal***********************
		inOrder(root);
		System.out.println("\n========================");
		
		
//***********Pre Order traversal***********************
		preOrder(root);
		System.out.println("\n========================");
		
		
//***********Post Order traversal***********************
		postOrder(root);
		System.out.println("\n========================");
	}
	
	
//*********(left->right->root)**********************	
private static void postOrder(Node root) {

		if(root==null)
			return;
		postOrder(root.left);
		postOrder(root.right);
		System.out.print(root.data+" ");
		
	}

//*********(root->left->right)**********************	
private static void preOrder(Node root) {
		if(root==null)
			return;
		
		System.out.print(root.data+" ");
		preOrder(root.left);
		preOrder(root.right);
		
	}

//*********(left->root->right)**********************	
	private static void inOrder(Node root) 
	{
		if(root==null)
			return;
		inOrder(root.left);
		System.out.print(root.data+" ");
		inOrder(root.right);
		
	}

}
