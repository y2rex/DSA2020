//almost sorted array

package week7.heap.problems;

import java.util.PriorityQueue;

public class MainRunner1 {

	public static void main(String[] args) 
	{
	
		int arr[]=new int[]{9,8,7,18,19,17};
		int k=2;
		sort(arr,k);
		for(int a : arr)
			System.out.print(a+" ");

	}

	private static void sort(int[] arr, int k) 
	{
		PriorityQueue<Integer> pq=new PriorityQueue<>();
		
		for(int i=0;i<=k;i++)
			pq.add(arr[i]);
		
		int j=0;
		for(int i=k+1;i<arr.length;i++)
		{
			arr[j++]=pq.remove();
			pq.add(arr[i]);
		}
		
		while(j<arr.length && !pq.isEmpty())
			arr[j++]=pq.remove();
		
			
		
	}

}
