package week6.binarytree.treemaking;

public class InOrderAndPostOrder {

	public static void main(String[] args) 
	{
		char in[] = { 'D', 'B', 'E', 'A', 'F', 'C' };  
	    char post[] = { 'D', 'E', 'B', 'F', 'C', 'A' }; 
	   
	    Node root=getTree(in,post);
	    print(root);

	}

	private static void print(Node root) {
		if(root==null)
			return;
	
		print(root.left);
		print(root.right);
		System.out.print(root.data+" ");
		
	}

	private static Node getTree(char[] in, char[] pos) 
	{
		int n=in.length-1;
		return util(in,pos,0,n,0,n);
	}

	private static Node util(char[] in, char[] pos, int inS, int inE, int pS, int pE) 
	{
		if(inS>inE)
			return null;
		
		char rootData=pos[pE];
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
		
		int lPS=pS;
		int lPE=lPS+lInE-lInS;
		int rPS=lPE+1;
		int rPE=pE-1;
		
		Node root=new Node(rootData);
		root.left=util(in, pos, lInS, lInE, lPS, lPE);
		root.right=util(in, pos, rInS, rInE, rPS, rPE);
		return root;
	}

}
