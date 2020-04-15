//============rotate an array counter clock wise by 2 unit===========
package week1.array;

public class RorateArray2 {

	public static void main(String[] args) 
	{
	    int x=2;
		int arr[]={5,8,10,12,15};
		for(int a:arr)
			  System.out.print(a+" ");
		System.out.println();
		System.out.println("===============================");
		
	 rotate(arr,x);    
	  for(int a:arr)
		  System.out.print(a+" ");
	}
	
	private static void rotate(int[] arr, int x) {
		reverse(arr, 0, x-1);
		reverse(arr,x,arr.length-1);
		reverse(arr, 0, arr.length-1);
		
	}

	private static void reverse(int[] arr, int start, int end) {
		while(start<end)
		{
			int temp=arr[start];
			arr[start]=arr[end];
			arr[end]=temp;
			start++;
			end--;
		}
	}
}
