package week7.graph.countisland;

public class MainRunner 
{
	static int row;
	static int col;
	
	public static void main(String[] args) 
	{
		 int M[][] = new int[][] { 
			 { 1, 1, 0, 0, 0 }, 
             { 0, 1, 0, 0, 1 }, 
             { 1, 0, 0, 1, 1 }, 
             { 0, 0, 0, 0, 0 }, 
             { 1, 0, 1, 0, 1 } }; 
             
       col=row=M.length;
        System.out.println(countIsland(M));     
	}

	private static int countIsland(int[][] M) 
	{
		boolean visited[][]=new boolean[row][col];
		int count=0;
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<col;j++)
			{
				if(M[i][j]==1 && visited[i][j]==false)
				{
					DFS(M,i,j,visited);
					count++;
				}
			}
		}
		
		return count;
	}

	private static void DFS(int[][] M, int r, int c, boolean[][] visited) 
	{
		int rowVal[]={-1,-1,-1,0,0,1,1,1};
		int colVal[]={-1,0,1,-1,1,-1,0,1};
		
		visited[r][c]=true;
		
		for(int i=0;i<8;i++)
		if(isSafe(M, r+rowVal[i], c+colVal[i], visited))
			DFS(M, r+rowVal[i], c+colVal[i], visited);
		
	}
	
	static boolean isSafe(int M[][],int r,int c,boolean visited[][])
	{
		return r>=0 && r<row && c>=0 && c<col &&M[r][c]==1 && !visited[r][c];
	}

}
