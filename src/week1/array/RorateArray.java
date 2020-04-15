//============rotate an array counter clock wise by 2 unit===========
package week1.array;

public class RorateArray {

	public static void main(String[] args) {
	  int arr[]={5,8,10,12,15};
	  rotate(arr,2);             //====here 2 showing unit of element=========
	}

	private static void rotate(int[] arr, int x) {
		  int arr1[]=new int[x];
		  int i=0,j=0,k=0;
/*I stored {5,8} in arr1 array then shifted the remiang 
elements of arr{10,12,15} left by 1.It means we need O(x)
extra space.
          Time complexity will be : O(n)+O(x)
*/		  

//storing 5&8 		  
		  while(i<x){
			  arr1[i]=arr[i++];
		  }
//sifting remaining array left		  
		  while(x<arr.length){
			 arr[j++]=arr[x++]; 
		  }
//appending 5&8 to resultant array		  
		  while(j<arr.length){
			arr[j++]=arr1[k++];  
		  }
	     for(int l :arr)
	    	 System.out.print(l+" ");
	}

}
