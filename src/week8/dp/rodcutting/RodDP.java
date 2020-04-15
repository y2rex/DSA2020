package week8.dp.rodcutting;

public class RodDP {

	public static void main(String[] args) {
		int x=23;
		int res=maxRope(x,9,11,12);
		System.out.println(res);

	}

	private static int maxRope(int x, int a, int b, int c) {

		int dp[]=new int[x+1];
		dp[0]=0;
		
		for(int i=1;i<=x;i++)
		{
			dp[i]=-1;
			
			if(i-a>=0)
				dp[i]=Integer.max(dp[i], dp[i-a]);
			if(i-b>=0)
				dp[i]=Integer.max(dp[i], dp[i-b]);
			if(i-c>=0)
				dp[i]=Integer.max(dp[i], dp[i-c]);
		}
		return dp[x];
		
	}
}