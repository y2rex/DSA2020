package week7.graph.implementationupdated.undirected.connected;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class CreateGraph 
{
	int v;
	ArrayList<ArrayList<Integer>> adl;
	
	public CreateGraph(int x) 
	{
		v=x;
		adl=new ArrayList<ArrayList<Integer>>(v);  // we specify the capacity of arraylist
		
		for(int i=0;i<v;i++)		//don't use "adl.size()" instead of "v" it will give error 
			adl.add(new ArrayList<Integer>());
	}
	
	public void addNode(int a, int b) {
		if(adl.get(a).contains(b)==false)
			adl.get(a).add(b);
		if(adl.get(b).contains(a)==false)
			adl.get(b).add(a);	
	}

	public void showAll() 
	{
		if(adl.size()==0)
			System.out.println("Kindly add node(s) in graph! ");
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

	public void bfs(ArrayList<ArrayList<Integer>> adl, int source) {
		
		Queue<Integer> q=new LinkedList<Integer>();
		boolean[] visited=new boolean[adl.size()];
		
		q.add(source);
		visited[source]=true;
		
		while(q.isEmpty()==false){
			int head=q.remove();
			System.out.print(head+" ");
			
			ArrayList<Integer> al=adl.get(head);
			for(int a : al)
			{
				if(visited[a]==false)
				{
					q.add(a);
					visited[a]=true;
				}
			}
		}
		
	}
	
//***************using Stack**************************
	public void dfs(ArrayList<ArrayList<Integer>> adl, int source) {
		
		Stack<Integer> s=new Stack<>();
		boolean [] visited=new boolean[adl.size()];
		s.push(source);
		
		visited[source]=true;
		
		while(s.isEmpty()==false)
		{
			int u=s.pop();
			System.out.print(u+" ");
			
			ArrayList<Integer> al=adl.get(u);
			for(int a : al){
				if(visited[a]==false)
				{
					s.push(a);
					visited[a]=true;
				}
			}
		}
		
	}

//*********DFS using recursion******************	
	public void dfs2(ArrayList<ArrayList<Integer>> adl, int source, boolean[] visited) {
		
		visited[source]=true;
		System.out.print(source+" ");
		
		for(int i=source;i<adl.size();i++)
		{
		ArrayList<Integer> al=adl.get(i);
			for(int a : al)
				if(visited[a]==false)
					dfs2(adl, a, visited);
		}
	}
}