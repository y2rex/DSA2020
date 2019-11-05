package week3.hashing;

import java.util.HashMap;

public class MostFrequent {

	public static void main(String[] args) {

		int arr[]={5,6,8,3,6,8,5,6,6};
		int res=mostFrequent(arr);
		System.out.println(res);

	}

	private static int mostFrequent(int[] arr) {
		
		HashMap<Integer, Integer> hm=new HashMap<>();
		for(int i=0;i<arr.length;i++){
			if(hm.containsKey(arr[i]))
				hm.put(arr[i], hm.get(arr[i])+1);
			else
				hm.put(arr[i], 1);
		}
		
		int res=-1;
		for(int a : hm.values()){
			if(a>res)
				res=a;  //here res store value of occurrence
		}
		
		for(int k : hm.keySet())
		{
			if(hm.get(k)==res)
			{
				res=k;   //here res store element which occurred most
				break;
			}
		}
		
		return res;
	}
}
