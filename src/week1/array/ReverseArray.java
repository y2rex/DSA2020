package week1.array;

public class ReverseArray {

	public static void main(String[] args) {
		int arr[]={1,2,3,4,5,6,7};
        reverse(arr);
	}

	private static void reverse(int[] arr) {
		int low=0;
		int high=arr.length-1;
//=============swap first element to last ....so on.....==============
		/*while(low<arr.length/2){
			int temp=arr[low];
			arr[low]=arr[arr.length-1-low];
			arr[arr.length-1-low]=temp;
			low++;
		}*/
		
		while(low<high){
			int temp=arr[low];
			arr[low]=arr[high];
			arr[high]=temp;
			low++;
			high--;
		}
		for(int k: arr)
			System.out.print(k+" ");
	}

}
