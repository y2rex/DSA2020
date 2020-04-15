package week8.backtracking.ratproblem.binaryproblem;

import java.util.ArrayList;

public class MainRunner5 {

	public static void main(String[] args) {
		
		int maze[][]={ 
						{ 1, 0, 0, 0, 0 }, 
		                { 1, 1, 1, 1, 1 }, 
		                { 1, 1, 1, 0, 1 }, 
		                { 0, 0, 0, 0, 1 }, 
		                { 0, 0, 0, 0, 1 } 
                    }; 
		int n=maze.length;
		
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
				System.out.print(maze[i][j]+" ");
			System.out.println();
		}
		System.out.println("================");
		solve(maze,n,all);
		

	}


	private static void solve(int[][] maze, int n, ArrayList<ArrayList<String>> paths) 
	{
		boolean sol[][]=new boolean[n][n];
		ArrayList<String> al=new ArrayList<>();
		util(maze,sol,n,0,0,al,paths);
		
	}

	static ArrayList<ArrayList<String>> all=new ArrayList<>();
	private static void util(int[][] maze, boolean[][] sol, int n, int row, int col, ArrayList<String> al, ArrayList<ArrayList<String>> paths) 
	{	
		if(row==n-1 && col==n-1)
		{	for(int i=0;i<al.size();i++)
				System.out.print(al.get(i));
		System.out.print(" ");
			return;
		}
	
		sol[row][col]=true;
	
		if(isSafe(maze,sol,n,row+1,col))
		{
			al.add("D");
			util(maze, sol, n, row+1, col, al,paths);
			al.remove(al.size()-1);
		}
	
		if(isSafe(maze,sol,n,row,col-1))
		{
			al.add("L");
			util(maze, sol, n, row, col-1, al,paths);
			al.remove(al.size()-1);
		}

		if(isSafe(maze,sol,n,row,col+1))
		{
			al.add("R");
			util(maze, sol, n, row, col+1, al,paths);
			al.remove(al.size()-1);
		}
		
		if(isSafe(maze,sol,n,row-1,col))
		{
			al.add("U");
			util(maze, sol, n, row-1, col, al,paths);
			al.remove(al.size()-1);
		}
		sol[row][col]=false;
		
	}

	private static boolean isSafe(int[][] maze, boolean[][] sol, int n, int row, int col) {
		
		return row>=0 && row<n && col>=0&&col<n && maze[row][col]==1 && !sol[row][col];
	}

}
