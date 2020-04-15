package week8.dp.coinchange;

public class MainRunner2 {

	public static void main(String[] args) {
		
		int amount=5;
		int coins[]={1,2,5};
		int res=findWays(amount,coins);
		System.out.println(res);

	}

	private static int findWays(int amount, int[] coins) 
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
					dp[i][j]=1;
		
		//initializing first row		
				else if(i==0)			
				{
					if(j%coin==0)
						dp[i][j]=1;
					else
						dp[i][j]=0;
				}
					
		//main logic		
				else if(j<coin)
					dp[i][j]=dp[i-1][j];
				else
					dp[i][j]=dp[i-1][j]+dp[i][j-coin];
			}
		}
		
		for(int i=0;i<coins.length;i++)
		{
			for(int j=0;j<=amount;j++)
				System.out.print(dp[i][j]+" ");
			System.out.println();
		}
		
		
		
		return dp[m-1][n];
	}
}