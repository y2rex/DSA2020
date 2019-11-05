package week1.array;

public class LeadersElements {

	public static void main(String[] args) {
	 int arr[]={5,3,20,15,8,3};
	 leader(arr,arr.length);
	}

	private static void leader(int[] arr, int n) {
		for(int i=0;i<n;i++)
		{
			boolean isLeader=true;
			int leader=arr[i];
			for(int j=n-1;j>=i;j--){
				if(arr[j]>leader)
				{
					isLeader=false;
					break;
				}
			}
			if(isLeader)
				System.out.print(arr[i]+" ");
		}
		
	}	
}
