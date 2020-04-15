package week7.graph.smallestpath.directed;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.PriorityQueue;

public class MainRunner 
{
	public int v;
	public ArrayList<ArrayList<Node>> adj;
	public int dist[];
	public HashSet<Integer> travelled;
	public PriorityQueue<Node> pq;
	
	public MainRunner(int v) 
	{
		this.v=v;
		travelled=new HashSet<>(v);
		dist=new int[v];
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
			
			if(travelled.contains(n)==false)
			{
				int oldDistance=dist[n.node];
				int newDistance=dist[u]+n.cost;
				
				if(oldDistance>newDistance)
					dist[n.node]=newDistance;
				pq.add(new Node(n.node, dist[n.node]));
			}
		}
		
	}

	public static void main(String[] args) 
	{
		int v=5;
		MainRunner m=new MainRunner(v);
		m.adj=new ArrayList<>();
		
		for(int i=0;i<v;i++)
			m.adj.add(new ArrayList<>());
		
		m.addEdge(0,1,9);
		m.addEdge(0,2,6);
		m.addEdge(0,3,5);
		m.addEdge(0,4,3);
		
		m.addEdge(1,2,2);
		m.addEdge(2,3,4);
		
		m.showGraph();
		
		int source=0;
		m.dijkstras(source);
		
		m.showShortestPath(source);
	}

	private void showShortestPath(int source) {
		for(int i=0;i<v;i++)
			System.out.println("Ditance from "+source+" to "+i+" is : "+dist[i]);
		
	}

	private void showGraph() 
	{
		int k=0;
		for(ArrayList<Node> al : adj)
		{
			for(Node n : al)				
				System.out.println("Distance from "+k+" to "+n.node+" is : "+n.cost);
			
			if(al.size()!=0)
				System.out.println("---------------------------------------------------");
			k++;
		}
		
	}

	private void addEdge(int source, int destination, int cost) {
		adj.get(source).add(new Node(destination, cost));
		
	}

}
