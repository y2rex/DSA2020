/*In an given array there is all elements have even 
count except two elements.Find that element */

package week1.bitwise;

public class FindingOddOccuringElement2 {

	public static void main(String[] args) {
		int arr[]={1,3,1,5,4,4};
		find(arr);
	}

	private static void find(int[] arr) {
		int res=0;
		
		for(int a : arr)
			res=res^a;
		
		int rightMostBit=res&(~(res-1));
		
		int x=0;
		int y=0;
		
		for(int a : arr){
			
			if((a&rightMostBit)!=0)
				x=x^a;
			else
				y=y^a;
		}
		
		System.out.println(x+" ,"+y);
	}

	
}