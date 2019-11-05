package week7.graph.practice.impl.adjl;

import java.util.ArrayList;

public class Graph 
{

	int v;
	ArrayList<ArrayList<Integer>> adj;
	
	public Graph(int v) 
	{
		this.v=v;
		adj=new ArrayList<>();
	
		for(int i=0;i<=v;i++)
		  adj.add(new ArrayList<>());
	}

	
	public void addEdge(int src, int dest) 
	{	
	if(!adj.get(src).contains(dest))	
		adj.get(src).add(dest);
	if(!adj.get(dest).contains(src))
		adj.get(dest).add(src);	
	}


	public void showGraph() 
	{
		int i=0;
		for(ArrayList<Integer> al : adj)
		{
			if(al.isEmpty()==false)
			{
				System.out.print(i+" : ");
				for(int a : al)
					System.out.print(a+" ");
				System.out.println();
			}
			i++;
		}
	}
}
