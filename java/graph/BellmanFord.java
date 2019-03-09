package graph;

public class BellmanFord {

	final static int V=9;
	public void bellman(int arr[][],int x) {
		int dist[] = new int [V];
		
		
		for(int i=0;i<V;i++) {
			dist[i]=Integer.MAX_VALUE;
			
		}
		dist[x]=0;
		
		for(int u=0;u<V;u++) {
			
			
			for(int v=0;v<V;v++) {
				
				if(arr[u][v]!=0&&dist[u]+arr[u][v]<dist[v]&&dist[u]!=Integer.MAX_VALUE) {
					dist[v]=dist[u]+arr[u][v];
					
				}
				
			}
		}
		
		printSolution(dist,9);
	}
public void printSolution(int arr[], int v) {
		
		for(int i=0; i<v;i++) {
			
			System.out.println(i+" -> "+arr[i]);
		}
	}


 public  static void main(String args[]) {
	
	 int graph[][] = new int[][]{{0, 4, 0, 0, 0, 0, 0, 8, 0}, 
         {4, 0, 8, 0, 0, 0, 0, 11, 0}, 
         {0, 8, 0, 7, 0, 4, 0, 0, 2}, 
         {0, 0, 7, 0, 9, 14, 0, 0, 0}, 
         {0, 0, 0, 9, 0, 10, 0, 0, 0}, 
         {0, 0, 4, 14, 10, 0, 2, 0, 0}, 
         {0, 0, 0, 0, 0, 2, 0, 1, 6}, 
         {8, 11, 0, 0, 0, 0, 1, 0, 7}, 
         {0, 0, 2, 0, 0, 0, 6, 7, 0} 
        }; 
BellmanFord t = new BellmanFord();


t.bellman(graph, 0);

	
	
}
}