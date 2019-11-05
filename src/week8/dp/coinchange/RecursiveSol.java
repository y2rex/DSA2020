package week8.dp.coinchange;

public class RecursiveSol {

	public static void main(String[] args) {
		
		int amount=5;
		int coins[]={1,2};
		int res=totalWays(amount,coins,0);
		System.out.println(res);

	}

	private static int totalWays(int amount, int[] coins,int pos) {
		
		if(amount==0)
			return 1;
		if(amount<0)
			return 0;
		
		int res=0;
		for(int i=pos;i<coins.length;i++)
			res+=totalWays(amount-coins[i], coins, i);
		
		return res;
	}

}
