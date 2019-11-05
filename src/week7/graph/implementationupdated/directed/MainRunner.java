package week7.graph.implementationupdated.directed;

public class MainRunner {

	public static void main(String[] args) {
		CreateGraph cg=new CreateGraph(4);
		cg.addEdge(0,1);
		cg.addEdge(0,2);
		cg.addEdge(1,2);
		cg.addEdge(2,3);
		cg.addEdge(2,0);
		cg.addEdge(3,3);
				
		cg.showAll();
		System.out.println("==========================");
		cg.bfs(cg.adl,2);		//cg.bfs(cg.adl,0);
		System.out.println("\n==========================");
		cg.dfs(cg.adl,2);		//cg.dfs(cg.adl,0);
	}

}
