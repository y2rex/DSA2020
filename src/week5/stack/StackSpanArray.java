package week5.stack;

public class StackSpanArray {

	public static void main(String[] args) {

		int prices[]={10,5,2,7,18,15,16,17};
		for(int a : prices)
			System.out.print(a+" ");
		System.out.println();
		spanMethod(prices);
		spanMethod2(prices);
	}

private static void spanMethod2(int[] prices) 
	{
		int n=prices.length;
		int res[]=new int[n];
		res[0]=1;
		
		for(int i=n-1;i>0;i--)
		{
			for(int j=i;j>=0;j--)
				if(prices[j]<=prices[i])
					res[i]++;
				else
					break;
			
		}
			
		System.out.println("\n=========================");
		for(int a : res)
			System.out.print(a+" ");
	}

//***********1st solution : Naive Method*******(O(n2))***********	
	private static void spanMethod(int[] prices) {
		int l=0;
		int res[]=new int[prices.length];
		
		for(int i=prices.length-1;i>0;i--)
		{
				int temp=prices[i];
				int count=1;
				int j=i-1;
				
				while(j>=0&&prices[j]<temp){
					count++;
					j--;
				}
					res[l++]=count;
		}
		res[l]=1;//for leftmost element
		
		while(l>=0)
			System.out.print(res[l--]+" ");	
		
	}

}
