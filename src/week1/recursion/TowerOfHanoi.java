package week1.recursion;

public class TowerOfHanoi {

	public static void main(String[] args) {
		
		
		TOH(4,"A","C","B");//A-->from,B-->Auxliary,C--.destination

	}

	private static void TOH(int n, String from, String to, String auxliary) {
		if(n==0)
			return;
		TOH(n-1,from,auxliary,to);
		System.out.println(n+"th disk from "+from+" to "+to);
		TOH(n-1, auxliary, to, from);
	}

}
