package binaryTrees;


public class InPre {
	Node root;
	InPre(){
		root=null;
	}
	static int pr=0;
	Node constructTree(int in[],int pre[],int strt,int end) {
	
	if(strt>end) {
		return null;
	}
	Node tnode=new Node(pre[pr++]);
	if(strt==end) {
		return tnode;
	}
	int index=search(in,strt,end,tnode.key);
	tnode.left=constructTree(in,pre,strt,index-1);
	tnode.right=constructTree(in,pre,index+1,end);
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
	public static void main(String args[]) {
		
	 int in[] = new int[] { 4, 2, 5, 1, 6, 3 }; 
     int pre[] = new int[] { 1, 2, 4, 5, 3, 6 }; 
     InPre tree=new InPre();
     Node root=tree.constructTree(in,pre,0,5);
     Traversals tr=new Traversals();
     tr.inOrder(root);
     }
}

