package week7.graph.practice.dijkstra.adjl;

import java.util.Comparator;

public class Node implements Comparator<Node>{

	public int node;
	public int cost;
	public Node() {
	}
	
	
	public Node(int node, int cost) {
		this.node = node;
		this.cost = cost;
	}


	
	@Override
	public int compare(Node o1, Node o2) {
		return o1.cost-o2.cost;
	}

}
