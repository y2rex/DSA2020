package week1.sorting;

public class QuickSortPractice {

	public static void main(String[] args) {
		int arr[]={6,3,7,2,8,45};
		quickSort(arr,0,arr.length-1);
		for(int a: arr)
			System.out.print(a+" ");
	}

	private static void quickSort(int[] arr, int start, int end) 
	{
		if(start<end)
		{
			int p=partition(arr,start,end);
			quickSort(arr, start, p-1);
			quickSort(arr, p+1, end);
		}	
	}

	private static int partition(int[] arr, int start, int end) {
		int pivot=arr[end];
		int pos=start;
		for(int i=start;i<end;i++)
		{
			if(arr[i]<=pivot)
			{
				int temp=arr[pos];
				arr[pos]=arr[i];
				arr[i]=temp;
				pos++;
			}
		}
		int temp=arr[pos];
		arr[pos]=arr[end];
		arr[end]=temp;
		return pos;
	}
}