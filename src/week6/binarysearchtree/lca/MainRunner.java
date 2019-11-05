package week6.binarysearchtree.lca;

public class MainRunner {

	public static void main(String[] args) {

		   Node root = new Node(20);
	       root.left = new Node(8);
	       root.right = new Node(22);
	       
	       root.left.left = new Node(4);
	       root.left.right = new Node(12);
	       
	       root.left.right.left = new Node(10);
	       root.left.right.right = new Node(14);

	        int n1 = 4, n2 = 14;
	        Node t = lca(root, n1, n2);
	        System.out.println(t.data);
	}

	private static Node lca(Node root, int n1, int n2) {

		if(root==null)
			return null;
		
		if(n1<root.data && n2<root.data)
			return lca(root.left, n1, n2);
		
		if(n1>root.data && n2 > root.data)
			return lca(root.right, n1, n2);
		
		return root;
	}

}
