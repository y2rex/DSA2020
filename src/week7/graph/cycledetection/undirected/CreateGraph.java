package week7.graph.cycledetection.undirected;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class CreateGraph {
	
	int v;
	ArrayList<ArrayList<Integer>> adl;
	
	public CreateGraph(int v) 
	{
		this.v=v;
		adl=new ArrayList<>();
		
		for(int i=0;i<v;i++)
			adl.add(new ArrayList<>());
	}

	public void addEdge(int a, int b) {
		
		if(adl.get(a).contains(b)==false)
			adl.get(a).add(b);
		
		if(adl.get(b).contains(a)==false)
			adl.get(b).add(a);
	}

	public void show() {
		if(adl.size()==0)
			System.out.println("Kindly add node(s)!");
		else
		{
			int k=0;
			for(ArrayList<Integer> al : adl){
				System.out.print(k+" : ");
				for(int a : al)
					System.out.print(a+" ");
				System.out.println();
				k++;
			}
		}
		
	}

//**********bfs approach using non-recursive approach******	
	public boolean detectLoop(int source, int parent) 
	{
		Queue<Integer> q=new LinkedList<Integer>();
		boolean visited[]=new boolean[adl.size()];
		
		q.add(source);
		visited[source]=true;
		while(q.isEmpty()==false)
		{
			int head=q.remove();			
			ArrayList<Integer> al=adl.get(head);
			for(int a : al)
			{
				if(visited[a]==true & a!=parent)
					return true;
				
				if(visited[a]==false)
				{
					q.add(a);
					visited[a]=true;
				}
			}
			parent=head;
		}
		return false;
	}

	
//*********dfs approach using recursion********************	
	public boolean detectLoop2(ArrayList<ArrayList<Integer>> adl, boolean[] visited, int source, int parent) {
		visited[source]=true;
		
		for(int a : adl.get(source))
		{
			if(visited[a]==true && parent!=a)
				return true;
			if(visited[a]==false)
			return	detectLoop2(adl,visited, a, source);
		}
		return false;
	}

	
}
