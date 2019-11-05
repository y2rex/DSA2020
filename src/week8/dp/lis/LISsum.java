package week8.dp.lis;

public class LISsum {

	public static void main(String[] args) {
		
		int arr[]={3,4,2,8,10};
		int n=arr.length;
		
		int res=lisSum(arr,n);
		System.out.println(res);
	}

	private static int lisSum(int[] arr, int n)
	{
		int lis[]=new int[n];
		
		for(int i=0;i<n;i++)
		{
			lis[i]=arr[i];
			for(int j=0;j<i;j++)
			{
				if(arr[j]<arr[i])
				{
					lis[i]=Integer.max(lis[i], lis[j]+arr[i]);
				}
			}
		}
		
		int res=-1;
		for(int a : arr)
			System.out.print(a+" ");
		System.out.println("\n================");
		for(int a : lis)
			System.out.print(a+" ");
		System.out.print("\nMaximum increasing sum: ");		
		for(int a : lis)
			if(a>res)
				res=a;
		return res;
	}

}
