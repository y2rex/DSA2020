package extraWeek.trie;

public class TrieNode {
	
	boolean isEnd;
	TrieNode[] child;
	
	public TrieNode() {
		isEnd=false;
		child=new TrieNode[26];
	}
}
