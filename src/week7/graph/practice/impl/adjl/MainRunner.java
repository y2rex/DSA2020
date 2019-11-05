package week7.graph.practice.impl.adjl;

public class MainRunner {

	public static void main(String[] args) {
		
		Graph g=new Graph(4);
		g.addEdge(1,2);
		g.addEdge(1,3);
		g.addEdge(1,4);
		g.addEdge(2,3);
		g.addEdge(3,4);
		
		g.showGraph();

	}

}
