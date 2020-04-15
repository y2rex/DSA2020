package week7.graph.traversal.dfs;

import java.util.ArrayList;
import java.util.Stack;

public class CreateGraph {

	int v;
	ArrayList<ArrayList<Integer>> adjL;
	//boolean []visited; 
	
	public CreateGraph(int a) 
	{

		v=a;		
		adjL=new ArrayList<>(v); 
		//visited=new boolean[v];

		for(int i=0;i<v;i++)
			adjL.add(new ArrayList<Integer>());

				adjL.get(0).add(1);
				adjL.get(0).add(2);

				adjL.get(1).add(0);
				adjL.get(1).add(3);
				adjL.get(1).add(4);
		
				adjL.get(2).add(0);
		
				adjL.get(3).add(1);
				adjL.get(3).add(4);
				
				adjL.get(4).add(1);
				adjL.get(4).add(3);
				
	}

	
	public void dfs(ArrayList<ArrayList<Integer>> adj, int source, boolean[] visited) {
		
		visited[source]=true;
		System.out.print(source+" ");
		
		for(int i=source;i<v;i++)
		{
			ArrayList<Integer> al=adj.get(i);
			
			for(int a : al)
				if(visited[a]==false)
					 dfs(adj,a,visited);		 
		}	
	}


	
//	 *******************Without recursion(Using Stack)**************** 
	 
	   public void dfs2(int source, boolean[] visited) {
		Stack<Integer> s=new Stack<>();
		s.push(source);
		
		while(s.isEmpty()==false)
		{
			int u=s.pop();
			if(visited[u]==false)
			{
				System.out.print(u+" ");
				visited[u]=true;	
			}	
			
			ArrayList<Integer> al=adjL.get(u);
			for(int a:al)
			{
				if(visited[a]==false)
					s.push(a);
			}
			
		  }
		}
}