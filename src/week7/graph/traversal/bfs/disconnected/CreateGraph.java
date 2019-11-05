package week7.graph.traversal.bfs.disconnected;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class CreateGraph {

	int v;
	ArrayList<ArrayList<Integer>> adjL;
	boolean []visited; 
	
	public CreateGraph(int a) {

		v=a;		
		adjL=new ArrayList<>(v); 

		for(int i=0;i<v;i++)
			adjL.add(new ArrayList<Integer>());

				adjL.get(0).add(1);
				adjL.get(0).add(2);

				adjL.get(1).add(0);
				adjL.get(1).add(3);
				adjL.get(1).add(4);
		
				adjL.get(2).add(0);
				adjL.get(2).add(4);
				adjL.get(2).add(5);
				adjL.get(2).add(6);
		
				adjL.get(3).add(1);
				adjL.get(3).add(4);
				
				adjL.get(4).add(1);
				adjL.get(4).add(2);
				adjL.get(4).add(3);
				
				adjL.get(5).add(2);
				adjL.get(5).add(6);
				
				adjL.get(6).add(2);
				adjL.get(6).add(5);
				
				adjL.get(7).add(8);
				
				adjL.get(8).add(7);
				
	}

	
	public void bfs(int source) {
		
		visited=new boolean[v];  
		
		for(int i=source;i<v;i++)
		{
		 if(visited[i]==false)
			 subBFS(adjL,i,visited);
		}	
	}


	private void subBFS(ArrayList<ArrayList<Integer>> adjL2, int source, boolean[] visited) {
		
		Queue<Integer> q=new LinkedList<>();
		q.add(source);
		visited[source]=true;
		
		while(q.isEmpty()==false){
			int u=q.remove();
			System.out.print(u+" ");
			
			ArrayList<Integer> al=adjL2.get(u);
			for(int a :al)
			{
				if(visited[a]==false)
				{
					q.add(a);
					visited[a]=true;
				}
			}	
		}		
	}
}