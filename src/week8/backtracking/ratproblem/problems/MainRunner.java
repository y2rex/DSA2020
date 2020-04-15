//***path if multiple jumps available***********

package week8.backtracking.ratproblem.problems;

public class MainRunner {

	static int n;
	public static void main(String[] args) {
		
		int maze[][]=
			{ {2, 1, 0, 0},
	          {3, 0, 0, 1},
	          {0, 1, 0, 1},
	          {0, 0, 0, 1}
	        };
		n=maze.length;
		
		boolean res=ratJump(maze);
		System.out.println(res);
	}
	private static boolean ratJump(int[][] maze) 
	{
		int sol[][]=new int[n][n];
		boolean result=pathUtil(maze,sol,0,0);
		if(result)
			return true;
		return false;
	}
	
	private static boolean pathUtil(int[][] maze, int[][] sol, int x, int y) 
	{
		if(x==n-1 && y==n-1)
		{
			sol[x][y]=1;
			print(sol);
			System.out.println("=======");
			return true;	
		}
		
		
		if(isSafe(maze,sol,x,y))
		{
			sol[x][y]=maze[x][y];
			for(int i=1;i<=maze[x][y] && i<n;i++)
			{	
				if(pathUtil(maze, sol, x+i, y))
					return true;
					
				if(pathUtil(maze, sol, x, y+i))
					return true;
				
			}
			sol[x][y]=0;
			return false;
		}
		
		
		return false;
	}
	private static void print(int[][] sol) {
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
				System.out.print(sol[i][j]+" ");
			System.out.println();
		}
		
	}
	private static boolean isSafe(int[][] maze, int[][] sol, int x, int y) 
	{
		return x>=0 && x<n && y>=0 && y<n && maze[x][y]!=0 ;
	}

}
