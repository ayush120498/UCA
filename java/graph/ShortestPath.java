package graph;
import java.util.*;
public class ShortestPath {

	final  static int V=9;
	
	public int mindistance(int arr[],boolean ans[]) {
		int min = Integer.MAX_VALUE;
		
		int index = -1;
		for(int i=0;i<V;i++) {
		if(ans[i]==false && arr[i]<=min) {	
			min = arr[i];
			index = i;}
		
		}
		return index;
	}
	public void dijkstra(int arr[][],int src) {
		
	int dist[]= new int[V];
	
	boolean incl[]= new boolean[V];
	for(int i=0;i<V;i++) {
		dist[i]=Integer.MAX_VALUE;
		incl[i]=false;	
	}
	
	dist[src]=0;
	
	
	for(int i=0;i<V-1;i++) {
			
		int x = mindistance(dist,incl);
		
		incl[x]= true;
		for(int j=0;j<V;j++) {
			if(!incl[j]&&arr[x][j]!=0 && dist[x]+arr[x][j]<dist[j]&&dist[x]!=Integer.MAX_VALUE) {
				dist[j]=dist[x]+arr[x][j];
			}
			
		}
		
	}
	printSolution(dist,V);
	
	}
	
	public void printSolution(int arr[], int v) {
		
		for(int i=0; i<v;i++) {
			
			System.out.println(i+" -> "+arr[i]);
		}
	}
	public static void main (String[] args) 
    { 
        /* Let us create the example graph discussed above */
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
        ShortestPath t = new ShortestPath(); 
        t.dijkstra(graph, 0); 
    } 
	
}
