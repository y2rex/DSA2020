package week1.recursion;

public class FacotialNTailRecursion {

	public static void main(String[] args) {
		int res=fact(5,1);
		System.out.println(res);
	}

	private static int fact(int i,int res) {		
		if(i==1)
			return res;
		return fact(i-1,i*res); //tail recursion
	}
}