//**********DP approach******if you can move forward or downward

package week8.backtracking.ratproblem.problems;

public class MainRunner3 {

	static int n;
	public static void main(String[] args) {
		
		int maze[][]=
			{ {1, 2, 3}, 
              {4, 8, 2}, 
              {1, 5, 3} 
	        };
		n=maze.length;
		
		int cost=findMinCost(maze);
		System.out.println(cost);
	}
	private static int findMinCost(int[][] maze) 
	{	
		int cost[][]=new int[n][n];
		return costutil(maze,cost,2,2);	
	}
	
	private static int costutil(int[][] maze, int[][] cost, int x, int y) 
	{
		int r=0;
		for(int i=0;i<n;i++)
		{
			r=r+maze[0][i];
			cost[0][i]=r;
		}
		
		int c=0;
		for(int i=0;i<n;i++)
		{
			c=c+maze[i][0];
			cost[i][0]=c;
		}
			
		for(int i=1;i<n;i++)
			for(int j=1;j<n;j++)
				cost[i][j]=Integer.min(cost[i-1][j], cost[i][j-1])+maze[i][j];
		
		return cost[x][y];
	}
}
