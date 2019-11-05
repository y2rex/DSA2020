package week8.dp.lis;

public class LISDP {

	public static void main(String[] args) {
		
		//int arr[]={5,4,3,2,1};   O/P: 1
		//int arr[]={1,2,3,4,5};   O/P: 5
		int arr[]={3,4,2,8,10}; 
		int n=arr.length;
		
		int res=lis(arr,n);
		System.out.println(res);
	}

	private static int lis(int[] arr, int n) 
	{
		int lis[]=new int[n];
		/*for(int i=0;i<n;i++)
			lis[i]=1;*/
		
		for(int i=0;i<n;i++)
		{
			lis[i]=1;		//initializing the lis array
			for(int j=0;j<i;j++)
				if(arr[j]<arr[i])
					lis[i]=Integer.max(lis[i], lis[j]+1);
			
		}
		
		int res=-1;
		for(int a : lis)
			if(a>res)
				res=a;
		
		return res;
	}

}
