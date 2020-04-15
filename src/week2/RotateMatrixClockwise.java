package week2;

public class RotateMatrixClockwise {

	public static void main(String[] args) {

		int arr[][]={
				{1,2,3},
				{4,5,6},
				{7,8,9}
		};
		
		/*
		 {1,4,7},
		 {2,5,8},
		 {3,6,9}
		 
		 {7,4,1}
		 {8,5,2}
		 {9,6,3}
		*/
		for(int i=0;i<arr.length;i++){
			for(int j=0;j<arr[i].length;j++){
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println("=========================");
//*****transpose************		
		for(int i=0;i<arr.length;i++){
			for(int j=i+1;j<arr[i].length;j++){
				int temp=arr[i][j];
				arr[i][j]=arr[j][i];
				arr[j][i]=temp;
			}
		}
//************reverse of rows********	
		int n=arr.length;
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n/2;j++){
				int temp=arr[i][j];
				arr[i][j]=arr[i][n-j-1];
				arr[i][n-j-1]=temp;
			}
		}
		
//*********result matrix************		
		for(int i=0;i<arr.length;i++){
			for(int j=0;j<arr[i].length;j++){
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
		
	}
}