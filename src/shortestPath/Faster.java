package shortestPath;
//
public class Faster {
	static int inf=999;
	public static void main(String[] args) {
		int mat[][]= {{0,5,inf,5},{inf,0,2,1},
				{3,inf,0,inf},
				{inf,inf,1,0}};
		int n=mat.length;
		ExtendedShortest ex=new ExtendedShortest();
		int m=1;
		while(m<n) {
			mat=ex.getExtended(mat, n);
			m=2*m;
		}
		
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				System.out.print(mat[i][j]+" ");
			}
			System.out.println();
		}

	}

}
