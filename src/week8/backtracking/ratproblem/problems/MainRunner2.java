//**********recursive approach******if you can move forward or downward

package week8.backtracking.ratproblem.problems;

public class MainRunner2 {

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
		return costutil(maze,2,2);	
	}
	
	private static int costutil(int[][] maze, int x, int y) 
	{
		if(x<0 || y< 0)
			return Integer.MAX_VALUE;
		
		else if(x==0 && y==0)
			return maze[x][y];
		
		else
			return maze[x][y]+Integer.min(costutil(maze, x-1, y), costutil(maze, x, y-1));	
	}
}
