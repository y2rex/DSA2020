package week8.dp.coinchange;

public class RecursiveSol2 {
//here we get permutation of "total number of Ways"
	public static void main(String[] args) 
	{
		
		int amount=5;
		int coins[]={1,2,5};
		int res=totalWays(amount,coins);
		System.out.println(res);

	}

	private static int totalWays(int amount, int[] coins) {
		
		if(amount==0)
			return 1;
		if(amount<0)
			return 0;
		
		int res=0;
		for(int i=0;i<coins.length;i++)
			res+=totalWays(amount-coins[i], coins);
		
		return res;
	}

}
