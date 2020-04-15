//shortest distance with path

package week7.graph.practice.dijkstra.adjl;

import java.util.ArrayList;


public class MainRunner 
{
	static ArrayList<ArrayList<Node>> adj;
	int V;
	static int[] dist;
	boolean visited[];
	int source;
	MainRunner(int V) 
	 {
		this.V=V;
		dist=new int[V];
		visited=new boolean[V];			//by default false
		
		for(int i=0;i<V;i++)			//initializing all vertices with infinity
			dist[i]=Integer.MAX_VALUE;
		
		
		adj=new ArrayList<>();
		for(int i=0;i<V;i++)
			adj.add(new ArrayList<>());
	}
	
	 private void dijkstras(int src) 
	 {
		 this.source=src;
		 
			dist[src]=0;
			visited[src]=true;
			neighbours(src);
			
			for(int i=1;i<V;i++)
			{
				int node=minimum();
				neighbours(node);
				visited[node]=true;
				
			}
	 }
	
	 private void neighbours(int u) 
		{
			ArrayList<Node> al=adj.get(u);
			for(Node n : al)
			{	
				int oldDistance=dist[n.node];
				int newDistance=dist[u]+n.cost;
				
				if(visited[n.node]==false && newDistance<oldDistance)
						dist[n.node]=newDistance;
			}
			
		} 
	

	private int minimum() 
	{
		int node=source;
		int min=Integer.MAX_VALUE;
		
		for(int i=0;i<V;i++)
		{
			if(visited[i]==false)
			{
				if((dist[i]<min))
				{
					min=dist[i];
					node=i;
				}
			}
		}
		return node;
	}


	public static void main(String[] args) 
	{
		int V=5;
		MainRunner m=new MainRunner(V);
		
		addEdge(0,1,9);
		addEdge(0,2,10);
		addEdge(0,3,15);
		addEdge(0,4,3);
		addEdge(1,2,2);
		addEdge(2,3,4);
		
		m.dijkstras(0);
		
		showDistance();
	}

	private static void addEdge(int src, int dest, int cost) 
	{
			adj.get(src).add(new Node(dest, cost));	
	}

	private static void showDistance() {
		for(int i=0;i<adj.size();i++)
		{
			if(dist[i]==Integer.MAX_VALUE)
				dist[i]=-1;
			System.out.println("Distance from 0 to "+i+" is : "+dist[i]);
		}
	}
}
