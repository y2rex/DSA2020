package week2;

public class SpiralTraversal {

	public static void main(String[] args) {

		int arr[][]={
				{1,2,3,10},
				{4,5,6,20},
				{7,8,9,30},
				{24,25,26,27}
		};
		int lr=arr.length;		//last row
		int sr=0;				//starting row
		int lc=arr[1].length;	//last col
		int sc=0;				//starting col
		int i;
		
		while(sr<lr&&sc<lc){
	//=======1st row==========	
			for(i=sc;i<lc;i++)
				System.out.print(arr[sr][i]+" ");
			sr++;
	//======remaining elements last col===========
			for(i=sr;i<lr;i++)
				System.out.print(arr[i][lc-1]+" ");
			lc--;
	//=======remaining elements in last low============	
			if(sr<lr){
				for(i=lc-1;i>=sc;i--)
					System.out.print(arr[lr-1][i]+" ");
				lr--;
			}
	//=======remaining elements in 1st col============
			if(sc<lc){
				for(i=lc-1;i>=sr;i--)
					System.out.print(arr[i][sc]+" ");
				sc++;
			}
		}	
	}
}