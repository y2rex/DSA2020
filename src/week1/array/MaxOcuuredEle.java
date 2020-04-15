package week1.array;

public class MaxOcuuredEle {

	public static void main(String[] args) {
		int L[]=new int[]{2, 1, 3};
		int R[]=new int[]{5, 3, 9};
		
		int res=findMax(L,R);
		System.out.println(res);
	}

	private static int findMax(int[] l, int[] r) 
	{
		int n=l.length;
		int res[]=new int[115];
		
		for(int i=0;i<n;i++)
		{
			res[l[i]]=1;
			res[r[i]+1]=-1;
		}
		
		for(int a : res)
			System.out.print(a+" ");
System.out.println("\n=========================");		
		int preSum=0;
		for(int i=0;i<res.length;i++)
		{
			preSum+=res[i];
			res[i]=preSum;
		}
			
		for(int a : res)
			System.out.print(a+" ");
		return 0;
	}

}
