package topologicalsort;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.Stack;

public class Graph {
	int V;
	LinkedList<Integer> adj[];
	
	public Graph(int v) {
		V=v;
		adj=new LinkedList[V];
		for (int i = 0; i < adj.length; i++) {
			adj[i]=new LinkedList<Integer>();
		}
	}
	
	void addEdge(int u,int v) {
		adj[u].add(v);
	}
	
	
	void topologicalSort() {
		Stack<Integer> stack=new Stack<Integer>();
		boolean[] visited=new boolean[V];
		
		for(int i=0;i<V;i++) {
			if(!visited[i]) {
				sort(i,visited,stack);
			}
		}
		
		while(!stack.isEmpty()) {
			System.out.println(stack.pop()+" ");
		}
	}
	
	// Main sorting method
	private void sort(int v, boolean[] visited, Stack<Integer> stack) {
		visited[v]=true;
		
		Iterator<Integer> it=adj[v].iterator();
		while(it.hasNext()) {
			Integer i=it.next();
			if(!visited[i])
				sort(i,visited,stack);
		}
		//push vertex after visiting all the adjacent vertices.
		stack.push(v);
		
	}
	
	public static void main(String[] args) {
		System.out.println("Enter number of vertices");
		int n=new Scanner(System.in).nextInt();
		
		Graph g = new Graph(6); 
        g.addEdge(5, 2); 
        g.addEdge(5, 0); 
        g.addEdge(4, 0); 
        g.addEdge(4, 1); 
        g.addEdge(2, 3); 
        g.addEdge(3, 1); 
  
        System.out.println("Following is a Topological " + 
                           "sort of the given graph"); 
        g.topologicalSort(); 
	}
}
