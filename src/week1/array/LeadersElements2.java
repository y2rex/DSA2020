package week1.array;

public class LeadersElements2 {

	public static void main(String[] args) {
	 int arr[]={5,3,20,15,8,3};
	 leader(arr,arr.length);
	}

	private static void leader(int[] arr, int n) {
		int i=n-1;
		int leader=arr[i];//last index always be leader
		System.out.print(leader+" ");
		while(i>0){
			if(arr[i]<arr[i-1]&&arr[i-1]>leader)
			{
				leader=arr[i-1];
				System.out.print(leader+" ");
			}
				
			i--;
		}
	}	
}
