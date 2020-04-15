package week7.graph.cycledetection.directed;

public class MainRunner {

	public static void main(String[] args) {

		CreateGraph cg=new CreateGraph(2);
		cg.addEdge(0,1);
		cg.addEdge(0,0);
		cg.show();
		
		System.out.println("=============================");
		boolean res=cg.detectCycle(cg.adl);
		System.out.println(res);
	}

}
