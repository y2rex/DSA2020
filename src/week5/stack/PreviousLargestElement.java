package week5.stack;

import java.util.Stack;

public class PreviousLargestElement {

	public static void main(String[] args) 
	{
		int arr[]={5,10,7,8,3,2,12};
		getPrevMax(arr,arr.length);
	}

	private static void getPrevMax(int[] arr, int n) 
	{
		Stack<Integer> st=new Stack<>();
		int res[]=new int[n];
		st.push(arr[0]);
		res[0]=Integer.MIN_VALUE;
		
		for(int i=1;i<n;i++)
		{
			if(st.peek()>arr[i])
				res[i]=st.peek();
			else
			{
				while(!st.isEmpty() && st.peek()<arr[i])
					st.pop();
				res[i]=st.isEmpty()?Integer.MIN_VALUE:st.peek();
			}
			st.push(arr[i]);
		}
		for(int a : res)
			System.out.print(a+" ");
	}

}
