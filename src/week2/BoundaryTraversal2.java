//*********print all boundary elements in a single line********

package week2;

public class BoundaryTraversal2 {

	public static void main(String[] args) {

		int arr[][]={
				{1,2,3,10},
				{4,5,6,20},
				{7,8,9,30},
				{23,24,25,26}
		};
		
		
		int sr=0;
		int sc=0;
		
		int lr=arr.length-1;
		int lc=arr.length-1;
		
		while(sr<=lr && sc==0||lc==arr.length-1)
		{
		//***print elements of 1st row*********	
			for(int i=sc;i<=lc;i++)
				System.out.print(arr[sr][i]+" ");
			sr++;
			
		//****print remaining elements of last column****	
			for(int i=sr;i<=lr;i++)
				System.out.print(arr[i][lc]+" ");
			lc--;
			
		//****print remaining elements of last row********
			for(int i=lc;i>=sc;i--)
				System.out.print(arr[lr][i]+" ");
			lr--;
			
		//****print remaining elements of first column********	
			for(int i=lr;i>=sr;i--)
				System.out.print(arr[i][sc]+" ");
			sc++;
			
		}
	}
}
