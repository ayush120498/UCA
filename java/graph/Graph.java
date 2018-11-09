package graph;
import java.util.*;
 public class Graph 
{
	static class Gr{
	int v;
	LinkedList<Integer> gr[];
	
	Gr(int v)
	{
		this.v=v;
		gr = new LinkedList[v];
		for(int i=0;i<v;i++) 
		{
			gr[i]=new LinkedList<>();
		}
	}
	
}
	static void addEdge(Gr graph,int src,int dest) 
	{
		graph.gr[src].add(dest);
		graph.gr[dest].add(src);
	}
	
	static void printGraph(Gr graph) 
	{
		for(int i=0;i<graph.v;i++)
		{
			System.out.print("head");
			for(int num:graph.gr[i]) 
			{
				System.out.print("-> ");
				
				System.out.print(num);
			}
			System.out.println();
		}
		
		
	}
	public static void main(String args[]) 
	{
		int v=5;
		Gr graph= new Gr(v);
		addEdge(graph, 0, 1); 
        addEdge(graph, 0, 4); 
        addEdge(graph, 1, 2); 
        addEdge(graph, 1, 3); 
        addEdge(graph, 1, 4); 
        addEdge(graph, 2, 3); 
        addEdge(graph, 3, 4);
        
        printGraph(graph);
        	
		
	}
	
}
