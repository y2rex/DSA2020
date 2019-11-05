package week8.dp.fibonacci;

public class FibTabulation {

	public static void main(String[] args) {
		int n=5;
		int res=fib(n);
		System.out.println(res);

	}

	private static int fib(int n) {
		int dp[]=new int[n+1];
		dp[0]=0;
		dp[1]=1;
		
		for(int i=2;i<n+1;i++)
			dp[i]=dp[i-1]+dp[i-2];
		
		return dp[n];
	}

}
