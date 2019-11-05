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
		int MinNumberCoins[]=new int[amount+1]; 
//	{0,INF,INF,INF,......}	
		MinNumberCoins[0]=0;
		for(int i=1;i<MinNumberCoins.length;i++)
			MinNumberCoins[i]=Integer.MAX_VALUE;

		
		for(int i=0;i<coins.length;i++)
		{
			int coin=coins[i];
		      for(int j=1;j<MinNumberCoins.length;j++)
		    	  if(j>=coin)
		    		  MinNumberCoins[j]=Integer.min(MinNumberCoins[j], MinNumberCoins[j-coin]+1); 	 
		}
		
		return MinNumberCoins[amount];
	}

}
