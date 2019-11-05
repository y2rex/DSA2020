
package week6.binarysearchtree;

public class KthSmallestElement {

	
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
		int key=2;
		kthLargest(root,key);
	}

	static int  count=1;

	private static void kthLargest(Node root, int key) {
		
		if(root==null)
			return;
		
		kthLargest(root.left, key);
		
		if(count==key)	
		System.out.print(root.data+" ");
			
		count++;
		
		kthLargest(root.right, key);
	}



	private static void show(Node root) {

		if(root==null)
			return;
		show(root.left);
		System.out.print(root.data+" ");
		show(root.right);
		
	}
}