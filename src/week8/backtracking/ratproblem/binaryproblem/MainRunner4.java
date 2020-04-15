//count total possible path if you can move left,right,up or down.Here 1 means path blocked 

package week8.backtracking.ratproblem.binaryproblem;

public class MainRunner4 {

	static int n;
	static int path=0;
	public static void main(String[] args) {
		
		int maze[][]=
			{
					{0, 0, 1, 0, 0, 1, 0},
					{1, 0, 1, 1, 0, 0, 0},
					{0, 0, 0, 0, 1, 0, 1},
					{1, 0, 1, 0, 0, 0, 0},
					{1, 0, 1, 1, 0, 1, 0},
					{1, 0, 0, 0, 0, 1, 0},
					{1, 1, 1, 1, 0, 0, 0}
			};
		n=maze.length;
		
		findpath(maze);
		

	}
	private static void findpath(int[][] maze) {
		boolean visited[][]=new boolean[n][n];
		pathCount(maze,visited,0,0);
		if(path!=0)
			System.out.println(path);
		else
			System.out.println("No path found!");
	}
	
	private static void pathCount(int[][] maze, boolean[][] visited, int x, int y) 
	{
		if(x==n-1 && y==n-1)
		{
			path++;
			visited=new boolean[n][n];
			return;
		}
		
		if(isSafe(maze,visited,x,y))
		{
			visited[x][y]=true;
			
			pathCount(maze, visited, x+1, y);
			pathCount(maze, visited, x, y+1);
			pathCount(maze, visited, x-1, y);
			pathCount(maze, visited, x, y-1);
			
			visited[x][y]=false;
			
		}
		
	}
	private static boolean isSafe(int[][] maze, boolean[][] visited, int x, int y) {
		
		return x>=0 && x<n && y>=0 && y<n && maze[x][y]==0 && visited[x][y]==false;
	}
	

}
