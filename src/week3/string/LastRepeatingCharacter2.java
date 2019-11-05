/*O(n)+2traverssal*/

package week3.string;

public class LastRepeatingCharacter2 {

	public static void main(String[] args) {
		String str="geeksforgeeks";
		last(str);

	}

	private static void last(String str) {
		int res=0;
		int count[]=new int[256];
		for(int i=0;i<str.length();i++)
			count[str.charAt(i)]++;
		
		for(int i=str.length()-1;i>=0;i--)
		{
			if(count[str.charAt(i)]>1){
				res=str.charAt(i);
				break;
			}
		}
		System.out.println((char)res);
		
	}

}
