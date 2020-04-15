package week7.graph.smallestpath.undirected.weighted;

import java.util.Comparator;

public class Node implements Comparator<Node>
{
	public int node;
	public int cost;
	
	public Node() {
		// TODO Auto-generated constructor stub
	}

	public Node(int node,int cost) {
		this.node = node;
		this.cost = cost;
	}
	
	public int getNode(){
		return node;
	}

	@Override
	public int compare(Node a, Node b) {
		return a.cost-b.cost;
	}
	
	
}
