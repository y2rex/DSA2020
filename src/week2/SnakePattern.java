package week2;

public class SnakePattern {

	public static void main(String[] args) {
		int arr[][]={
				{1,2,3},
				{4,5,6,10},
				{7,8,9}
		};

		for(int i=0;i<arr.length;i++){
				for(int j=0;j<arr[i].length;j++){
					if(i%2==0)
					System.out.print(arr[i][j]+",");
					else
						System.out.print(arr[i][arr[i].length-1-j]+",");
			  }	
			
			/*else{
				for(int j=arr[i].length-1;j>=0;j--){	
					System.out.print(arr[i][j]+",");
			  }	
			}*/
		}
	}
}