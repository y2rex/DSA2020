package week7.graph.cycledetection.undirected;

public class MainRunner {

	public static void main(String[] args) {
		CreateGraph cg=new CreateGraph(4);
		cg.addEdge(0,1);
		cg.addEdge(1,2);
		cg.addEdge(1,3);
		cg.addEdge(3,2);
		
		cg.show();
		System.out.println("=======================");
		boolean res=cg.detectLoop(0,-1);
		System.out.println(res);
		System.out.println("=======================");
		boolean res1=cg.detectLoop2(cg.adl,new boolean[cg.adl.size()],0,-1);
		System.out.println(res1);
	}

}
