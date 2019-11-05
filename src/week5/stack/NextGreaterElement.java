package week5.stack;

import java.util.Stack;

public class NextGreaterElement {

	public static void main(String[] args) {
		
		int arr[]={5,-10,7,8,3,2,12};
		//getNext(arr,arr.length);
		getNext2(arr,arr.length);

	}

	

	private static void getNext2(int[] arr, int n) 
	{
		int next[]=new int[n];
		next[n-1]=-1;
		Stack<Integer> st=new Stack<>();
		st.push(arr[n-1]);
		
		for(int i=n-2;i>=0;i--)
		{
			if(st.peek()>arr[i])
				next[i]=st.peek();
			
			else
			{
				while(!st.isEmpty() && st.peek()<arr[i])
					st.pop();
				next[i]=st.isEmpty()?-1:st.peek();
			}
			st.push(arr[i]);
		}
		
		for(int a : next)
			System.out.print(a+" ");
	}
}
