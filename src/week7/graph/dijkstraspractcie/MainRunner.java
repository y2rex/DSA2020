package week7.graph.dijkstraspractcie;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.PriorityQueue;


public class MainRunner 
{
	ArrayList<ArrayList<Node>> adj;
	int V;
	int[] dist;
	HashSet<Integer> travelled;
	PriorityQueue<Node> pq;
	
	 MainRunner(int V) 
	 {
		this.V=V;
		dist=new int[V];
		travelled=new HashSet<>(V);
		pq=new PriorityQueue<>(V,new Node());
		
	}
	
	 private void dijkstras(ArrayList<ArrayList<Node>> adj, int source) 
	 {
			this.adj=adj;
			
			for(int i=0;i<V;i++)
				dist[i]=Integer.MAX_VALUE;
			
			dist[source]=0;
			pq.add(new Node(source, 0));
			
			while(travelled.size()!=V)
			{
				int u=pq.remove().node;  //it will remove smallest element base on cost
				travelled.add(u);
				nebighours(u);	
			}
		}
	 
	 private void nebighours(int u) 
	 {
		for(int i=0;i<adj.get(u).size();i++)
		{
			Node n=adj.get(u).get(i);
			
			int oldDistance=dist[n.node];
			int newDistance=dist[u]+n.cost;
			
			if(travelled.contains(n.node)==false)  //keep focus on node's cost & node's node
			{
				if(oldDistance>newDistance)
					dist[n.node]=newDistance;
		
				pq.add(new Node(n.node, dist[n.node]));
			}
		}
		
	}

	public static void main(String[] args) 
	{
		int V=5;
		MainRunner m=new MainRunner(V);
		ArrayList<ArrayList<Node>> adj=new ArrayList<>();
		
		for(int i=0;i<V;i++)
			adj.add(new ArrayList<>());
		
		adj.get(0).add(new Node(1, 9));
		adj.get(0).add(new Node(2, 6));
		adj.get(0).add(new Node(3, 15));
		adj.get(0).add(new Node(4, 3));
		
		adj.get(1).add(new Node(2, 2));
		adj.get(2).add(new Node(3, 4));
		
		m.dijkstras(adj,0);

		for(int i=0;i<adj.size();i++)
			System.out.println("Distance from 0 to "+i+" is : "+m.dist[i]);
	}
}
