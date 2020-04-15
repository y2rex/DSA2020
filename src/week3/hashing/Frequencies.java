package week3.hashing;

import java.util.HashMap;

public class Frequencies {

	public static void main(String[] args) {

		int arr[]={1,2,3,1,3,5,1};
		frequencies(arr);
		
	}

	private static void frequencies(int[] arr) {
		
		HashMap<Integer,Integer> hm=new HashMap<>();

		for(int i=0;i<arr.length;i++)
		{
		 if(hm.containsKey(arr[i]))
			hm.put(arr[i], hm.get(arr[i])+1); 
		 else
				hm.put(arr[i], 1);
		}
		
		
		System.out.println(hm);
		
	}

}
