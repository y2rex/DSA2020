package week8.dp.editdistanceproblem;

//minimum number of operations required to convert s1 to s2

public class EDRecursion {

	public static void main(String[] args) 
	{
	String s1="geeks";
	String s2="geek";

	int res=ed(s1,s2,s1.length(),s2.length());
	System.out.println(res);
	}

	private static int ed(String s1, String s2, int m, int n) {
		
		if(m==0)
			return n;
		if(n==0)
			return m;
		
		if(s1.charAt(m-1)==s2.charAt(n-1))
			return ed(s1, s2, m-1, n-1);
		
		
		return 1+Integer.min(Integer.min(ed(s1, s2, m-1, n-1),
				ed(s1, s2, m-1, n)),ed(s1, s2, m, n-1));
	}

}
/*
ed(s1, s2, m, n-1)  insert last char to s1
ed(s1, s2, m-1, n)) delete last char from s1
ed(s1, s2, m-1, n-1) replace last char from s1*/
