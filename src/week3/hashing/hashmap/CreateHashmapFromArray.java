package week3.hashing.hashmap;

import java.util.HashMap;

public class CreateHashmapFromArray {

	static HashMap<Integer, Integer> hm=new HashMap<>();
	
	public static void main(String[] args) {
		
		int arr[]={10,20,30,40,50,60,70};
        CreatehashMap(arr);
        boolean res=find(10);
        if(res)
        	System.out.println("Available");
        else
        	System.out.println("Not available");
	}

	private static boolean find(int x) {
		
	return hm.containsValue(x);	
	}

	private static void CreatehashMap(int[] arr) {
		
		
		for(int i=0;i<arr.length;i++)
			hm.put(i, arr[i]);
		System.out.println(hm);
		System.out.println("=====================================================");
		
		
	}

}
