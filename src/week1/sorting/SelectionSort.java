package week1.sorting;

public class SelectionSort {

	public static void main(String[] args) {
		int arr[]={20,10,5,15};
		sort(arr);
	}

	private static void sort(int[] arr) {
		int n=arr.length;
	/*	int l=n-1;
		
		for(int i=0;i<n;i++)
		{
			int max=Integer.MIN_VALUE,k=-1;
			for(int j=0;j<n-i;j++){
				if(max<arr[j]){
					max=arr[j];
					k=j; 
				}
			}
			  arr[k]=arr[l];
			  arr[l]=max;
			  l--;
			  
		}*/
		
		for(int i=n-1;i>0;i--)
		{
			int max=Integer.MIN_VALUE,index=-1;
			
			for(int j=0;j<=i;j++)
			{
				if(arr[j]>max)
				{
					max=arr[j];
					index=j;
				}
			}
			int temp=arr[i];
			arr[i]=max;
			arr[index]=temp;
		}
		
		for(int x :arr)
			System.out.print(x+" ");
	}
}