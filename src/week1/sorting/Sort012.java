package week1.sorting;

public class Sort012 {

	public static void main(String[] args) {

		int arr[]={1,2,1,2,0,2,1,1,1,0,0,0};
		sort(arr,arr.length-1);

		for(int a : arr)
			System.out.print(a+" ");
	}

	private static void sort(int[] arr, int high) {

		int low=0;
		int t=0;
		while(low<=high)
		{
			switch (arr[low]) {
			case 0:
				int temp1=arr[low];
				arr[low]=arr[t];
				arr[t]=temp1;
				t++;
				low++;
			    break;

			case 1:
				low++;
				break;
				
			case 2:
				int temp2=arr[high];
				arr[high]=arr[low];
				arr[low]=temp2;
				high--;
				break;	
			}
		}
		
	}

}
