//not completed

package week6.binarysearchtree;

import java.util.TreeSet;

public class PreviousNearestGreaterElement {

	public static void main(String[] args) 
	{
		int arr[]=new int[]{2,8,30,15,25,12};	// o/p: -1,-1,-1,30,30,15
		
		get(arr,arr.length);
		
	}

	private static void get(int[] arr, int n) 
	{
		//int res[]=new int[n];
		TreeSet<Integer> t=new TreeSet<>();
		
		for(int a : arr)
			t.add(a);
		
		
		for(int i=0;i<t.size();i++)
		{
			System.out.print(t.lower(arr[i])+" ");
		}
	
		
	}

}
