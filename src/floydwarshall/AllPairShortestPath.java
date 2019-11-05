package floydwarshall;

public class AllPairShortestPath {
	int inf=9999;
	public void floydWarshall(int[][] graph) {
		int v=graph.length;
		int dist[][]=new int[v][v];
		for(int i=0;i<v;i++)
			for (int j = 0; j < v; j++) {
				dist[i][j]=graph[i][j];
			}
		
		for(int k=0;k<v;k++) {
			for(int i=0;i<v;i++) {
				for(int j=0;j<v;j++) {
					if(dist[i][j]>dist[i][k]+dist[k][j])
						dist[i][j]=dist[i][k]+dist[k][j];
				}
			}
		}
		
		for(int i=0;i<v;i++) {
			for(int j=0;j<v;j++) {
				if(dist[i][j]==inf)
					System.out.print("inf " );
				else
					System.out.print(dist[i][j]+" ");
			}
			System.out.println();
		}
		
	}

}
