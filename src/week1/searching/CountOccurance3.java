//*************************log(n)+O(total number of occurrence)*******************

package week1.searching;

public class CountOccurance3 
{

	public static void main(String[] args) 
	{
		
		int arr[]={1,1,2,3,3,3,3};
		int count=0;
//========trying to get last occurrence index from right=========
		int a=count(arr,0,arr.length-1,3);
		while(arr[a]==3)
		{
			count++;
			a--;
		}
		System.out.println(count);
		
		}

	private static int count(int[] arr,int start,int end, int x) {
		if(start>end)
			return -1;
		int mid=start+(end-start)/2;
		
		if(arr[mid]==x &&(mid==end||arr[mid+1]!=x))
			return mid;
//==========we put "=" here "arr[mid]<x" because we travel right side to get last occurrence==========		
		if(arr[mid]<=x)
			return count(arr,mid+1,end,x);

		if(arr[mid]>x)
			return count(arr,start,mid-1,x);
		
		return 0;
	}

}
