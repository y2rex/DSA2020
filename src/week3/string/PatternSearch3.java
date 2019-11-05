package week3.string;

public class PatternSearch3 {

	public static void main(String[] args) {
		String txt="geeksforgeeks";
		String pat="for";
		search(txt,pat);
	}

	private static void search(String txt, String pat) {
		
		System.out.println(txt.contains(pat));
		
	}
	

}
