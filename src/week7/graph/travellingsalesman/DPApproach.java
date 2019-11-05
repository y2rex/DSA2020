//**************top down approach*************

package week7.graph.travellingsalesman;

public class DPApproach 
{
	static int n;
	static int graph[][];
	static int ans=Integer.MAX_VALUE;
	static int visitedAll;
	static int dp[][];
	
	public static void main(String[] args) 
	{
		 graph= new int[][]
			{
		        {0,20,42,25},
		        {20,0,30,34},
		        {42,30,0,10},
		        {25,34,10,0}
			};
		n=graph.length;
		visitedAll=(1<<n)-1;
		dp=new int[n*n][n];		//dp[16][4]
		
		for(int i=0;i<n*n;i++)
			for(int j=0;j<n;j++)
				dp[i][j]=-1;
		
		int res=tsp(0,1);
		System.out.println(res);
	}

	private static int tsp(int pos, int mask) 
	{
		if(mask==visitedAll && graph[pos][0]>0)
			return graph[pos][0];
		
		if(dp[mask][pos]!=-1)
			return dp[mask][pos];
		
		for(int city=0;city<n;city++)
		{
			if((mask&(1<<city))==0)	//checking for city is visited or not
			{
				int newAns=graph[pos][city]+tsp(city, mask|(1<<city));
				ans=Integer.min(ans,newAns);
			}
		}
		
		return dp[mask][pos]=ans;		//assigning into dp table and return
		
	}
}