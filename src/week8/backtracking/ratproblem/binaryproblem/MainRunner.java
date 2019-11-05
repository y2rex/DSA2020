package week8.backtracking.ratproblem.binaryproblem;

public class MainRunner 
{
	static int n;
	public static void main(String[] args) {
		
        int maze[][] = { { 1, 0, 0, 0 }, 
                         { 1, 1, 0, 1 }, 
                         { 0, 1, 0, 0 }, 
                         { 1, 1, 1, 1 }
                       }; 
         n=maze.length;
        boolean res=ratSolve(maze);
        System.out.println(res);
	}

	private static boolean ratSolve(int[][] maze) 
	{
		
		int res[][]=new int[n][n];
		if(!util(maze, res, 0, 0))
			System.out.println("No solution found!");
		else
			print(res);
		
		return util(maze,res,0,0);
		
	}

	private static void print(int[][] res) {
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
				System.out.print(res[i][j]+" ");
			System.out.println();
		}
		
	}

	private static boolean util(int[][] maze, int[][] res, int x, int y) 
	{
		if(x==n-1 && y==n-1)
		{
			res[x][y]=1;
			return true;
		}
		
		if(isSafe(maze,x,y))
		{
			res[x][y]=1;
			
			if(util(maze, res, x+1, y))
				return true;

			if(util(maze, res, x, y+1))
				return true;
			
			res[x][y]=0;
			return false;
		}
		return false;
		
	}

	private static boolean isSafe(int[][] maze, int x, int y) 
	{
		if(x>=0 && x<n && y>=0 && y<n && maze[x][y]==1 )
			return true;
		return false;
	}
}
