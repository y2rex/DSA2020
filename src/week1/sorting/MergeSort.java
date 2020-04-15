package week1.sorting;

public class MergeSort {

	public static void main(String[] args) {
		int arr[]={6,3,7,8,4,5,4};
		sort(arr,0,arr.length-1);
		for(int a: arr)
			System.out.print(a+" ");

	}

	private static void sort(int[] arr, int start, int end) 
	{
		if(start<end)
		{
			int mid=start+(end-start)/2;
			sort(arr, start, mid);
			sort(arr, mid+1, end);
			merge(arr, start, mid, end);
		}
	}

	private static void merge(int[] arr, int l, int mid, int r) {
		int []left=new int[mid-l+1];
		int []right=new int[r-mid];
		int n=left.length;
		int m=right.length;
		
		for(int i=0;i<n;i++)
			left[i]=arr[l+i];
		for(int i=0;i<m;i++)
			right[i]=arr[mid+1+i];
		
		int i=0,j=0,k=l;
		while(i<n && j<m)
			if(left[i]<=right[j])
				arr[k++]=left[i++];
			else
				arr[k++]=right[j++];
			
		while(i<n)
			arr[k++]=left[i++];
		while(j<m)
			arr[k++]=right[j++];
	}
}