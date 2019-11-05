package week1.sorting;

public class MergeSort3 {

	public static void main(String[] args) 
	{
		
		int arr[]={30,25,5,80,20,15};		
		mergeSort(arr,0,6);
		for(int a: arr)
			System.out.print(a+" ");
	}

	private static void mergeSort(int[] arr, int start, int end) 
	{
		if(start<end)
		{
			int mid=(start+end)/2;
			
			mergeSort(arr, start, mid);
			mergeSort(arr, mid+1, end);
			merge(arr,start,mid,end);	
		}
	}

	private static void merge(int[] arr, int start, int mid, int end) {
		
		int left[]=new int[mid+1];
		int right[]=new int[end-mid];
		
	    int l=0;
	    int r=mid+1;
	    int k=0;
	    
	    while(l<left.length&&r<right.length){
	    	if(left[l]<right[r])
	    		arr[k++]=arr[l++];
	    	else if(right[r]<left[l])
	    		arr[k++]=right[r++];
	    	
	    }
	}
}