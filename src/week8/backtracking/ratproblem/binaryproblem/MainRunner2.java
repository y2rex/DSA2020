//print all possible path if you can move up,down,left,right

package week8.backtracking.ratproblem.binaryproblem;

public class MainRunner2 
{
	static int n;
	static int path=0;
	public static void main(String[] args) {
		
        int maze[][] = { { 1, 1, 1, 1 }, 
                         { 1, 1, 0, 1 }, 
                         { 0, 1, 0, 1 }, 
                         { 1, 1, 1, 1 }
                       }; 
         n=maze.length;
       ratSolve(maze);
	}
	private static void ratSolve(int[][] maze) {
		int sol[][]=new int[n][n];
		pathUtil(maze,sol,0,0);
		
		if(path!=0)
			System.out.println(path);
		else
			System.out.println("No Path Found!");
	}
	
	private static void pathUtil(int[][] maze, int[][] sol, int x, int y) 
	{
		if(x==n-1 && y==n-1)
		{
			path++;
			sol[x][y]=1;
			print(sol);
			System.out.println("================");
			return;
		}
		
		if(isSafe(maze,sol,x,y))
		{
			sol[x][y]=1;
			
			pathUtil(maze, sol, x+1, y);
			pathUtil(maze, sol, x, y+1);
			pathUtil(maze, sol, x-1, y);
			pathUtil(maze, sol, x, y-1);
			
			sol[x][y]=0;
						
		}
	}
	
	private static boolean isSafe(int[][] maze, int[][] sol, int x, int y) {
		
		return x>=0 && x<n && y>=0 && y<n && maze[x][y]==1 && sol[x][y]!=1;
	}
	
	private static void print(int[][] sol) 
	{
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
				System.out.print(sol[i][j]+" ");
			System.out.println();
		}	
	}
}
