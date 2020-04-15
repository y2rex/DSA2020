package week7.graph.dijkstras;

import java.util.*;


public class MainRunner {
	private int dist[];				
	
    private Set<Integer> settled;  //for traversed node
    
    private PriorityQueue<Node> pq; 
    
    private int V;
    ArrayList<ArrayList<Node> > adj; 	//graph
  
     public MainRunner(int V) 
    { 
        this.V = V; 
        dist = new int[V]; 
        
        settled = new HashSet<Integer>(); 
        pq = new PriorityQueue<Node>(V, new Node()); 
    } 
  
 
    public void dijkstra(ArrayList<ArrayList<Node> > adj, int src) 
    { 
        this.adj = adj; 
  
        for (int i = 0; i < V; i++) 
            dist[i] = Integer.MAX_VALUE; 
  
        dist[src] = 0; 
        pq.add(new Node(src, 0)); 
  
        while (settled.size() != V) 
        { 
            int u = pq.remove().node; //remove that node whose cost is minimum
            System.out.println("===============");
            System.out.println(u);
            System.out.println("===============");
            settled.add(u); 
            e_Neighbours(u); 
        } 
    } 
 
    private void e_Neighbours(int u) 
    { 
        for (int i = 0; i < adj.get(u).size(); i++) 
        { 
            Node v = adj.get(u).get(i); 
  
            if (!settled.contains(v.node)) 
            { 
                if ((dist[u] + v.cost) < dist[v.node]) 
                    dist[v.node] = dist[u] + v.cost; 
  
                pq.add(new Node(v.node, dist[v.node])); 
            } 
        } 
        System.out.println("====queue=============");
        for(Node n : pq)
        	System.out.println(n.node+"=>"+n.cost);
        
    } 
  
    public static void main(String arg[]) 
    { 
    	int V=8;
		MainRunner m=new MainRunner(V);
		ArrayList<ArrayList<Node>> adj=new ArrayList<>();
		
		for(int i=0;i<V;i++)
			adj.add(new ArrayList<>());
		
		adj.get(0).add(new Node(1, 1));
		adj.get(0).add(new Node(2, 6));
		adj.get(0).add(new Node(6, 12));
		adj.get(0).add(new Node(5, 10));
		
		adj.get(1).add(new Node(2, 4));
		
		adj.get(6).add(new Node(4, 12));
		adj.get(6).add(new Node(7, 5));
		adj.get(6).add(new Node(3, 18));
		
		adj.get(7).add(new Node(4, 5));
		
		adj.get(4).add(new Node(3, 6));
		
		m.dijkstra(adj,0);
  
		for(int i=0;i<adj.size();i++)
			System.out.println("Distance from 0 to "+i+" is : "+m.dist[i]);
    } 
} 
