package week1.sorting;

public class CopyArray {

	public static void main(String[] args) {
		int arr[]={6,3,7,8,45,4};
		int high=arr.length-1;
		int mid=high/2;
		copy(arr,mid,high);

	}

	private static void copy(int[] arr, int mid,int high) {
		int n1=mid+1;
		int left[]=new int[n1];
		int n2=high-mid;
		int right[]=new int[n2];
		int a=0,b=0;
		    while(b<=mid)
		    	left[a++]=arr[b++];
		   for(int s : left)
			   System.out.print(s+"  ");
		   System.out.println();
		   System.out.println();
		   
		   int c=0,d=mid+1;
		    while(d<=high)
		    	right[c++]=arr[d++];
		   for(int t : right)
			   System.out.print(t+"  ");
	}

}
