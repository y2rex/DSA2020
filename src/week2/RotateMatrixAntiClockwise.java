package week2;

public class RotateMatrixAntiClockwise {

	public static void main(String[] args) {

		int arr[][]={
				{1,2,3},
				{4,5,6},
				{7,8,9}
		};
		
		for(int i=0;i<arr.length;i++){
			for(int j=0;j<arr[i].length;j++){
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println("=========================");
//*****transpose************		
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr[i].length;j++){
				int temp=arr[i][j];
				arr[i][j]=arr[j][i];
				arr[j][i]=temp;
			}
		}
//************reverse of cols********		
		for(int i=0;i<arr.length/2;i++)
		{
			for(int j=0;j<arr[i].length;j++)
			{
					int temp=arr[i][j];
					arr[i][j]=arr[arr.length-1-i][j];
					arr[arr.length-1-i][j]=temp;
				
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