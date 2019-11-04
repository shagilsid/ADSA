package shortestPath;
//
public class ExtendedShortest {
	public static int inf=9999;
	public int[][] getExtended(int[][] mat, int n) {
		int [][] l1=new int[n][n];
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				l1[i][j]=inf;
				for(int k=0;k<n;k++) {
					l1[i][j]=Math.min(l1[i][j], mat[i][k]+mat[k][j]);
				}
			}
		}
		return l1;
	}
	
	

}
