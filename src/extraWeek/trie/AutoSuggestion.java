package extraWeek.trie;


class AutoSuggestion {
    
    public static void main(String[] args)
    {   
        TrieNode root = new TrieNode(); 
        insert(root, "hello"); 
        insert(root, "dog"); 
        insert(root, "hell"); 
        insert(root, "cat"); 
        insert(root, "a"); 
        insert(root, "hel"); 
        insert(root, "help"); 
        insert(root, "helps"); 
        insert(root, "helping"); 
        int comp = printAutoSuggestions(root, "he"); 

        if (comp == -1)
            System.out.println("No other strings found "+
                                    "with this prefix\n");
        else if (comp == 0) 
            System.out.println("No string found with"+ 
                                        " this prefix\n");
    }
    
    private static int printAutoSuggestions(TrieNode root, String str) 
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
		if(!isLastNode(curr))
		{
			utilPrintAutoSuggestion(curr,str);   //curr node & prefix
			return 1;
		}
			    	
		return 0;
	}


	private static void utilPrintAutoSuggestion(TrieNode curr, String prefix) {
		
		if(curr.isEnd)
			System.out.println(prefix);
		if(isLastNode(curr))
			return;
		for(int i=0;i<26;i++)
		{
			if(curr.child[i]!=null)
			{
				prefix+=(char)(97+i);
				utilPrintAutoSuggestion(curr.child[i], prefix);
				prefix=prefix.substring(0,prefix.length()-1);
			}
		}
	}

	private static boolean isLastNode(TrieNode root) {
		for(int i=0;i<26;i++)
			if(root.child[i]!=null)
				return false;
		return true;
	}

	private static void insert(TrieNode root, String str) {
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
