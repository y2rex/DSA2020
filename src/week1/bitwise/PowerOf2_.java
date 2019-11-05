/*find out given number is power of 2
is true or false*/
package week1.bitwise;

public class PowerOf2_ {

	public static void main(String[] args) {
		power(8);
//=======power of 2 has always only one bit set & remaining bits are 0=============		
	}

	private static void power(int n) {
		/*
		 * n=0000....100
		   n-1=00....011
		   by doing (n-1),all left bits going to set after set bit in given number
		 */
		
		if((n&(n-1))!=0)
			System.out.println("false");
		else
			System.out.println("true");
		
	}
}