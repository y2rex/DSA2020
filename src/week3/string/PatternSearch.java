package week3.string;

public class PatternSearch {

	public static void main(String[] args) {
		String txt="geeksrofgeeks";
		String pat="for";
		search(txt,pat);
	}

	private static void search(String txt, String pat) {
		
		boolean isFind=false;
		for(int i=0;i<=(txt.length()-pat.length());i++)
		{
			String str=txt.substring(i,i+pat.length());
			System.out.println(str+"->"+pat);
			
			if(str.equals(pat))
			{
				isFind=true;
			break;
			}
		}
	
		if(isFind)
			System.out.println("Found...");
		else
			System.out.println("Not found...");
	}

}
