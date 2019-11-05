package week1.sorting;

public class MergeSort2 {

	public static void main(String[] args) 
	{
		
		int arr[]={30,25,5,80,20,15};		
		mergeSort(arr,0,arr.length-1);
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
		
		int i=0;
		while(i<left.length){
			left[i]=arr[i];
			i++;
		}	
		
		
		int j=0;
		while(j<right.length){
			right[j]=arr[mid+1+j];
			j++;
		}
		
		
		int l=0;
		int r=0;
		int k=0;
		
		while(l<left.length && r<right.length)
		{
			if(left[l]<=right[r])
			{
				arr[k]=left[l];
				k++;
				l++;
			}
			else if(left[l]>right[r])
			{
				arr[k]=right[r];
				k++;
				r++;
			}
		}
		
		while(l<left.length)
			arr[k++]=left[l++];
		
		while(r<right.length)
			arr[k++]=right[r++];
	}
}