package week7.graph.smallestpath.undirected.unweighted;

//*****there is disconnected graph***************
public class MainRunner {

	public static void main(String[] args) {
		
		CreateGraph cg=new CreateGraph(9);	
		cg.shortestPath(0);
		
		for(int i=0;i<cg.adjL.size();i++)
			System.out.println("Shortest Distance from "+0+" to "+i+" is : "+cg.dist[i]);
	}

}
