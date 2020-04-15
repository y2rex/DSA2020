//Naive method**********************

package week1.bitwise;

public class CountSetBits2 {

	public static void main(String[] args) {
		
		int a=26;
		int res=setBits(a);
		System.out.println("Set bits is/are : "+res);

	}

	private static int setBits(int n) {
		int count=0;
		int requiredBit=0;
		int temp=n;
		int i=0;
		
		if(n%4!=0)
			requiredBit=1;
		
		while(temp>=2){
			temp=temp/2;
			requiredBit++;
		}
		
		System.out.println("Required bits : "+requiredBit);
		
//*********************O(n)***********************		
		while(i<requiredBit){
			if( (n&(1<<i))!=0)
				count++;
			i++;
		}
		
		
		return count;
	}

}
