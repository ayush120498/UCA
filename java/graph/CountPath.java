package graph;
import java.util.*;

public class CountPath {
	      
	    // No. of vertices 
	    private int V;  
	  
	    // Array of lists for 
	    // Adjacency List  
	    // Representation 
	    private LinkedList<Integer> adj[]; 
	  
	    
	    CountPath(int v)  
	    { 
	        V = v; 
	        adj = new LinkedList[v]; 
	        for (int i = 0; i < v; ++i) 
	            adj[i] = new LinkedList<>(); 
	    } 
	  
	    void addEdge(int v, int w) 
	    { 
	           
	        adj[v].add(w);  
	    } 
	  
	      
	    // A recursive method to count 
	    // all paths from 'u' to 'd'. 
	    int countPathsUtil(int u, int d, 
	                    boolean visited[],  
	                    int pathCount) 
	    {
	    	visited[u]=true;
	       if(u==d) {
	    	   
	    	   pathCount++;
	       }
	       
	       else {
	    	 
	    	   Iterator<Integer>itr=adj[u].listIterator();
	    	   while(itr.hasNext()) {
	    		   int x= itr.next();
	    		   if(!visited[x]) {
	    			   pathCount = countPathsUtil(x,d,visited,pathCount);
	    		   }
	    		   
	    	   }
	    	   
	       }
	       visited[u]=false;
	       
	       return pathCount;
	        
	    } 
	  
	    int countPaths(int s, int d) 
	    { 
	          
	        
	        boolean visited[] = new boolean[V]; 
	        Arrays.fill(visited, false); 
	  
	       
	        int pathCount = 0; 
	        pathCount = countPathsUtil(s, d, 
	                                visited,  
	                                pathCount); 
	        return pathCount; 
	    } 
	  
	    // Driver Code 
	    public static void main(String args[])  
	    { 
	        CountPath g = new CountPath(4); 
	        g.addEdge(0, 1); 
	        g.addEdge(0, 2); 
	        g.addEdge(0, 3); 
	        g.addEdge(2, 0); 
	        g.addEdge(2, 1); 
	        g.addEdge(1, 3); 
	  
	        int s = 2, d = 3; 
	        System.out.println(g.countPaths(s, d)); 
	    } 
	} 
	  


