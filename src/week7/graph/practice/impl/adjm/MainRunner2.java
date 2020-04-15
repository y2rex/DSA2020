//weighted undirected graph

package week7.graph.practice.impl.adjm;

public class MainRunner2 {

	public static void main(String[] args) {
	
		int g[][]=
		{
				{0,0,0,0,0},
				{0,0,2,2,4},
				{0,2,0,1,0},
				{0,2,1,0,3},
				{0,4,0,3,0},
		};
		
		MainRunner2 m=new MainRunner2();
		m.showGraph(g,g.length);

	}

	private void showGraph(int[][] graph, int n) 
	{
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				if(graph[i][j]!=0)
					System.out.println("from "+i+" to "+j+" : "+graph[i][j]);
			}
			System.out.println("=============================================");
		}
		
	}

}
