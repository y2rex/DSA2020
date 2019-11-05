package week1.sorting;

public class MergeSort {

	public static void main(String[] args) {
		int arr[]={6,3,7,8,45,4};
		sort(arr,0,arr.length-1);
		for(int a: arr)
			System.out.print(a+" ");

	}

	private static void sort(int[] arr, int low, int high) {
          if(low<high)
          {
        	  int mid=low+(high-low)/2;
        	  sort(arr, low, mid);
        	  sort(arr, mid+1, high);
        	  merge(arr,low,mid,high);	  
          }
	}

	private static void merge(int[] arr,int low, int mid, int high) {

//================fetching left array===================================
		int n1=mid+1;
		int left[]=new int[n1];
		   int x=0,y=0;
		   while(y<=mid)
			   left[x++]=arr[y++];

//================fetching right array===================================		 
		int n2=high-mid;
		int right[]=new int[n2];
		 int a=0,b=mid+1;
		   while(b<=high)
			   right[a++]=arr[b++];
//====================main logic===========================================		   
		int i=0,j=0,k=0;
		
		while(i<n1&&j<n2)
		{
			if(left[i]<right[j])
				arr[k++]=left[i++];
			else
				arr[k++]=right[j++];
		}
		while(i<n1)
			arr[k++]=left[i++];
		while(j<n2)
		    arr[k++]=right[j++];
		
		
	}

}
