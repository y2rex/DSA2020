package week8.dp.fibonacci;

public class FibMemo {

	public static void main(String[] args) {
		
		int res=fib(5);
		System.out.println(res);
	}

	private static int fib(int n) 
	{
		int memo[]=new int[n+1];
		for(int i=0;i<n+1;i++)
			memo[i]=-1;
		
		if(memo[n]!=-1)
			return memo[n];
		
	if(n==0||n==1)
	   return n;
		
		memo[n]=fib(n-1)+fib(n-2);
	return memo[n];
	}

}
