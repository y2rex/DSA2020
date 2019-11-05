package week1.recursion;

public class JosephusProblem {

	public static void main(String[] args) {
		
		int res=jos(4,2);
		System.out.println(res);

	}

	private static int jos(int n, int k) {
		if(n==1)
			return n;
		return (jos(n-1, k)+k-1)%n+1;
	}

}
