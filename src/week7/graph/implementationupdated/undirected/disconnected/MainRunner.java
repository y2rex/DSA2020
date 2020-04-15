package week7.graph.implementationupdated.undirected.disconnected;

public class MainRunner {

	public static void main(String[] args) {
		CreateGraph cg=new CreateGraph(9);
		
		cg.addNode(0, 1);
		cg.addNode(0, 2);
		cg.addNode(1, 3);
		cg.addNode(1, 4);
		//cg.addNode(2, 4);  //comments this line then see DFS traversal for better understanding
		cg.addNode(2, 5);
		cg.addNode(2, 6);
		cg.addNode(3, 4);
		cg.addNode(5, 6);
		
		cg.addNode(7, 8);
		
 		cg.showAll();
		System.out.println("==============================");
 		System.out.print("BFS traversal : ");
		cg.bfsTraversal(cg.adl,2);
		System.out.println("\n==============================");
 		System.out.print("DFS traversal : ");
		cg.dfsTraversal(cg.adl,2);
		
	}

}
