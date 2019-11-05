package week3.hashing;

public class ZeroSum1 {

	public static void main(String[] args) {

		int arr[]={5,6,-4,-2,8,10};
		boolean res=sumZero(arr);
		System.out.println(res);
	}

//=====naive method having complexity O(n2)================
	private static boolean sumZero(int[] arr) {

		for(int i=0;i<arr.length;i++)
		{
			int sum=arr[i];
			for(int j=i+1;j<arr.length;j++)
			{
				sum+=arr[j];
				if(sum==0)
					return true;
			}
		}
		return false;
	}

}
