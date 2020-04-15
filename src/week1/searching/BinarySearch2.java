//***it will work for infinite length of array and you have to find index of given number

package week1.searching;

public class BinarySearch2 {

	public static void main(String[] args) {
		int arr[]={5,10,15,20,30,40};
		int a=sort(arr,20);
		System.out.println(a);
	}

	private static int sort(int[] arr,int x) 
	{
		int i=0;
		if(arr[i]==x)
			return 0;
		i++;
		while(arr[i]<x)
			i*=2;
		int start=i/2;
		int end=i;
		while(start<end)
		{
			int mid=start+(end-start)/2;
			if(arr[mid]==x)
				return mid;
			else if( arr[mid]<x)
				start=mid+1;
			else
				end=mid-1;
		}
		
		
		return 0;
	}

}
