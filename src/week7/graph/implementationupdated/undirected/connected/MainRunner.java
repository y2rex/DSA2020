package week7.graph.implementationupdated.undirected.connected;

public class MainRunner {

	public static void main(String[] args) {
		CreateGraph cg=new CreateGraph(7);
		
		cg.addNode(0, 1);
		cg.addNode(0, 2);
		cg.addNode(1, 3);
		cg.addNode(1, 4);
		cg.addNode(2, 4);  //comments this line then see DFS traversal for better understanding
		cg.addNode(2, 5);
		cg.addNode(2, 6);
		cg.addNode(3, 4);
		cg.addNode(5, 6);
		
 		cg.showAll();
		System.out.println("==============================");
 		System.out.print("BFS traversal : ");
		cg.bfs(cg.adl,0);

//we can implement DFS using two ways : 1.Recursion 2.Stack		
		System.out.println("\n==============================");
 		System.out.print("DFS traversal : ");
		cg.dfs(cg.adl,0);
		

		System.out.println();
		boolean[] visited=new boolean[7];
		cg.dfs2(cg.adl,0,visited);
		
	}

}
