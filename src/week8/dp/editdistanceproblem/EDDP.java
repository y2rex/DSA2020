package week8.dp.editdistanceproblem;

public class EDDP {

	public static void main(String[] args) 
	{
	String s1="geeks";
	String s2="geek";

	int res=ed(s1,s2,s1.length(),s2.length());
	System.out.println(res);
	}

	private static int ed(String s1, String s2, int m, int n) {
		int dp[][]=new int[m+1][n+1];
		
		for(int i=0;i<=m;i++)
		{
			for(int j=0;j<=n;j++)
			{
				if(i==0)
					dp[i][j]=j;
				else if(j==0)
					dp[i][j]=i;
				
				else if(s1.charAt(i-1)==s2.charAt(j-1))
					dp[i][j]=dp[i-1][j-1];
				else
					dp[i][j]=1+Integer.min(dp[i-1][j-1], Integer.min(dp[i][j-1],dp[i-1][j]));
					
			}
		}
		return dp[m][n];
	}

}
/*
ed(s1, s2, m, n-1)  insert last char to s1
ed(s1, s2, m-1, n)) delete last char from s1
ed(s1, s2, m-1, n-1) replace last char from s1*/
