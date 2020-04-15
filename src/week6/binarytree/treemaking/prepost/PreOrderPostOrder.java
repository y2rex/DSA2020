package week6.binarytree.treemaking.prepost;

public class PreOrderPostOrder {

	public static void main(String[] args) 
	{
		int pre[] = { 1, 2, 4, 8, 9, 5, 3, 6, 7 }; 
        int post[] = { 8, 9, 4, 5, 2, 6, 7, 3, 1 }; 
        
        Node root=getTree(pre,post);
        System.out.println("=========================");
        print(root);
        index=pre.length-1;
	}

	private static void print(Node root) 
	{
		if(root==null)
			return ;
		print(root.left);
		print(root.right);
		System.out.print(root.data+" ");
		
		
	}

	private static Node getTree(int[] pre, int[] post) 
	{
		int n=pre.length;
		return util(pre,post,0,n-1,0,n-1);
	}

	static int index;
	private static Node util(int[] pre, int[] post, int preS, int preE, int postS, int postE) 
	{
		if(preS>preE)
			return null;
		
		int rootData=post[index];
		Node root=new Node(rootData);
		index--;
		if(preS==preE)
			return root;
		
		int lpreS=preS+1;
		int lpreE=(preE-preS)/2;
		int rpreS=lpreE+1;
		int rpreE=preE;
		
		int lpostS=postS;
		int lpostE=lpostS+lpreE-lpreS;
		int rpostS=lpostE+1;
		int rpostE=postE-1;
		
		
		
		root.left=util(pre, post, lpreS, lpreE, lpostS, lpostE);
		root.right=util(pre, post, rpreS, rpreE, rpostS, rpostE);
		return root;
	}

}
