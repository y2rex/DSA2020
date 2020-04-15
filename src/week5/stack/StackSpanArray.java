package week5.stack;

import java.util.Stack;

public class StackSpanArray {

	public static void main(String[] args) {

		int prices[]={10,5,2,7,18,15,16,17};
		for(int a : prices)
			System.out.print(a+" ");
		System.out.println();
		spanMethod(prices);
		spanMethod2(prices);
	}

private static void spanMethod2(int[] prices) 
	{
		int n=prices.length;
		int res[]=new int[n];
		res[0]=1;
		
		for(int i=n-1;i>0;i--)
		{
			for(int j=i;j>=0;j--)
				if(prices[j]<=prices[i])
					res[i]++;
				else
					break;
			
		}
			
		System.out.println("\n=========================");
		for(int a : res)
			System.out.print(a+" ");
	}

//***********1st solution : Naive Method*******(O(n2))***********	
	private static void spanMethod(int[] prices) {
		int n=prices.length;
		int stock[]=new int[n];
		stock[0]=1;
		Stack<Integer> st=new Stack<Integer>();
		st.push(0);
		
		for(int i=1;i<n;i++)
		{
			if(prices[st.peek()]>prices[i])
				stock[i]=i-st.peek();
			else
			{
				while(!st.isEmpty() && prices[i]>prices[st.peek()])
					st.pop();
				stock[i]=st.isEmpty()?i+1:i-st.peek();
			}
			st.push(i);
		}
		
		for(int a : stock)
			System.out.print(a+" ");
	}

}
