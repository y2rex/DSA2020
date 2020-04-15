package week8.backtracking.nqueens;

public class MainRunner {

	static int n;
	public static void main(String[] args) {
		
		int chessBoard[][]=new int[9][9];
		n=chessBoard.length;
		nQueen(chessBoard);
		
	}

	private static boolean nQueen(int[][] chessBoard) {
		if(getSol(chessBoard,0)==true)
		{
			print(chessBoard);
			return true;
		}
		return false;
	}

	private static boolean getSol(int[][] chessBoard, int col) {
		
		if(col==n)
			return true;	
		
		
		for(int row=0;row<n;row++)
		{
			if(isSafe(chessBoard,row,col))
			{
				chessBoard[row][col]=1;
				
				if(getSol(chessBoard, col+1))
					return true;
				chessBoard[row][col]=0;
			}
		}
		
		return false;
	}

	private static boolean isSafe(int[][] chessBoard, int row, int col) {
		  
		//check for left row
		for(int i=0;i<col;i++)
			if(chessBoard[row][i]==1)
				return false;
		
		//right upper diagonal
		for(int i=row,j=col ;i>=0 && j>=0;i--,j--)
			if(chessBoard[i][j]==1)
				return false;
		
		//right lower diagonal
				for(int i=row,j=col ;i<n && j>=0;i++,j--)
					if(chessBoard[i][j]==1)
						return false;
		
		return true;
	}

	private static void print(int[][] chessBoard) {

		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
				System.out.print(chessBoard[i][j]+ " ");
			System.out.println();
		}	
		System.out.println("===========================");
	}
}
