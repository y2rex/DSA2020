package extraWeek.trie;

public class DemoTrie 
{
	static TrieNode root=new TrieNode();
	
	public static void main(String[] args) 
	{
		
		insert("bad");
		insert("bat");
		insert("geek");
		insert("geeks");
		insert("cat");
		insert("cut");
		
		System.out.println(search("cat"));
		System.out.println(search("zoo"));
		
		if(search("cat"))
			delete("cat");
		else
			System.out.println("Not present in dictionary!!!");
	}

	private static void delete(String str) {
		TrieNode t=deleteUtil(root,str,0);
		if(t!=null)
			System.out.println("Deleted successfully...");
	}

	private static TrieNode deleteUtil(TrieNode root, String str, int i) {
		
		if(root==null)
			return null;
		
		if(i==str.length())
		{
			root.isEnd=false;
			if(isEmpty(root))
				root=null;
			return root;
		}
		
		int index=str.charAt(i)-'a';
		if(root.child[index]!=null)
		root.child[index]=deleteUtil(root.child[index], str, i+1);
		
		if(isEmpty(root) && root.isEnd==false)
			root=null;
		return root;
	}

	private static boolean isEmpty(TrieNode root) 
	{
		for(int i=0;i<26;i++)
			if(root.child[i]!=null)
				return false;
		return true;
	}

	private static boolean search(String str) {
		TrieNode curr=root;
		for(int i=0;i<str.length();i++)
		{
			int index=str.charAt(i)-'a';
			if(curr.child[index]==null)
				return false;
			curr=curr.child[index];
		}	
		return curr.isEnd;
	}

	private static void insert(String str) 
	{
		TrieNode curr=root;
		for(int i=0;i<str.length();i++)
		{
			int index=str.charAt(i)-'a';
			if(curr.child[index]==null)
				curr.child[index]=new TrieNode();
			curr=curr.child[index];
		}
		curr.isEnd=true;
	}

	

}
