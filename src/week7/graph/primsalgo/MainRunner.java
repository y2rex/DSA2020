package week7.graph.primsalgo;

	
public class MainRunner 
{
	static int graph[][];
	static int V;
	static boolean[] visited;
	static int key[];
	static int parent[];
	
	
	public static void main(String[] args) 
	{
		graph=new int[][] { 
			{ 0, 2, 0, 6, 0 }, 
            { 2, 0, 3, 8, 5 }, 
            { 0, 3, 0, 0, 7 }, 
            { 6, 8, 0, 0, 9 }, 
            { 0, 5, 7, 9, 0 } 
            }; 
        V=graph.length;    
            
        mst();    
        print();
	}


	private static void print() 
	{
		for(int i=1;i<V;i++)
			System.out.println(i+"---"+parent[i]+" : "+key[i]);
		
	}


	private static void mst() 
	{
		visited=new boolean[V];
		key=new int[V];
		parent=new int[V];
		
		for(int i=0;i<V;i++)
			key[i]=Integer.MAX_VALUE;
		
		parent[0]=-1;
		key[0]=0;
		
		for(int i=0;i<V;i++)
		{
			int u=findMin(key);
			visited[u]=true;
			
			neighbours(u);
		}
		
		
		
	}


	private static void neighbours(int u) 
	{
		for(int v=0;v<V;v++)
		{
			if(graph[u][v]!=0 && !visited[v] && graph[u][v]<key[v])
			{
				parent[v]=u;
				key[v]=graph[u][v];
			}
		}
		
	}


	private static int findMin(int[] key) 
	{
		int node=-1;
		int min=Integer.MAX_VALUE;
		
		for(int i=0;i<V;i++)
		{
			if(key[i]<min && !visited[i])
			{
				node=i;
				min=key[i];
			}
		}
		
		return node;
	}


	
	}
