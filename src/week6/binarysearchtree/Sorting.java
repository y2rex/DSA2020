//**********************O(n2)*************************

package week6.binarysearchtree;

public class Sorting {

	
	public static void main(String[] args) {

		Node root=new Node(10);
		root.left=new Node(8);
		root.right=new Node(15);
		
		root.left.left=new Node(3);
		root.left.right=new Node(9);
		
		root.right.left=new Node(12);
		root.right.right=new Node(20);	
		
		show(root);
		System.out.println("\n======================================");
	}



	private static void show(Node root) {

		if(root==null)
			return;
		show(root.right);
		System.out.print(root.data+" ");
		show(root.left);
		
	}
}