package graph;
import java.util.*;

public class Bfs {

	int v;
	LinkedList<Integer> arr[];
	boolean visited[];
	Bfs(int v){
		
		this.v=v;
	
		visited = new boolean[v];
		arr=new LinkedList[v];
		for(int i=0;i<v;i++) {
			
			arr[i]=new LinkedList<>();
			
		}
		
		}
	public void addEdge(int x,int y) {
		arr[x].add(y);
	}
	public void bfsUtil(int z) {
	LinkedList<Integer>que=new LinkedList<>();
	que.add(z);
	visited[z]=true;
	while(!que.isEmpty()) {
		
		int x=que.poll();
		
		System.out.print(x);
		Iterator<Integer> i=arr[x].listIterator();
		while(i.hasNext()) {
			
		int y= i.next();
			if(!visited[y]) {
				visited[y]=true;
				que.add(y);
			}
		}
	}
		
	}
	
	
	public static void main(String args[]) {
		
		Bfs g = new Bfs(4);
		g.addEdge(0, 1); 
        g.addEdge(0, 2); 
        g.addEdge(1, 2); 
        g.addEdge(2, 0); 
        g.addEdge(2, 3); 
        g.addEdge(3, 3); 
  
        System.out.println("Following is Depth First Traversal "+ 
                           "(starting from vertex 2)"); 
  
        g.bfsUtil(2); 
	}
}
