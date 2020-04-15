/*
  Complexity=O(no. of bits)
 */
package week1.bitwise;

public class CountSetBits {

	public static void main(String[] args) {
		count(26);
	}

	private static void count(int n) {
		int res=0;
//=====this while loop execute only for set bits. thats why complexity will be O(no. of bits)=======
		while(n>0){
			n=n&n-1;
			res++;
		}
		System.out.println(res);
	}
}