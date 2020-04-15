package week7.graph.practice.impl.adjl.weightedundirectgraph;

import java.util.ArrayList;

public class MainRunner {

	int v;
	ArrayList<ArrayList<Node>> adjl;
	
	public MainRunner(int v) 
	{
		this.v=v;
		adjl=new ArrayList<>();
		
		for(int i=0;i<=v;i++)
			adjl.add(new ArrayList<>());
		
	}

	public static void main(String[] args) 
	{
		MainRunner m =new MainRunner(4);
		m.addEdge(1,2,2);
		m.addEdge(1,3,2);
		m.addEdge(1,4,4);
		m.addEdge(3,2,1);
		m.addEdge(3,4,3);
		
		m.showGraph();
	}

	private void showGraph() {
		int i=0;
		for(ArrayList<Node> al : adjl)
		{
			if(al.isEmpty()==false)
				for(Node n : al)
					System.out.println("From "+i+" to "+n.node+" : "+n.cost);
			System.out.println("======================");
			i++;
		}
		
	}

	private void addEdge(int src, int dest, int cost) {
		
		if(!adjl.get(src).contains(new Node(dest, cost)))
			adjl.get(src).add(new Node(dest, cost));
		
		if(!adjl.get(dest).contains(new Node(src, cost)))
			adjl.get(dest).add(new Node(src, cost));
		
		
	}

}
