/*Given a rope of length and three values a,b&c.
We need to make max peices such every length is in set {a,b,c}*/
package week1.recursion;

public class MaxNumRope {

	public static void main(String[] args) {
		int x=23;
		int arr[]={9,11,12};
		int res=maxRope(x,arr);
		System.out.println(res);
	}

	private static int maxRope(int x, int[] arr) {
		if(x<0)
			return -1;
		if(x==0)
			return 0;
		int ca=maxRope(x-arr[0], arr);
		int cb=maxRope(x-arr[1], arr);
		int cc=maxRope(x-arr[2], arr);
		/*while we call method maxRope recursively "x-arr[0]" 
		its showing already it cut in one part thats why in return we added +1 */
		
//========max(ca,cb,cc)============
		int res=Math.max(Math.max(ca, cb), cc);
		if(res==-1)
			return -1;
		else
			return res+1;
	}
}