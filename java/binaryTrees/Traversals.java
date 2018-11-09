package binaryTrees;
class Node{
	int key;
	Node left,right;
	Node(int data){
		key=data;
		left=right=null;
	}
}

public class Traversals {
	Node root;
	Traversals(){
		
		root=null;
	}
public static void preOrder(Node node) 
{
	if(node==null) {
		return;
	}
	System.out.print(node.key+" ");
	preOrder(node.left);
	preOrder(node.right);
}
public static void postOrder(Node node) {
	if(node==null) {
		return;
	}
	postOrder(node.left);
	postOrder(node.right);
	System.out.print(node.key+" ");
	
		
	}
	

public static void inOrder(Node node) {
	if(node==null) {
		return;
	}
	
	inOrder(node.left);
	System.out.print(node.key+" ");
	inOrder(node.right);
	
	
		
	}
	
	
	public static void main(String args[]){
		Traversals tree=new Traversals();
		tree.root=new Node(1);
		tree.root.left = new Node(2); 
        tree.root.right = new Node(3); 
        tree.root.left.left = new Node(4); 
        tree.root.left.right = new Node(5);
        System.out.println("Inorder traversal");
        inOrder(tree.root);
        System.out.println();
        System.out.println("Preorder traversal");
        preOrder(tree.root);
        System.out.println();
        System.out.println("Postorder traversal");
        postOrder(tree.root);
        
        
		
	}
}

