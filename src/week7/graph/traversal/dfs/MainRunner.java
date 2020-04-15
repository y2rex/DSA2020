package week7.graph.traversal.dfs;


public class MainRunner {

	public static void main(String[] args) {
		
		CreateGraph cg=new CreateGraph(5);	
		boolean visited[]=new boolean[cg.adjL.size()];
		cg.dfs(cg.adjL, 0, visited);
		
		System.out.println("\n======================================");
		boolean visited1[]=new boolean[cg.adjL.size()];
		cg.dfs2(0,visited1);
	}

}
