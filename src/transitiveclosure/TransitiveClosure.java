package transitiveclosure;
//same as Floyd-Warshall
public class TransitiveClosure {

	public static void main(String[] args) {
		/* Let us create the following weighted graph 
        10 
     (0)------->(3) 
     |         /|\ 
   5 |          | 
     |          | 1 
     \|/        | 
     (1)------->(2) 
        3           */
		
		int graph[][] = { {1, 1, 0, 1}, 
	
                 {0, 1, 1, 0}, 
                 {0, 0, 1, 1}, 
                 {0, 0, 0,1}};
		
		int n=graph.length;
		int g2[][]=new int[n][n];
		
		for (int i = 0; i < g2.length; i++) {
			for(int j=0;j<g2.length;j++)
				g2[i][j]=graph[i][j];
		}
		
		for(int k=0;k<n;k++) {
			for(int i=0;i<n;i++) {
				for(int j=0;j<n;j++) {
					g2[i][j]=(g2[i][j]!=0)||((g2[i][k]!=0)&&g2[k][j]!=0)?1:0;
				}
			}
		}

		for (int i = 0; i < g2.length; i++) {
			for(int j=0;j<g2.length;j++) {
				System.out.print(g2[i][j]);
				
		}
		System.out.println();
		}
	}
}
