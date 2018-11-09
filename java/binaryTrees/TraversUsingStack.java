package binaryTrees;
import java.util.*;


public class TraversUsingStack {
	Stack<Node>st=new Stack<Node>();
	Node node;
	TraversUsingStack(){
		node=null;
	}
	void inOrder() {
		Node curr=node;
		if(curr==null) {
			return;
		}
		while(curr!=null||st.empty()==false) {
			
			while(curr!=null) {
				
				st.push(curr);
				curr=curr.left;
			}
			curr=st.pop();
			System.out.print(curr.key+" ");
			curr=curr.right;
		}
	}
	public static void main(String args[]) {
		
		
		TraversUsingStack tree=new TraversUsingStack();
		tree.node=new Node(1);
		tree.node.left = new Node(2); 
        tree.node.right = new Node(3); 
        tree.node.left.left = new Node(4); 
        tree.node.left.right = new Node(5);
        tree.inOrder();
	}
}
