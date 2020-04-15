//*******same as previous problem(CountOccurance4.class), but here no need to find last occurrence*************

package week1.searching;

public class BinaryCountOccurance {

	public static void main(String[] args) {
		
		int arr[]={0,0,0,0,0,1,1,1,1,1,1,1,1,1};
		int first=count(arr,0,arr.length-1,1);
		System.out.println(arr.length-first);
	}

	private static int count(int[] arr, int start, int end,int x) {
		if(start>end)
			return -1;
		int mid=start+(end-start)/2;
		if(arr[mid]==x&&(mid==0||arr[mid-1]!=x))
			return mid;
		if(arr[mid]>=x)
			return count(arr,start,mid-1,x);
		if(arr[mid]<x)
			return count(arr,mid+1,end,x);
		return 0;
	}
}