//***kth largest element

package week7.heap.problems;

import java.util.Collections;
import java.util.PriorityQueue;

public class KthLargestElement {

	public static void main(String[] args) 
	{
		int arr[]=new int[]{5,10,15,20,8};
		int k=2;
		get(arr,k);
	}
//********using Max heap************
	private static void get(int[] arr, int k) 
	{
		PriorityQueue<Integer> pq=new PriorityQueue<>(Collections.reverseOrder());
		
		for(int a : arr)
			pq.add(a);
		
		for(int i=0;i<k;i++)
			System.out.print(pq.remove()+" ");
		
	}

	
	

}
