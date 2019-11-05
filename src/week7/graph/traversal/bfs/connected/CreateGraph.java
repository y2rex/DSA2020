package week7.graph.traversal.bfs.connected;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class CreateGraph {

	int v;
	ArrayList<ArrayList<Integer>> adjL;
	
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
				
	}

	
	public void bfs(int source) 
	{	
		Queue<Integer> q=new LinkedList<>();
		boolean []visited=new boolean[v];  //array stores "false" by default
		
		/*
		 * ArrayList<Boolean> visited=new ArrayList<>(v);
	       for(int i=0;i<v;i++)
	    	   visited.add(i,false);
	     */
		
		q.add(source);
		visited[source]=true;
		
		while(q.isEmpty()==false)
		{
		   int u=q.remove();
		
		   System.out.print(u+" ");
		   ArrayList<Integer> al=adjL.get(u);

//*****it will give all vertices which is connected with "u".		   
		   for(int b: al)
		   {
			   if(visited[b]==false)
			   {
				   q.add(b);
				   visited[b]=true;
			   }
		   }
		}
		
	}
}

