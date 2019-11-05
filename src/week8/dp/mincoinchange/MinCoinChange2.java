package week8.dp.mincoinchange;

public class MinCoinChange2 {

	public static void main(String[] args) {
		int amount=5;
		int coins[]={1,2};
		
		int res=minCoin(amount,coins);
		System.out.println(res);

	}

	private static int minCoin(int amount, int[] coins)
	{
		int m=coins.length;
		int n=amount;
		
		int dp[][]=new int[m][n+1];
		for(int i=0;i<m;i++)
		{
			int coin=coins[i];
			
			for(int j=0;j<=n;j++)
			{
	//initializing first column			
				if(j==0)
					dp[i][j]=0;
				
	//initializing first row	
				else if(i==0)
				{
					if(i%coin==0)
						dp[i][j]=j/coin;
					else
						dp[i][j]=0;
				}
				
	//main logic			
				else if(coin>j)
					dp[i][j]=dp[i-1][j];
				else
					dp[i][j]=Integer.min(dp[i-1][j], dp[i][j-coin]+1);
			}
		}
		
		for(int i=0;i<m;i++)
		{
			for(int j=0;j<=n;j++)
				System.out.print(dp[i][j]+" ");
			System.out.println();
		}
		return dp[m-1][n];
	}

}
