package week1.sorting;

public class MergeSortPractice 
{
	public static void main(String[] args) 
	{
		int arr[]={6,3,7,8,45,4};
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
			merge(arr,start,mid,end);
		}
	}

	private static void merge(int[] arr, int start, int mid, int end) 
	{
		int left[]=new int[mid+1];
		int right[]=new int[end-mid];
		
		for(int x=0;x<left.length;x++)
			left[x]=arr[x];
		for(int x=0;x<right.length;x++)
			right[x]=arr[x+mid+1];
		
		int i=0;//left
		int j=0;//right
		int k=0;
		while(i<left.length&& j<right.length)
		{
			if(left[i]<right[j])
				arr[k++]=left[i++];
			else
				arr[k++]=right[j++];
		}
		
		while(i<left.length)
			arr[k++]=left[i++];
		while(j<right.length)
			arr[k++]=right[j++];
		
	}

}
