package week5.stack;

import java.util.Stack;

public class NextSmallerElement {

	public static void main(String[] args) {
		
		int arr[]={5,10,7,8,3,2,12};
		getNext(arr,arr.length);

	}

	private static void getNext(int[] arr, int n) 
	{
		int res[]=new int[n];
		res[n-1]=Integer.MAX_VALUE;
		Stack<Integer> st=new Stack<>();
		st.push(arr[n-1]);
		
		for(int i=n-2;i>=0;i--)
		{
			if(st.peek()<arr[i])
				res[i]=st.peek();
			else
			{
				while(!st.isEmpty() && st.peek()>arr[i])
					st.pop();
				res[i]=st.isEmpty()?Integer.MAX_VALUE:st.peek();
			}
			st.push(arr[i]);
		}
		
		for(int a : res)
			System.out.print(a+" ");
	}
}
