package graph;

import java.util.*;

class MinimumSpanningTree {

	class Edge implements Comparable<Edge> {

		int src, dest, weight;

		public int compareTo(Edge e) {

			return this.weight - e.weight;
		}

	}

	class Subset {
		int parent;
		int rank;
	}

	int v, e;
	Edge edge[];

	MinimumSpanningTree(int e,int v) {
		this.v = v;
		this.e=e;
		edge = new Edge[e];
		for (int i = 0; i < e; i++) {

			edge[i] = new Edge();

		}

	}

	int find(Subset subsets[], int i) {
		if (subsets[i].parent != i)

			subsets[i].parent = find(subsets, subsets[i].parent);

		return subsets[i].parent;
	}

	void Union(Subset subsets[], int x, int y) {

		int xroot = find(subsets, x);

		int yroot = find(subsets, y);

		if (subsets[xroot].rank < subsets[yroot].rank) {

			subsets[xroot].parent = yroot;

		} else if (subsets[xroot].rank > subsets[yroot].rank)
			subsets[yroot].parent = xroot;

		else {
			subsets[yroot].parent = xroot;
			subsets[xroot].rank++;
		}
	}

	void Kruskal() {

		Edge result[] = new Edge[v];

		for (int i = 0; i < v; i++) {

			result[i] = new Edge();
		}
		Arrays.sort(edge);

		Subset subsets[] = new Subset[v];

		for (int i = 0; i < v; i++) {
			subsets[i] = new Subset();
		}
		for (int j = 0; j < v; j++) {
			subsets[j].parent = j;
			subsets[j].rank = 0;

		}
		int e = 0;
		int i = 0;
		while (e < v - 1) {
			Edge nxt = new Edge();
			nxt = edge[i++];
			int x = find(subsets, nxt.src);
			int y = find(subsets, nxt.dest);

			if (x != y) {
				result[e++] = nxt;
				Union(subsets, x, y);

			}
			
			 
	    } 
		

		
		System.out.println("The result MSt is");
		
			for(int j=0;j<result.length;j++) {
				
				System.out.println(result[j].src+" "+result[j].dest+" "+result[j].weight);
			}

	}
	public static void main(String args[]) {
		/*Scanner scan=new Scanner(System.in);
		int e,v;
		e=scan.nextInt();
		v=scan.nextInt();
		MinimumSpanningTree graph=new MinimumSpanningTree(e,v);
		for(int i=0;i<e;i++) {
			graph.edge[i].src=scan.nextInt();
			graph.edge[i].dest=scan.nextInt();
			graph.edge[i].weight=scan.nextInt();
		}
			graph.Krushkal();
	*/	
		
		 int V = 4;  // Number of vertices in graph 
	        int E = 5;  // Number of edges in graph 
	        MinimumSpanningTree graph = new MinimumSpanningTree(E, V); 
	  
	        // add edge 0-1 
	        graph.edge[0].src = 0; 
	        graph.edge[0].dest = 1; 
	        graph.edge[0].weight = 10; 
	  
	        // add edge 0-2 
	        graph.edge[1].src = 0; 
	        graph.edge[1].dest = 2; 
	        graph.edge[1].weight = 6; 
	  
	        // add edge 0-3 
	        graph.edge[2].src = 0; 
	        graph.edge[2].dest = 3; 
	        graph.edge[2].weight = 5; 
	  
	        // add edge 1-3 
	        graph.edge[3].src = 1; 
	        graph.edge[3].dest = 3; 
	        graph.edge[3].weight = 15; 
	  
	        // add edge 2-3 
	        graph.edge[4].src = 2; 
	        graph.edge[4].dest = 3; 
	        graph.edge[4].weight = 4; 
	  
	        graph.Kruskal(); 
	}
}
