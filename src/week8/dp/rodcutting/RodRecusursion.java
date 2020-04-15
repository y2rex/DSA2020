package week8.dp.rodcutting;

public class RodRecusursion {

	public static void main(String[] args) {
		int x=23;
		int res=maxRope(x,9,11,12);
		System.out.println(res);

	}

	private static int maxRope(int x, int a, int b, int c) {

		if(x==0)
			return 0;
		if(x<0)
			return -1;
		int rodA=maxRope(x-a, a, b, c);
		int rodB=maxRope(x-b, a, b, c);
		int rodC=maxRope(x-c, a, b, c);
		
		int res=Integer.max(rodA, Integer.max(rodB, rodC));
		if(res==-1)
			return -1;
		else
			return res+1;
	}


}
