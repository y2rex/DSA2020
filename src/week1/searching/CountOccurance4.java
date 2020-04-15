//*************************log(n)*******************

package week1.searching;

public class CountOccurance4 
{

	public static void main(String[] args) 
	{
		int arr[]={2,3,4,5,7,8};
		int first=firstOcc(arr,0,arr.length-1,3);
		int last=lastOcc(arr,0,arr.length-1,3);
		System.out.println("First occurrence at index : "+first+"|| Last occurrence at index : "+last);
		
		int res=last-first+1;
		System.out.println("Total Occurrence : "+res);
	}

	private static int lastOcc(int[] arr, int start, int end, int x) {
		if(end<start)
			return -1;
		int mid=(start+end)/2;
		
		if(arr[mid]==x && (mid==end || arr[mid+1]!=x))
			return mid;
		
		if(arr[mid]<=x)
			return lastOcc(arr, mid+1, end, x);
		
		if(arr[mid]>x)
			return lastOcc(arr, start, mid-1, x);
		
		return 0;
	}

	private static int firstOcc(int[] arr, int start, int end, int x) {
		
		if(end<start)
			return -1;
		int mid=(start+end)/2;
		
		if(arr[mid]==x && (mid==0 || arr[mid-1]!=x))
			return mid;
		
		if(arr[mid]<x)
			return firstOcc(arr, mid+1, end, x);
		
		if(arr[mid]>=x)
			return firstOcc(arr, start, mid-1, x);
		
		return 0;
	}
}
