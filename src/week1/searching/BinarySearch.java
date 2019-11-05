package week1.searching;

public class BinarySearch {

	public static void main(String[] args) {
		int arr[]={5,10,15,20};
		int a=sort(arr,0,arr.length-1,20);
		System.out.println(a);
	}

	private static int sort(int[] arr,int start,int end,int x) {
		if(start>end)
			return -1;
		
		int mid=start+(end-start)/2;
		if(arr[mid]==x)
			return mid;
		if(arr[mid]<x)
			return sort(arr,mid+1,end,x);
		if(arr[mid]>x)
			return sort(arr,start,mid-1,x);
		
		return 0;
	}

}
