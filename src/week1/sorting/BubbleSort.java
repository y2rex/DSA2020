package week1.sorting;

public class BubbleSort {

	public static void main(String[] args) {
		int arr[]={20,10,5,15};
		sort(arr);
	}

	private static void sort(int[] arr) {
	   int n=arr.length;
	   for(int i=0;i<n-1;i++)
	   {
		   for(int j=i+1;j<n;j++)
		   {
			   if(arr[i]>arr[j])
			   {
				   int temp=arr[i];
				   arr[i]=arr[j];
				   arr[j]=temp;
			   }
		   }
	   }
	   for(int x :arr)
		   System.out.print(x+" ");	
	}
}