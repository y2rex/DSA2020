//********Naive method: O(n2)************

package week1.array;

public class TrappingWater {

	public static void main(String[] args) {
		int arr[]={3, 0, 0, 2, 0, 4};
		trap(arr,arr.length);

	}

	private static void trap(int[] arr, int n) {
		int sum=0;
		for(int i=1;i<n-1;i++){
			int left=0;
			int right=0;
			int l=i,r=i;
			
			while(l>=0){
				left=Math.max(left, arr[l]);
				l--;
			}
			while(r<n){
				right=Math.max(right, arr[r]);
				r++;
			}
			
		sum+=Math.min(left,right)-arr[i];
		}
		System.out.println(sum);
	}

}
