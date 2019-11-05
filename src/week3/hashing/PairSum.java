package week3.hashing;

import java.util.HashSet;

public class PairSum {

	public static void main(String[] args) {

		int arr[]={3,5,2,8,11,7};
		int x=16;
		boolean res=find(arr,x);
		System.out.println(res);
	}

	private static boolean find(int[] arr, int x) {
		
		HashSet<Integer> hs=new HashSet<>();
		
		for(int i=0;i<arr.length;i++)
		{	
			if(hs.contains(x-arr[i]))
				return true;
			hs.add(arr[i]);
		}
			
		return false;
	}

}
