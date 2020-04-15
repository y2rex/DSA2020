package week5.stack;

import java.util.Stack;

public class StackSpanArray2 {

	public static void main(String[] args) {

		int prices[]={10,5,2,7,18,15,16,17};
		for(int a : prices)
			System.out.print(a+" ");
		System.out.println();
		spanMethod(prices);
		System.out.println();
		spanMethod2(prices);
	}

	private static void spanMethod2(int[] arr) 
		{
		Stack<Integer> st=new Stack<>();
		int res[]=new int[arr.length];
		res[0]=1;
		st.push(0);
		
		for(int i=1;i<arr.length;i++)
		{
			if(arr[st.peek()]>arr[i])
				res[i]=i-st.peek();
			else
			{
				while(!st.isEmpty() && arr[st.peek()]<=arr[i])
					st.pop();
				res[i]=st.isEmpty()?i+1:i-st.peek();
			}
			st.push(i);
		}
		for(int a : res)
			System.out.print(a+" ");
		System.out.println();
		}

	//***********2nd solution : O(n)***********	
	private static void spanMethod(int[] prices) 
	{
	int n=prices.length;
	int res[]=new int[n];
	res[0]=1;
	
	Stack<Integer> st=new Stack<>();
	st.push(0);
	
	for(int i=1;i<n;i++)
	{
		while(!st.isEmpty() && prices[st.peek()]<=prices[i])
			st.pop();

		res[i]=st.isEmpty()?i+1:i-st.peek();
		st.push(i);
	}
		
	
	for(int a : res)
		System.out.print(a+" ");
	}

}
