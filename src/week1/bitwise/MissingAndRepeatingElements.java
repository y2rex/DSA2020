

package week1.bitwise;

public class MissingAndRepeatingElements {

	public static void main(String[] args) {
		int arr[]={1,3,2,6,4,4};
		find(arr);
	}

	private static void find(int[] arr) 
	{
		int x=0;
		int y=0;
		
		int xor=arr[0];
		int n=arr.length;
		for(int i=1;i<n;i++)
			xor^=arr[i];
		for(int i=1;i<=n;i++)
			xor^=i;
		
		int rightMostBit=xor&~(xor-1);
		
		for(int i=0;i<n;i++)
		{
			if((arr[i]&rightMostBit)!=0)
				x^=arr[i];
			else
				y^=arr[i];
		}
		
		for(int i=1;i<=n;i++)
		{
			if((i&rightMostBit)!=0)
				x^=i;
			else
				y^=i;
		}
		System.out.println(x+"::"+y);
	}

	
}