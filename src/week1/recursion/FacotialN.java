package week1.recursion;

public class FacotialN {

	public static void main(String[] args) {
		int res=fact(5);
		System.out.println(res);
	}

	private static int fact(int i) {		
		if(i==1)
		  return 1;
	
		return i*fact(i-1); //not tail recursion
	}
}