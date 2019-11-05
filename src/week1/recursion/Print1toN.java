package week1.recursion;

public class Print1toN {

	public static void main(String[] args) {
		
		number(10);
	}

	private static void number(int i) {
		if(i<0)
			return;
		number(i-1);          //not tail resursion
		System.out.println(i);
	}

}
