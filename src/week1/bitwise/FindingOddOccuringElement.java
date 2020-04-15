/*In an given array there is all elements have even 
count except one element.Find that element */

package week1.bitwise;

public class FindingOddOccuringElement {

	public static void main(String[] args) {
		int arr[]={1,2,1,3,4,3,4};
		find(arr);

	}

	private static void find(int[] arr) {
		int a=0;
		for(int i=0;i<arr.length;i++)
			a=a^arr[i];
		
		if(a!=0)
			System.out.println("Odd time occuring element : "+a);
		else
			System.out.println("NO element occuring odd times...");
	}

}
