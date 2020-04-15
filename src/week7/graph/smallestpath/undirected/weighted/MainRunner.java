package week7.graph.smallestpath.undirected.weighted;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.PriorityQueue;

import week7.graph.dijkstraspractcie.Node;

public class MainRunner {

	public ArrayList<ArrayList<Node>> adj;
	public int v;
	public HashSet<Integer> travelled;
	public int dist[];
	public PriorityQueue<Node> pq;
	
	public MainRunner(int v) {
		this.v=v;
		dist=new int[v];
		travelled=new HashSet<>(v);
		pq=new PriorityQueue<>(v,new Node());
	}
	
	private void dijkstras(int source) {
		
		for(int i=0;i<v;i++)
			dist[i]=Integer.MAX_VALUE;
		
		dist[source]=0;
		pq.add(new Node(source, 0));
		
		while(travelled.size()!=v)
		{
			int u=pq.remove().node;
			travelled.add(u);
			neighbours(u);
		}
		
	}
	
	private void neighbours(int u) 
	{
		for(int i=0;i<adj.get(u).size();i++)
		{
			Node n=adj.get(u).get(i);
		
			if(travelled.contains(n.node)==false)
			{
				int oldPath=dist[n.node];
				int newPath=dist[u]+n.cost;
				
				if(oldPath>newPath)
					dist[n.node]=newPath;
				
				pq.add(new Node(n.node, dist[n.node]));
			}
		}
	}

	private void addEdge(int source, int destination, int cost) 
	{
		if(adj.get(source).contains(new Node(destination, cost))==false)
				adj.get(source).add(new Node(destination, cost));
		
		if(adj.get(destination).contains(new Node(source, cost))==false)
		adj.get(destination).add(new Node(source, cost));
		
	}
	
	public static void main(String[] args) {
		int v=5;
		MainRunner m=new MainRunner(v);
		m.adj=new ArrayList<>();

		for(int i=0;i<v;i++)
			m.adj.add(new ArrayList<>());
		
		m.addEdge(0, 1, 9);
		m.addEdge(0, 2, 6);
		m.addEdge(0, 3, 5);
		m.addEdge(0, 4, 3);
		
		m.addEdge(2,1,2);
		m.addEdge(2,3,4);
		
		
		
		/*m.addEdge(0,1,1);
		m.addEdge(0,2,6);
		m.addEdge(0,6,12);
		m.addEdge(0,5,10);
		
		m.addEdge(1,2,4);
		
		m.addEdge(6,4,12);
		m.addEdge(6,7,5);
		m.addEdge(6,3,18);
		
		m.addEdge(4,7,5);
		m.addEdge(4,3,6);*/
		
		m.showGraph();
		
		int source=0;
		m.dijkstras(source);
		
		m.showShortestPath(source);

	}


	private void showShortestPath(int source)
	{
		for(int i=0;i<v;i++)
			System.out.println("Shortest path from "+source+" to "+i+" is : "+dist[i]);
		
	}

	private void showGraph() {
		int k=0;
		for(ArrayList<Node> al : adj)
		{
			for(Node n : al)
				System.out.println("From "+k+" to "+n.node+" : "+n.cost);
			System.out.println();
			k++;
			System.out.println("--------------------------------------------");
		}
		
	}

	
}