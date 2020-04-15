//**************Using Bit Masking*************

package week7.graph.travellingsalesman;

public class RecursiveApproach 
{
	static int n;
	static int graph[][];
	static int ans=Integer.MAX_VALUE;
	static int visitedAll;
	
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
		
		int res=tsp(0,1);
		System.out.println(res);
	}

	private static int tsp(int pos, int mask) 
	{
		if(mask==visitedAll && graph[pos][0]>0)
			return graph[pos][0];
		
		for(int city=0;city<n;city++)
		{
			if((mask&(1<<city))==0)	//checking for city is visited or not
			{
				int newAns=graph[pos][city]+tsp(city, mask|(1<<city));
				ans=Integer.min(ans,newAns);
			}
		}
		
		return ans;
		
	}
}