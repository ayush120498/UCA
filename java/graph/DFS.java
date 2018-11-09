package graph;
import java.util.*;

public class DFS
{
	public static void main(String args[]) 
	{
		Graph.Gr graph=new Graph.Gr(2);
		Graph.addEdge(graph, 0, 1);
		Graph.addEdge(graph, 1, 1);
		Graph.printGraph(graph);
	}
}