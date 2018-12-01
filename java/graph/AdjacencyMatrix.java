package graph;

public class AdjacencyMatrix {

	int v;
	boolean arr[][];
	
	AdjacencyMatrix (int v){
		this.v=v;
		arr=new boolean[v][];
		for(int i=0;i<v;i++) {
			arr[i]=new boolean[v];
		}
	}
	public void addEdge(AdjacencyMatrix adj,int src,int dest) {
		
		arr[src][dest]=true;
		arr[src][dest]=true;
		
	}
	public void printGraph() {
		for(int i=0;i<v;i++) {
			for(int j=0;j<v;j++) {
				if(arr[i][j]==true) {
					System.out.print(arr[i][j]);
				}
				System.out.println();
			}
			
		}
		
	}
	public static void main(String args[]) {
		
		int v=5;
	AdjacencyMatrix adj=new AdjacencyMatrix(v);
	adj.addEdge(adj, 0, 1); 
    adj.addEdge(adj, 0, 4); 
    adj.addEdge(adj, 1, 2); 
    adj.addEdge(adj, 1, 3); 
    adj.addEdge(adj, 1, 4); 
    adj.addEdge(adj, 2, 3); 
    adj.addEdge(adj, 3, 4); 
	adj.printGraph();	
	}
}
