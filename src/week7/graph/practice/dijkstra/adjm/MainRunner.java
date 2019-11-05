package week7.graph.practice.dijkstra.adjm;

class MainRunner 
{ 
	static int V=9; 
	boolean visited[];
	int[] dist;
	int source;
	
	int minDistance() 
	{ 
		int min = Integer.MAX_VALUE;
		int node=source; 

		for (int v = 0; v < V; v++) 
		{
			if (visited[v] == false && dist[v] <= min) 
			{ 
				min = dist[v]; 
				node = v; 
			} 
		}
			

		return node; 
	} 
 

	void dijkstra(int graph[][], int src) 
	{ 
		this.source=src;
		dist = new int[V]; 
		visited= new boolean[V];				//by default false
				
		for (int i = 0; i < V; i++) 			//Initializing all vertices with infinity
			dist[i] = Integer.MAX_VALUE; 

		dist[src] = 0; 

		for (int count = 0; count < V; count++) 
		{ 
			int node = minDistance(); 
			visited[node] = true; 
			nebighours(graph,node);
		}
	} 

	 
	private void nebighours(int[][] graph, int u) 
	{
		for(int i=0;i<V;i++)
		{
			int oldDistance=dist[i];
			int newDistance=dist[u]+graph[u][i];
			
			if(!visited[i] && graph[u][i]!=0 && newDistance<oldDistance)
				dist[i]=newDistance;
		}
	}


	public static void main (String[] args) 
	{ 
		
	int graph[][] = new int[][]{
								{0, 4, 0, 0, 0, 0, 0, 8, 0}, 
								{4, 0, 8, 0, 0, 0, 0, 11, 0}, 
								{0, 8, 0, 7, 0, 4, 0, 0, 2}, 
								{0, 0, 7, 0, 9, 14, 0, 0, 0}, 
								{0, 0, 0, 9, 0, 10, 0, 0, 0}, 
								{0, 0, 4, 14, 10, 0, 2, 0, 0}, 
								{0, 0, 0, 0, 0, 2, 0, 1, 6}, 
								{8, 11, 0, 0, 0, 0, 1, 0, 7}, 
								{0, 0, 2, 0, 0, 0, 6, 7, 0} 
								}; 
		MainRunner t = new MainRunner(); 
		t.dijkstra(graph, 0); 
		t.showDistance();
		
	}


	private void showDistance() 
	{
		for(int i=0;i<V;i++)
			System.out.println("From 0 to "+i+" : "+dist[i]);
		
	} 
} 