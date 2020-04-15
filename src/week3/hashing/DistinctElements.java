package week3.hashing;

import java.util.HashSet;

public class DistinctElements {

	public static void main(String[] args) {
		
		int arr[]={5,6,8,3,6,8,5,6,6};
		int res=distinct(arr);
		System.out.println(res);

	}

	private static int distinct(int[] arr) {
	
		HashSet<Integer> hs=new HashSet<>();
		for(int i=0;i<arr.length;i++)
			hs.add(arr[i]);
		
		return hs.size();
	}

}
