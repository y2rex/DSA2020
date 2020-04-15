package week1.recursion;

public class PossibleSubset {

	public static void main(String[] args) {
		String str="ABC";
		subset(str,0,"");

	}

	private static void subset(String str, int index, String curr_set) {

		if(index==str.length())
		{
			System.out.println(curr_set);
			return;
		}
		subset(str, index+1, curr_set);
		subset(str, index+1, curr_set+str.charAt(index));
	}
}