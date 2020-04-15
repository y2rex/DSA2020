/*find out given number is power of 2
is true or false*/
package week1.bitwise;

public class PowerOf2 {

	public static void main(String[] args) {
		
		power(18);
	}

	private static void power(int num) {
		boolean isPower=true;
		while(num%2==0)
			num=num/2;
		
		if(num!=1)
			isPower=false;
		
		if(isPower)
			System.out.println("true");
		else
			System.out.println("false");
	}
}