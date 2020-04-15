package week8.dp.optimalstrategygame;

public class GameRecursion {

	public static void main(String[] args) {
		//int arr[]={20,5,4,6};
		int arr[]={2,3,15,7};
		int res=maxVal(arr,0,arr.length-1);
		System.out.println(res);

	}

	private static int maxVal(int[] arr, int l, int r) 
	{
		if(l<r)
		{
			int left=arr[l]+Integer.min(maxVal(arr, l+2, r), maxVal(arr, l+1, r-1));
			int right=arr[r]+Integer.min(maxVal(arr, l+1, r-1), maxVal(arr, l, r-2));	
		return Integer.max(left, right);
		}
		
		return 0;
		
		
	}

}
