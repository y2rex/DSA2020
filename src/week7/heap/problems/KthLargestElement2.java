//***kth largest element

package week7.heap.problems;

import java.util.PriorityQueue;

public class KthLargestElement2 {

	public static void main(String[] args) 
	{
		int arr[]=new int[]{5,10,15,20,8};
		int k=2;
		get(arr,k);
	}
//********using Min heap(more efficient than Max Heap approach)************
	private static void get(int[] arr, int k) 
	{
		PriorityQueue<Integer> pq=new PriorityQueue<>();
		int i=0;
		for(i=0;i<k;i++)
			pq.add(arr[i]);
		
		for(int x=i;x<arr.length;x++)
		{
			if(arr[x]>pq.peek())
			{
				pq.remove();
				pq.add(arr[x]);
			}
		}	
		
		while(!pq.isEmpty())
			System.out.print(pq.remove()+" ");
	}
}
