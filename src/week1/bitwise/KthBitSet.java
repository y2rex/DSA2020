/*find our in given number, 
Kth bit set or not*/

package week1.bitwise;

public class KthBitSet {

	public static void main(String[] args) {
		set(5,2);
		//set(5,1);
	}

	private static void set(int num, int k) {
		int n=1<<k-1;
        if((num&n)!=0)
        	System.out.println(k+" th bit set");
        else
        	System.out.println(k+" th bit not set");
		
	}

}
