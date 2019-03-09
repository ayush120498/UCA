package graph;
import java.util.*;
public class Cycle {

	
	private int V,E;
	
	LinkedList<Integer>edge[];
	
	
	
	
	Cycle(int V){
		
		this.V=V;
		
		
		
		edge = new LinkedList[V];
		for(int i=0;i<V;i++) {
			edge[i]=new LinkedList<Integer>();
		}
		
	}
	public void addEdge(int x,int y) {
		
		edge[x].add(y);
	}
	
	
	public int find(int parent[],int x) {
	if(parent[x]==-1) {
	return x;	
	}
	
		return find(parent,parent[x]);
	
	
	}
	
	public void union(int parent[],int x,int y) {
	int xset = find(parent,x);
	int yset = find(parent,y);
	if(xset!=yset)
	parent[xset]=yset;
	
	}
	public int isCycle(Cycle graph) {
		int parent []= new int[graph.V];
		
		for(int i=0;i<graph.V;i++) {
		parent[i]=-1;	
		}
		
		for(int i=0;i<graph.V;i++) {
		Iterator<Integer> itr = edge[i].listIterator();	
			while(itr.hasNext()) {
				int m = itr.next();
		int x = find(parent,i);
		int y = find(parent,m);
		
		if(x==y) {
		return 1;	
		}
		union(parent,i,m);
		}
}
	return 0;	
	}
	
	public static void main(String args[]) {
		
		Cycle graph = new Cycle(8);
		 graph.addEdge(0, 1);
		 graph.addEdge(1, 2);
		 graph.addEdge(2, 3);
		 graph.addEdge(3, 4); graph.addEdge(4, 5); graph.addEdge(5, 6);
		 graph.addEdge(2, 7);
		 graph.addEdge(0, 7);
  
        if (graph.isCycle(graph)==1) 
            System.out.println( "graph contains cycle" ); 
        else
            System.out.println( "graph doesn't contain cycle" ); 
    } 
		
	}
	

