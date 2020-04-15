package week8.backtracking.hamiltoniancycle;

public class MainRunner 
{
	static int graph[][];
	static int []path;
	static int V;
	public static void main(String[] args) {
		
		 graph= new int[][]{
			 	{0, 1, 0, 1, 0}, 
	            {1, 0, 1, 1, 1}, 
	            {0, 1, 0, 0, 1}, 
	            {1, 1, 0, 0, 1}, 
	            {0, 1, 1, 1, 0}, 
	        }; 
	        V=graph.length;

		boolean res=isHamiltonial(graph,V);
		System.out.println(res);
		System.out.println("==================");
		showPath();
		
	}

	private static void showPath() {
		for(int a : path)
			System.out.print(a+"->");
		System.out.print(path[0]);
	}

	private static boolean isHamiltonial(int[][] graph, int V) 
	{
		path=new int[V];
		for(int i=0;i<V;i++)
			path[i]=-1;
		path[0]=0;
		
		return hamiltonialUtil(graph,path,1);
	}

	private static boolean hamiltonialUtil(int[][] graph, int[] path, int pos) 
	{
		if(pos==V)
		{
			if(graph[path[pos-1]][path[0]]==1)
				return true;
			else
				return false;
		}
		
		for(int v=1;v<V;v++)
		{
			if(isSafe(graph,path,v,pos))
			{
				path[pos]=v;
				if(hamiltonialUtil(graph, path, pos+1))
					return true;
				path[pos]=-1;
			}
		}
		return false;
	}

	private static boolean isSafe(int[][] graph, int[] path, int v, int pos) 
	{
		if(graph[path[pos-1]][v]==0)
			return false;
		
		for(int i=0;i<pos;i++)
			if(path[i]==v)
				return false;
		
		return true;
	}

}
