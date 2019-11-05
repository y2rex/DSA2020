package week3.hashing;

import java.util.HashSet;

public class ZeroSum2 {

	public static void main(String[] args) {

		int arr[]={5,6,-4,-2,8,10};
		boolean res=sumZero(arr);
		System.out.println(res);
	}

//=====naive method having complexity O(n2)================
	private static boolean sumZero(int[] arr) 
	{
		HashSet<Integer> hs=new HashSet<>();
		int sum=0;
		hs.add(0);
		/*
		 * must add zero at first position
		 * try{5,-5,10} after removing hs.add(0);
		 * */
		
		for(int i=0;i<arr.length;i++)
		{
			sum=sum+arr[i];
			if(hs.contains(sum))
				return true;
				
			hs.add(sum);	
		}
		return false;
	}

}
