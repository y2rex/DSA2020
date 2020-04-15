package week7.graph.cycledetection.directed;

import java.util.ArrayList;

public class CreateGraph 
{
	
	int v;
	ArrayList<ArrayList<Integer>> adl;
	
	public CreateGraph(int v) {
		this.v=v;
		adl=new ArrayList<>();
		
		for(int i=0;i<v;i++)
			adl.add(new ArrayList<>());
	}

	public void addEdge(int a, int b) {
		adl.get(a).add(b);
		
	}

	public void show() {

		if(adl.size()==0)
			System.out.println("Kindly add node(s)!");
		else
		{
			int k=0;
			for(ArrayList<Integer> al : adl)
			{
				System.out.print(k+" : ");
				for(int a : al)
					System.out.print(a+" ");
				System.out.println();
				k++;
			}
		}
		
	}

	public boolean detectCycle(ArrayList<ArrayList<Integer>> adl) {
		
		boolean visited[]=new boolean[adl.size()];
		boolean ancestors[]=new boolean[adl.size()];
		
		for(int i=0;i<adl.size();i++)
		{
			if(visited[i]==false)
				return isCycle(adl,visited,ancestors,i);
		}
		
		return false;
	}

	private boolean isCycle(ArrayList<ArrayList<Integer>> adl, boolean[] visited, boolean[] ancestors, int source) 
	{
	
		visited[source]=true;
		ancestors[source]=true;
		
		for(int a : adl.get(source))
		{
			if(visited[a]==true && ancestors[a]==true)
				return true;
			
			if(visited[a]==false && isCycle(adl, visited, ancestors, a))
				return true;
		}
		ancestors[source]=false;
		return false;
	}
}
