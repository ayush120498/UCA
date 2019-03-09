package graph;

public class Union {
	int V, E; 
	Edge[] edge; 

	Union(int nV, int nE) 
	{ 
		V = nV; 
		E = nE; 
		edge = new Edge[E]; 
		for (int i = 0; i < E; i++) 
		{ 
			edge[i] = new Edge(); 
		} 
	} 
	class Edge 
	{ 
		int src, dest; 
	}  
	class subset 
	{ 
		int parent; 
		int rank; 
	}  
	int find(subset [] subsets , int i) 
	{ 
	if (subsets[i].parent != i) 
		subsets[i].parent = find(subsets, 
								subsets[i].parent); 
		return subsets[i].parent; 
	} 

	void UnionFunc(subset []subsets, int x , int y ) 
	{ 
		int xroot = find(subsets, x); 
			int yroot = find(subsets, y); 

		if (subsets[xroot].rank < subsets[yroot].rank) 
			subsets[xroot].parent = yroot; 
		else if (subsets[yroot].rank < subsets[xroot].rank) 
			subsets[yroot].parent = xroot; 
		else
		{ 
			subsets[xroot].parent = yroot; 
			subsets[yroot].rank++; 
		} 
	} 
			 
	int isCycle(Union graph) 
	{ 
		int V = graph.V; 
		int E = graph.E; 

		subset [] subsets = new subset[V]; 
		for (int v = 0; v < V; v++) 
		{ 

			subsets[v] = new subset(); 
			subsets[v].parent = v; 
			subsets[v].rank = 0; 
		} 

		for (int e = 0; e < E; e++) 
		{ 
			int x = find(subsets, graph.edge[e].src); 
			int y = find(subsets, graph.edge[e].dest); 
			if(x == y) 
				return 1; 
			UnionFunc(subsets, x, y); 
		} 
	return 0; 
	} 
	public static void main(String [] args) 
	{ 

	int V = 3, E = 3; 
	Union graph = new Union(V, E); 
	graph.edge[0].src = 0; 
	graph.edge[0].dest = 1;
	graph.edge[1].src = 1; 
	graph.edge[1].dest = 2; 
	graph.edge[2].src = 0; 
	graph.edge[2].dest = 2; 

	if (graph.isCycle(graph) == 1) 
		System.out.println("Graph contains cycle"); 
	else
		System.out.println("Graph doesn't contain cycle"); 
	} 
	} 


