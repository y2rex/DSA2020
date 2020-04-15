package week1.tripletsum;

import java.util.Arrays;

public class MainRunner1 {

	public static void main(String[] args) {
		 int arr[] = { 1, 4, 45, 6, 10, 8,17,12 }; 
		 int n=arr.length;
		 int sum=22;
		 int res=getSum(arr,n,sum);
		 System.out.println(res);
	}

	private static int getSum(int[] arr, int n, int sum) 
	{
		int res=0;
		Arrays.sort(arr);
		for(int i=0;i<n-2;i++)
		{
			int l=i+1;
			int r=n-1;
			while(l<r)
			{
				int temp=arr[i]+arr[l]+arr[r];
				if(temp==sum)
				{
					System.out.println(arr[i]+","+arr[l]+","+arr[r]);
					res++;
					break;
				}
					
				else if(temp<sum)
					l++;
				else
					r--;
			}
		}
		return res;
	}

}
