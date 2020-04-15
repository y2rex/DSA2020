package week2;

public class BoundaryTraversal {

	public static void main(String[] args) {

		int arr[][]={
				{1,2,3,10},
				{4,5,6,20,34},
				{7,8,9,30}
		};
		
		for(int i=0;i<arr.length;i++){
			for(int j=0;j<arr[i].length;j++){
				if(i==0||j==0||i==(arr.length-1)||j==(arr[i].length-1))
					System.out.print(arr[i][j]+" ");
				/*
				else if(j==2)
					System.out.print(arr[i][j]+" ");
				
				else if(i==2)
					System.out.print(arr[i][2-j]+" ");
				
				else if(j==0)
					System.out.print(arr[2-i][j]+" ");*/
				else
				System.out.print("  ");
			}
			System.out.println();	
		}
	}
}
