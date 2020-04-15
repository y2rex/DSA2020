
//find path from source to destination
package week8.backtracking.ratproblem.binaryproblem;

public class MainRunner3 {

	static int n;
	public static void main(String[] args) {
		
		int maze[][]=
			{
				{0,1,1,1,1},
				{0,1,0,1,1},
				{1,0,1,0,1},
				{0,0,1,0,1},
				{1,1,1,1,1},
			};
		n=maze.length;
		boolean res=getResult(maze,0,1,3,3);
		System.out.println(res);

	}

	private static boolean getResult(int[][] maze, int i, int j, int k, int l) 
	{
		boolean visited[][]=new boolean[n][n];
		int res[][]=new int[n][n];
		
		boolean result=ratSolve(maze,i,j,k,l,res,visited);
		
		if(!result)
			System.out.println("Path Not found");
		else
			print(res,visited);
		return result;
	}

	private static void print(int[][] res, boolean[][] visited) {
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
				System.out.print(res[i][j]+" ");
			System.out.println();
		}
		System.out.println("============");
				
	}

	private static boolean ratSolve(int[][] maze, int i, int j, int k, int l, int[][] res, boolean[][] visited) 
	{
		if(i>=n || j>=n || k>=n || l>=n)
			return false;
		
		if(i==k &&  j==l && maze[i][j]==1)
		{
			res[i][j]=1;
			visited[i][j]=true;
			return true;
		}
		
		if(isSafe(maze,i,j) && visited[i][j]==false)
		{
			res[i][j]=1;
			visited[i][j]=true;
			
			if(ratSolve(maze, i+1, j, k, l, res, visited))
				return true;
			if(ratSolve(maze, i, j+1, k, l, res, visited))
				return true;
			if(ratSolve(maze, i-1, j, k, l, res, visited))
				return true;
			if(ratSolve(maze, i, j-1, k, l, res, visited))
				return true;
			
			res[i][j]=0;
			visited[i][j]=false;
			
			return false;
		}
		return false;
	}

	private static boolean isSafe(int[][] maze, int i, int j) {
		
		return i>=0 && i<n && j>=0 && j<n && maze[i][j]==1;
	}

}
