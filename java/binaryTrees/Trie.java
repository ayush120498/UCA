package trees;


public class Trie {
	
	public class TrieNode{
		TrieNode []arr=new TrieNode[128];
		
		boolean isEndOfWord;
		
		TrieNode() {
			
			isEndOfWord=false;
			for(int i=0;i<128;i++) {
				
				arr[i]=null;
			}
		}
		
	}
	 TrieNode root;
	public void insert(String s) {
		
		root=insert(s,root,0);
		
	}
	private TrieNode insert(String s,TrieNode node,int d) {
		if (node == null) node = new TrieNode();
		
		if(s.length()==d) {
			node.isEndOfWord=true;
			return node;
		}
		int index=s.charAt(d);
		node.arr[index]=insert(s,node.arr[index],d+1);
		return node;
	}
	public boolean search(String s) {
		return search(s,root,0);
	}
	private boolean search(String s,TrieNode node,int d) {
		if(node==null) {
			return false;
		}
		if(node.isEndOfWord==true&&s.length()==d) {
			return true;
		}
		if(s.length()==d&&node.isEndOfWord==false) {
			return false;
		}
		int index=s.charAt(d);
		return search(s,node.arr[index],d+1);
		
	}
	public static void main(String args[]) {
		
		
		Trie tree=new Trie();
		tree.insert("Hello");
		tree.insert("bye");
		tree.insert("poll");
		System.out.println(tree.search("Hello"));
		System.out.println(tree.search("lol"));
		System.out.println(tree.search("by"));
	}
}
