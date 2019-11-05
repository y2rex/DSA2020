package week5.stack;

import java.util.Stack;

public class PreviousSmallerElement {

	public static void main(String[] args) {
		
		int arr[]={5,10,7,8,3,2,12};
		getPrevMin(arr,arr.length);

	}

	private static void getPrevMin(int[] arr, int n) 
	{
		int []S=new int[n];
		Stack<Integer> st=new Stack<>();
		S[0]=Integer.MAX_VALUE;
		st.push(arr[0]);
		
		for(int i=1;i<n;i++)
		{
			if(st.peek()<arr[i])
				S[i]=st.peek();
			else
			{
				while(!st.isEmpty() && st.peek()>arr[i])
					st.pop();
				S[i]=st.isEmpty()?Integer.MAX_VALUE : st.peek();
			}
			st.push(arr[i]);
		}
		
		for(int a : S)
			System.out.print(a +" ");
	}
}