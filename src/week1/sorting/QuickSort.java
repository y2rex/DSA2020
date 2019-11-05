package week1.sorting;

public class QuickSort {

	public static void main(String[] args) {
		int arr[]={6,3,7,8,45,4,3,3,3,3};
		quickSort(arr,0,arr.length-1);
		for(int a: arr)
			System.out.print(a+" ");
	}

	 static void quickSort(int[] arr, int start, int end)
	 {
		if(start<end)
		{
			int p=partition(arr,start,end);
			quickSort(arr, start, p-1);
			quickSort(arr, p+1, end);
		}
		
	}

	 static int partition(int[] arr, int low, int high) {
		int i=low-1;
        
		int pivot=arr[high];
        
		for(int j=low;j<=high-1;j++)
		{
			if(arr[j]<=pivot)
			{
				i++;
				      //swap arr[i] & arr[j]
				int temp=arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
			}
		}
		/*
		 * finally swap pivot element with (i+1)th element
		which set the pivot element to its proper Position.
		*/
		int temp=arr[i+1];
		arr[i+1]=arr[high];
		arr[high]=temp;
		
		return i+1;
	}
}