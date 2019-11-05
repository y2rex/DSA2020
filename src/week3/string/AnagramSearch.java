/*
  O(n*(m-n))
 */

package week3.string;

public class AnagramSearch {

	public static void main(String[] args) {
		String txt="geeksrofgeeks";
		String pat="for";
		search(txt,pat);
	}

	private static void search(String txt, String pat) {
		
		int count2[]=new int[256];
		for(int i=0;i<pat.length();i++)
			count2[pat.charAt(i)]++;
     	
		boolean isFind=false;
		for(int i=0;i<=(txt.length()-pat.length());i++)
		{
			int count1[]=new int[256];
			String str=txt.substring(i,i+pat.length());
			
			for(int j=0;j<str.length();j++)
				count1[str.charAt(j)]++;
			
				for(int k=0;k<256;k++)
				{
					if(count1[k]!=count2[k])
					{
						isFind=false;
					    break;
					}
					else
						isFind=true;
					}	
			
			if(isFind)
				break;
		}
		if(isFind){
			System.out.println("found");
		}
		else
			System.out.println("not found");
		
	}
}
