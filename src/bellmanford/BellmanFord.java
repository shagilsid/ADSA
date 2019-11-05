package bellmanford;

import java.util.Scanner;

public class BellmanFord {
	/* Single source shortest path.
	 * Can have negative weight as well.
	 * can detect negative weight cycle as well.
	 * Edges are the main tool here. 
	 * Input number of vertex and number of edges.
	 * Input the source, destination and weight of each edge.
	 * Input source vertex to calculate single source shortest path.*/
	
	static int INF=9999;
	public static void main(String[] args) {
		

        int V = 5; // Number of vertices in graph 
        int E = 8; // Number of edges in graph 
  
        Graph graph = new Graph(V, E); 
  
        // add edge 0-1 (or A-B in above figure) 
        graph.edge[0].src = 0; 
        graph.edge[0].dest = 1; 
        graph.edge[0].weight = -1; 
  
        // add edge 0-2 (or A-C in above figure) 
        graph.edge[1].src = 0; 
        graph.edge[1].dest = 2; 
        graph.edge[1].weight = 4; 
  
        // add edge 1-2 (or B-C in above figure) 
        graph.edge[2].src = 1; 
        graph.edge[2].dest = 2; 
        graph.edge[2].weight = 3; 
  
        // add edge 1-3 (or B-D in above figure) 
        graph.edge[3].src = 1; 
        graph.edge[3].dest = 3; 
        graph.edge[3].weight = 2; 
  
        // add edge 1-4 (or A-E in above figure) 
        graph.edge[4].src = 1; 
        graph.edge[4].dest = 4; 
        graph.edge[4].weight = 2; 
  
        // add edge 3-2 (or D-C in above figure) 
        graph.edge[5].src = 3; 
        graph.edge[5].dest = 2; 
        graph.edge[5].weight = 5; 
  
        // add edge 3-1 (or D-B in above figure) 
        graph.edge[6].src = 3; 
        graph.edge[6].dest = 1; 
        graph.edge[6].weight = 1; 
  
        // add edge 4-3 (or E-D in above figure) 
        graph.edge[7].src = 4; 
        graph.edge[7].dest = 3; 
        graph.edge[7].weight = -3;
        
        System.out.println("Enter source vertex");
        int src=new Scanner(System.in).nextInt();
        
        bellmanFord(graph,src);
	}

	private static void bellmanFord(Graph graph, int src) {
		int V=graph.v;
		int E=graph.e;
		int dist[]=new int[V];
		
		for(int i=0;i<V;i++) {
			dist[i]=9999;
		}
		dist[src]=0;
		
		for(int i=0;i<V;i++) {
			for(int j=0;j<E;j++) {
				int u=graph.edge[j].src;
				int v=graph.edge[j].dest;
				int weight=graph.edge[j].weight;
				if(dist[u]!=9999 && dist[u]+weight<dist[v]) {
					dist[v]=dist[u]+weight;
				}
			}
		}
		
		for(int j=0;j<E;j++) {
			int u=graph.edge[j].src;
			int v=graph.edge[j].dest;
			int weight=graph.edge[j].weight;
			if(dist[u]!=9999 && dist[u]+weight<dist[v]) {
				System.out.println("Negative weight cycle found");
				break;
			}
		}
		
		for(int i=0;i<V;i++) {
			System.out.println(i + "\t\t" + dist[i]); 
		}
	}
		
	}

