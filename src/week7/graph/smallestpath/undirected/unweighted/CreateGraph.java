package week7.graph.smallestpath.undirected.unweighted;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class CreateGraph 
{
	int v;
	ArrayList<ArrayList<Integer>> adjL;
	//boolean []visited;   here we don't need visited array, we can use dist[] array
	int dist[];
	
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

	
	public void shortestPath(int source) 
	{
		dist=new int[v];
		Arrays.fill(dist, -1); //start all element with -1
		
		dist[source]=0;
		Queue<Integer> q=new LinkedList<>();
		q.add(source);
		
		while(q.isEmpty()==false)
		{
			int u=q.remove();
			
			ArrayList<Integer> al=adjL.get(u);
			for(int a :al)
			{
				if(dist[a]==-1)
				{
					dist[a]=dist[u]+1;
					q.add(a);
				}
			}	
		}		
	}
}