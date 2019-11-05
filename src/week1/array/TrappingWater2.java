//********O(n)***********

package week1.array;

public class TrappingWater2 {

	public static void main(String[] args) {
		int arr[]={3, 0, 0, 2, 0, 4};
		trap(arr,arr.length);

	}

	private static void trap(int[] arr, int n) {
		int left[]=new int[n];
		int right[]=new int[n];
		
		int temp=arr[0];
		for(int i=0;i<n;i++ )
		{
			if(arr[i]>temp)
				temp=arr[i];
			left[i]=temp;
		}
		
		int temp1=arr[n-1];
		for(int i=n-1;i>=0;i--)
		{
			if(arr[i]>temp1)
				temp1=arr[i];
			right[i]=temp1;
		}
		
		int res=0;
		for(int i=1;i<n-1;i++)
			res=res+Math.min(left[i],right[i])-arr[i];
		System.out.println(res);
	}

}
