package week3.hashing;

import java.util.HashSet;

public class XSum {

	public static void main(String[] args) {
		
		int arr[]={5,3,8,-2,8,10};
		int x=11;
		
		boolean res=sum11(arr,x);
		System.out.println(res);

	}

	private static boolean sum11(int[] arr, int x) {

		HashSet<Integer> hs=new HashSet<>();
		int prev_sum=0;
		hs.add(0);
		
		for(int i=0;i<arr.length;i++)
		{
			prev_sum=prev_sum+arr[i];
			if(hs.contains(prev_sum-x))
				return true;
			hs.add(prev_sum);
		}
		return false;
	}
}
