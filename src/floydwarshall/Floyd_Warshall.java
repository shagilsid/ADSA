package floydwarshall;

public class Floyd_Warshall {
	/*
	 * All Pairs shortest Path 
	 * Takes an intermediate vertex k
	 */
	static int INF=9999;
	public static void main(String[] args) {
		   
	        int graph[][] = { {0,   5,  INF, 10}, 
	                          {INF, 0,   3, INF}, 
	                          {INF, INF, 0,   1}, 
	                          {INF, INF, INF, 0} 
	                        }; 
	        AllPairShortestPath a = new AllPairShortestPath(); 
	  
	        // Print the solution 
	        a.floydWarshall(graph); 

	}

}
