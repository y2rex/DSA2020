package week3.string;

public class PatternSearch2 {

	public static void main(String[] args) {
		String txt="geeksforgeeks";
		String pat="for";
		search(txt,pat);
	}

	private static void search(String txt, String pat) {
		int a=txt.indexOf(pat);
		if(a!=-1)
			System.out.println("found...");
		else
			System.out.println("not found...");
	}

}
