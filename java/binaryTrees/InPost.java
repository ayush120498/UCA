package binaryTrees;

class Index{
	int index;
}

public class InPost {
	Node root;
	InPost(){
		root=null;
	}
	static int pr=0;
	Node constructTree(int in[],int pre[],int strt,int end,Index p) {
	
	if(strt>end) {
		return null;
	}
	Node tnode=new Node(pre[p.index]);
	p.index--;
	if(strt==end) {
		return tnode;
	}
	int index=search(in,strt,end,tnode.key);
	tnode.right=constructTree(in,pre,index+1,end,p);
	tnode.left=constructTree(in,pre,strt,index-1,p);
		return tnode;
	}
	int search (int in[],int strt,int end,int data) {
		int i;
		for( i=strt;i<=end;i++) {
			if(data==in[i]) {
				return i;
			}
		}
		return i;
	}
	Node builtTree(int in[],int post[],int s,int l) {
		Index p=new Index();
		p.index=l;
		
		return constructTree(in,post,s,l,p);
	}
	public static void main(String args[]) {
		
		 int in[] = { 4, 8, 2, 5, 1, 6, 3, 7 }; 
		 int post[] = { 8, 4, 5, 2, 6, 7, 3, 1 }; 
     InPost tree=new InPost();
     Node root=tree.builtTree(in,post,0,7);
     Traversals tr=new Traversals();
     tr.inOrder(root);
     System.out.println();
     tr.postOrder(root);
     System.out.println();
     tr.inOrder(root);
     }
}

