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
		int mid=0;
		while(mid<=high){
			switch (arr[mid]) {
			case 0:
				int temp=arr[low];
				arr[low]=arr[mid];
				arr[mid]=temp;
				low++;
				mid++;
				break;

			case 1:
				mid++;
				break;
				
			case 2:
				int temp1=arr[mid];
				arr[mid]=arr[high];
				arr[high]=temp1;
				high--;
				break;
			}
		}
		
	}

}
