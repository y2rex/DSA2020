package week8.dp.mincoinchange;

public class RecursiveSol {

	public static void main(String[] args) {
		
		int amount=5;
		int coins[]={1,2,5};
		
		int res=minCoin(amount,coins);
		System.out.println(res);

	}

	private static int minCoin(int amount, int[] coins) 
	{
		if(amount==0)
			return 0;
	
		
		int res=Integer.MAX_VALUE;
		for(int i=0;i<coins.length;i++)
		{
			int temp=0;
			
			if(coins[i]<=amount)
			 temp= minCoin(amount-coins[i], coins);
			
			if(temp!=Integer.MAX_VALUE && temp+1<res )
				res=temp+1;
		}
			
		
		return res;
	}

}
