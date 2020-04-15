package week6.binarytree.treemaking;

public class InOrderAndPreOrder {

	public static void main(String[] args) 
	{
		char in[] = { 'D', 'B', 'E', 'A', 'F', 'C' };  
	    char pre[] = { 'A', 'B', 'D', 'E', 'C', 'F' }; 
	   
	    Node root=getTree(in,pre);
	    print(root);

	}

	private static void print(Node root) {
		if(root==null)
			return;
	
		print(root.left);
		System.out.print(root.data+" ");
		print(root.right);
		
	}

	private static Node getTree(char[] in, char[] pre) 
	{
		int n=in.length-1;
		return util(in,pre,0,n,0,n);
	}

	private static Node util(char[] in, char[] pre, int inS, int inE, int pS, int pE) 
	{
		if(inS>inE)
			return null;
		
		char rootData=pre[pS];
		int i;
		for(i=inS;i<=inE;i++)
		{
			if(rootData==in[i])
				break;
		}
		
		int lInS=inS;
		int lInE=i-1;
		int rInS=i+1;
		int rInE=inE;
		
		int lPS=pS+1;
		int lPE=lPS+lInE-lInS;
		int rPS=lPE+1;
		int rPE=pE;
		
		Node root=new Node(rootData);
		root.left=util(in, pre, lInS, lInE, lPS, lPE);
		root.right=util(in, pre, rInS, rInE, rPS, rPE);
		return root;
	}

}
