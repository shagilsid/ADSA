package bellmanford;

public class Graph {
	int v,e;
	Edge edge[];
	
	public Graph(int v,int e) {
		this.v=v;
		this.e=e;
		edge=new Edge[e];
		for (int i = 0; i < e; i++) {
			edge[i]=new Edge();
		}
	}
	
	

}
