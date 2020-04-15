package week2;

public class MatrixMux {

	public static void main(String[] args) {

		int a[][]={
				{1,2,3},
				{4,5,6},
				{7,8,9}
		};
		int b[][]={
				{10,11,12},
				{14,15,16},
				{17,18,19}
		};
		int res[][]=new int[3][3];
		
		for(int i=0;i<a.length;i++)
		{		
			for(int j=0;j<b.length;j++)
			{
				int mux=0;
				for(int k=0;k<a.length;k++)
				{
				   mux=mux+a[i][k]*b[k][j];	
				}
				res[i][j]=mux;			
		    }	
		  }
		
		for(int i=0;i<res.length;i++){
			for(int j=0;j<res[i].length;j++){
				System.out.print(res[i][j]+"  ");
			}
			System.out.println();
		}
		}
	}