//***kth largest element in stream of data*****

package week7.heap.problems;

import java.util.PriorityQueue;

public class KthLargestElementInStream {

	public static void main(String[] args) 
	{
		int arr[]=new int[]{5,15,6,3,10,20};
		int k=3;
		get(arr,k);
	}

	private static void get(int[] arr, int k) 
	{
		PriorityQueue<Integer> pq=new PriorityQueue<>();
		
		for(int i=0;i<arr.length;i++)
		{
			if(i<k-1)
			{
				pq.add(arr[i]);
				System.out.print(Integer.MIN_VALUE+" ");
			}
				
			else if (i==k-1)
			{
				pq.add(arr[i]);
				System.out.print(pq.peek()+" ");
			}
				
			else
			{
				if(pq.peek()<arr[i])
				{
					pq.remove();
					pq.add(arr[i]);
				}			
				System.out.print(pq.peek()+" ");
			}
		}
	}
}