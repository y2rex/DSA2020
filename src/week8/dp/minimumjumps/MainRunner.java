package week8.dp.minimumjumps;

public class MainRunner {

	public static void main(String[] args) {
		
		int arr[]={1,3,2,3,2,5};
		int res=minJump(arr,arr.length);
		System.out.println("Minimum jumps needed : "+res );

	}

	private static int minJump(int[] arr, int n) {
		
		int[] MJ=new int[n];
//Initializing MJ array		
		for(int i=1;i<n;i++)
			MJ[i]=Integer.MAX_VALUE;
		MJ[0]=0;
		
		for(int i=1;i<n;i++)
		{
			for(int j=0;j<i;j++)
			{
				if(i<=j+arr[j] && MJ[j]!=Integer.MAX_VALUE)
				{
					MJ[i]=Integer.min(MJ[i], MJ[j]+1);
					break;
				}
			}
		}
		
		return MJ[n-1];
	}
}