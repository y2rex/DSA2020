package week1.recursion;

public class SumSet {

	public static void main(String[] args) {
		StringBuffer sb=new StringBuffer();
		int arr[]={2,3,4,5,6};
        set(arr,9,5,sb);
	}

	private static void set(int[] arr, int sum, int n,StringBuffer sb) {
      
        if(sum==0)
        {
        	for(int i=0;i<sb.length();i++)
        		System.out.print(sb.charAt(i)+" ");
        	System.out.println();
        	System.out.println("============");
        	return;
        }
        if(n==0)
        	return;
        
        set(arr,sum,n-1,sb);
/* Now, we want a StringBuffer which holds "sb" value 
   and apend the arr[n-1] */
        set(arr,sum-arr[n-1],n-1,sb.append(arr[n-1]));
        sb.delete(sb.length()-1, sb.length());   //just removing last element which we added(backtracking)
	}
}