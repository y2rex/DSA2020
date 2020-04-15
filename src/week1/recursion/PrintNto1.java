package week1.recursion;

public class PrintNto1 {

	public static void main(String[] args) {
		
		number(10);
	}

	private static void number(int i) {
		if(i<0)
			return;
		System.out.println(i);
		number(i-1);           //tail recursion
	}
}