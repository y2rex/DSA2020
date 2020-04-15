package week7.graph.practice.impl.adjm;

public class MainRunner {

	public static void main(String[] args) {
	
		int g[][]=
		{
				{0,0,0,0,0},
				{0,0,1,1,1},
				{0,1,0,1,0},
				{0,1,1,0,1},
				{0,1,0,1,0},
		};
		
		MainRunner m=new MainRunner();
		m.showGraph(g,g.length);

	}

	private void showGraph(int[][] graph, int n) 
	{
		for(int i=0;i<n;i++)
		{
			System.out.print(i+ " : ");
			for(int j=0;j<n;j++)
			{
				if(graph[i][j]!=0)
					System.out.print(j +" ");
			}
			System.out.println();
		}
		
	}

}
