/*
 * O(n)+ 2traversal of given string*/

package week3.string;

public class FirstRepeatingCharacter2 {

	public static void main(String[] args) {
		String str="zgeeksforgaeeks";
		first(str);

	}

	private static void first(String str) {
		int count[]=new int[256];
		int res=0;
		    for(int i=0;i<str.length();i++)
		    	count[str.charAt(i)]++;
		    for(int i=0;i<str.length();i++)
		    {
		    	if(count[str.charAt(i)]>1)
		    	{
		    		res=str.charAt(i);
		    		break;
		    	}
		    }
			System.out.println((char)res);
	}

}
