package week8.dp.mincoinchange;

public class MinCoinChange {

	public static void main(String[] args) {
		int amount=5;
		int coins[]={1,2};
		
		int res=minCoin(amount,coins);
		System.out.println(res);

	}

	private static int minCoin(int amount, int[] coins)
	{	
		int dp[]=new int[amount+1];
		dp[0]=0;
		for(int i=1;i<=amount;i++)
			dp[i]=Integer.MAX_VALUE;
		
		for(int i=0;i<coins.length;i++)
		{
			int coin=coins[i];
			for(int j=1;j<=amount;j++)
				if(coin<=j)
					dp[j]=Math.min(dp[j], dp[j-coin]+1);
		}
		
		return dp[amount];
	}

}
