package week8.backtracking.sudoku;

public class MainRunner {
	
	public static void main(String[] args) 
	{
		
	int[][] board = { 
				       {3, 0, 6, 5, 0, 8, 4, 0, 0}, 
				       {5, 2, 0, 0, 0, 0, 0, 0, 0}, 
				       {0, 8, 7, 0, 0, 0, 0, 3, 1}, 
				       {0, 0, 3, 0, 1, 0, 0, 8, 0}, 
				       {9, 0, 0, 8, 6, 3, 0, 0, 5}, 
				       {0, 5, 0, 0, 9, 0, 6, 0, 0}, 
				       {1, 3, 0, 0, 0, 0, 2, 5, 0}, 
				       {0, 0, 0, 0, 0, 0, 0, 7, 4}, 
				       {0, 0, 5, 2, 0, 6, 3, 0, 0} 
				    }; 
				    int N = board.length; 
				  
				    if (solveSudoku(board, N))
				        print(board, N);
				    else
				    	System.out.println("No solution"); 

	}

	private static void print(int[][] board, int n) {
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
				System.out.print(board[i][j]+" ");
			System.out.println();
		}	
	}

	private static boolean solveSudoku(int[][] board, int n) 
	{	
		int row=-1,col=-1;
		boolean unAssigned=false;
		
		for(int i=0;i<n;i++)
		{
		   for(int j=0;j<n;j++)
		   {
			   if(board[i][j]==0)
				{
					row=i;
					col=j;
					unAssigned=true;
					break;
				}
		   }	
		   
		   if(unAssigned==true)
			   break;
		}
		
		if(unAssigned==false)
			return true;
			
		
		for(int num=1;num<=9;num++)
		{
			if(isSafe(board,row,col,num))
			{
				board[row][col]=num;
				
				if(solveSudoku(board, n))
				return true;
				
				board[row][col]=0;
			}
		}
		return false;
	}

	private static boolean isSafe(int[][] board, int row, int col, int num) 
	{
		int n=board.length;
		int temp=(int)Math.sqrt(n);
		
	//checking for row
		for(int i=0;i<n;i++)
			if(board[row][i]==num)
				return false;
		
	//checking  for column
		for(int i=0;i<n;i++)
			if(board[i][col]==num)
				return false;
		
	//checking for local matrix
		int startBoxRow=row-row%temp;
		int startBoxCol=col-col%temp;
		
		for(int i=startBoxRow;i<startBoxRow+temp;i++)
			for(int j=startBoxCol;j<startBoxCol+temp;j++)
				if(board[i][j]==num)
					return false;
		
		return true;	
	}
}
