package week8.dp.coinchange;

public class MainRunner {

	public static void main(String[] args) {
		
		int amount=5;
		int coins[]={1,2,5};
		int res=findWays(amount,coins);
		System.out.println(res);
	}

	private static int findWays(int amount, int[] coins) 
	{
		int dp[]=new int[amount+1];
		dp[0]=1;
		for(int i=0;i<coins.length;i++)
		{
			int coin=coins[i];
			for(int j=1;j<=amount;j++)
				if(j>=coin)
					dp[j]+=dp[j-coin];
		}
		return dp[amount];
	}
}