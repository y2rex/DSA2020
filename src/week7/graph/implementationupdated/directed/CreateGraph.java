package week7.graph.implementationupdated.directed;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class CreateGraph 
{
	ArrayList<ArrayList<Integer>> adl;
	int v;
	
	public CreateGraph(int v) {
	this.v=v;
	adl=new ArrayList<>();
	
	for(int i=0;i<v;i++)
		adl.add(new ArrayList<>());
	}

	public void addEdge(int x, int y) {
		adl.get(x).add(y);
	}

	public void showAll() {
		if(adl.size()==0)
			System.out.println("Kindly add node(s) to graph!");
		else{
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

	public void bfs(ArrayList<ArrayList<Integer>> adl, int source) {
		Queue<Integer> q=new LinkedList<>();
		boolean visited[]=new boolean[adl.size()];
		
		q.add(source);
		visited[source]=true;
		
		while(q.isEmpty()==false)
		{
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

	public void dfs(ArrayList<ArrayList<Integer>> adl, int source) {
		Stack<Integer> st=new Stack<>();
		boolean visited[]=new boolean[adl.size()];
		
		st.push(source);
		visited[source]=true;
		
		while(st.isEmpty()==false){
			int head=st.pop();
			System.out.print(head+" ");
			
			ArrayList<Integer> al=adl.get(head);
			
			for(int a : al)
			{
				if(visited[a]==false){
					st.push(a);
					visited[a]=true;
				}
			}
		}
		
	}
	
}