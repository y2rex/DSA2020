package week1.searching;

public class CountOccurance {

	public static void main(String[] args) {
		int arr[]={2,3,3,3,3,20,30,40};
		int a=count(arr,0,arr.length-1,3);
		
		int count=0;
		if(a==-1)
			System.out.println("Element not found");
		else
		{
			int left=a,right=a;
			while(arr[left]==3){
				count++;
				left--;
			}
			while(arr[right]==3){
				count++;
				right++;
			}
			
			System.out.println(count-1);
		}
		
	}

	private static int count(int[] arr,int start,int end, int x) {
		if(start>end)
			return -1;
		int mid=start+(end-start)/2;
		
		if(arr[mid]==x)
			return mid;
		if(arr[mid]<x)
			return count(arr,mid+1,end,x);
		if(arr[mid]>x)
			return count(arr,start,mid-1,x);
		
		return 0;
	}

}
