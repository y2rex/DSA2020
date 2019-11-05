package week8.dp.lcs;

public class LCSDP {

	public static void main(String[] args) {
		String s1="AABCDY";
		String s2="AYCYDY";
		
		int res=lcs(s1,s2,s1.length(),s2.length());
	System.out.println(res);
	}

	private static int lcs(String s1, String s2, int m, int n) {
		
		int dp[][]=new int [m+1][n+1];
		
		for(int i=0;i<=m;i++)
		{
			for(int j=0;j<=n;j++)
			{
				if(i==0||j==0)
					dp[i][j]=0;
				
				else if(s1.charAt(i-1)==s2.charAt(j-1))
					dp[i][j]=dp[i-1][j-1]+1;
				
				else
					dp[i][j]=Integer.max(dp[i][j-1],dp[i-1][j]);
			}
		}
		
		return dp[m][n];
	}

}
