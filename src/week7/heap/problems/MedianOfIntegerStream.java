package week7.heap.problems;

import java.util.Collections;
import java.util.PriorityQueue;

public class MedianOfIntegerStream {

	public static void main(String[] args)
	{
		int arr[]= {5, 15, 1, 3, 2};
		for(int a : arr)
			System.out.print(a+", ");
		System.out.println();
		System.out.println("==================================");
		median(arr);
		
		

	}

	private static void median(int[] arr) 
	{
		PriorityQueue<Integer> smaller=new PriorityQueue<>(Collections.reverseOrder());//max heap
		PriorityQueue<Integer> greater=new PriorityQueue<>();//min heap
		double med=arr[0];
		smaller.add(arr[0]);
		System.out.print((int)med+", ");
		
		for(int i=1;i<arr.length;i++)
		{
			int x=arr[i];
		//1. smaller.size()>greater.size()	
			if(smaller.size()>greater.size())
			{
				if(x<med)
				{
					greater.add(smaller.remove());
					smaller.add(x);
				}
				else
					greater.add(x);
				med=(smaller.peek()+greater.peek())/2;
			}
		//2. smaller.size()==greater.size()	
			if(smaller.size()==greater.size())
			{
				if(x<med)
				{
					smaller.add(x);
					med=smaller.peek();
				}
				else
				{
					greater.add(x);
					med=greater.peek();
				}
			}
		//3. smaller.size()<greater.size()	
			else
			{
				if(x<med)
					smaller.add(x);
				else
				{
					smaller.add(greater.remove());
					greater.add(x);
				}
				med=(smaller.peek()+greater.peek())/2;
			}
			System.out.print((int)med+", ");
		}
		
	}

}
