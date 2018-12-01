package graph;
import java.util.*;
public class TopologicalSort {

		int v;
		LinkedList<Integer>adj[];
		
		TopologicalSort(int v){
			
			this.v=v;
			adj= new LinkedList[v];
			for (int i=0; i<v; ++i) 
	            adj[i] = new LinkedList(); 
			
			
		}
		public void addEdge(int src ,int dest) {
			
			adj[src].add(dest);
		}
		
		
		public ArrayList<Integer> topo() {
			
			boolean visited[]=new boolean[v];
			int ind[]=new int[v];
			
			LinkedList<Integer>que=new LinkedList<>();
			for(int i=0;i<v;i++) {
				for(int j=0;j<adj[i].size();j++) {
					int x=adj[i].get(j);
					ind[x]=ind[x]+1;
				}
				
			}
			
			for(int i=0;i<v;i++) {
				
				if(ind[i]==0) {
					que.add(i);
				}
			}
			ArrayList<Integer>result=new ArrayList<Integer>();
			while(!que.isEmpty()) {
				int y=que.poll();
				result.add(y);
				for(int i=0;i<adj[y].size();i++) {
					int n=adj[y].get(i);
					
					if(!visited[n]) {
						ind[n]--;
					}
					if(ind[n]==0) {
						visited[n]=true;
						que.push(n);
						
					}
					
				}
			}
			return result;
		}
		public static void main(String args[]) {
			TopologicalSort g=new TopologicalSort(6);
			g.addEdge(5, 2); 
	        g.addEdge(5, 0); 
	        g.addEdge(4, 0); 
	        g.addEdge(4, 1); 
	        g.addEdge(2, 3); 
	        g.addEdge(3, 1); 
			
			ArrayList<Integer>res=new ArrayList<>();
			res=g.topo();
			System.out.println(res.toString());
		}
}
