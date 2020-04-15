package extraWeek.trie;

class AutoSuggestionPractice
{
	public static void main(String[] args) 
	{
		TrieNode root=new TrieNode();
		insert(root, "hello"); 
        insert(root, "dog"); 
        insert(root, "hell"); 
        insert(root, "cat"); 
        insert(root, "a"); 
        insert(root, "hel"); 
        insert(root, "help"); 
        insert(root, "helps"); 
        insert(root, "helping"); 
		
        String query="he";
        int comp=autoSug(root,query);
        
        if(comp==0)
        	System.out.println("There is no word in dictionary having prefix "+query);
        
        if(comp==-1)
        	System.out.println("There is no other word in dictionary having prefix "+query);
        
	}
	
	private static int autoSug(TrieNode root, String str) 
	{
		TrieNode curr=root;
		for(int i=0;i<str.length();i++)
		{
			int index=str.charAt(i)-'a';
			if(curr.child[index]==null)
				return 0;
			curr=curr.child[index];
		}
		
		if(curr.isEnd && isLastNode(curr))
		{
			System.out.println(str);
			return -1;
		}
		
		if(!isLastNode(curr))		// this is the case when you got auto suggestion
		{
			util(curr,str);
			return 1;
		}
		return 0;
	}

	private static void util(TrieNode curr, String str) {
		if(curr.isEnd)
			System.out.println(str);
		if(isLastNode(curr))
			return;
		
		for(int i=0;i<26;i++)
		{
			if(curr.child[i]!=null)
			{
				str+=(char)(97+i);
				util(curr.child[i], str);
				str=str.substring(0,str.length()-1);
			}
		}
	}

	private static boolean isLastNode(TrieNode node) {
		TrieNode curr=node;
		for(int i=0;i<26;i++)
			if(curr.child[i]!=null)
				return false;
		return true;
	}

	private static void insert(TrieNode root, String str) 
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

	static class TrieNode
	{
	private TrieNode child[];
	private boolean isEnd;
	public TrieNode() 
	{
		child=new TrieNode[26];
		isEnd=false;
	}
	}
}